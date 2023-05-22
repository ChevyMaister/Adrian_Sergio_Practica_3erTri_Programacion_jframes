package adrian_sergio_practica_3ertri_programacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class GestionesDeBD {

    private String puerto = "3306";
    private String ip = "localhost";
    private String usuario = "root";
    private String passw = "";
    private String db = "";
    private Connection conn = null;

    public GestionesDeBD(String ip, String port, String user, String psw, String db) {
        this.puerto = port;
        this.ip = ip;
        this.usuario = user;
        this.passw = psw;
        this.db = db;
        conectar();
    }

    /**
     * Constructor de la clase que establece los parámetros de conexión por
     * defecto y realiza la conexión a la base de datos.
     */
    public GestionesDeBD() {
        conectar();
    }

    /**
     * Método que establece la conexión a la base de datos.
     */
    public void conectar() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mariadb://" + this.ip + ":" + this.puerto + "/" + this.db, this.usuario, this.passw);
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }

    /**
     * Método que lee los datos de configuración desde un archivo y los utiliza
     * para establecer los parámetros de conexión.
     *
     * @param fichero La ruta del archivo que contiene los datos de
     * configuración.
     */
    public void Datos(String fichero) {//introducir DatosDeBBDD 
        FileReader reader = null; //para leer el fichero de texto 
        BufferedReader bufferedReader = null;
        String line; // para guardar cada linea del fichero
        HashMap<String, String> parametros = new HashMap<String, String>(); // para guardar los datos de configuracion del fichero 
        try {
            reader = new FileReader(fichero); // Abre el archivo para lectura
            bufferedReader = new BufferedReader(reader); // Crea un lector de texto para leer el archivo línea por línea
            int cont = 1;
            while ((line = bufferedReader.readLine()) != null) { // Lee cada línea del archivo
                System.out.println("num linea " + cont + " " + line); // Imprime el número de línea y su contenido
                cont++;
                line = line.trim();
                if (line.length() != 0) { // Verifica si la línea no está vacía
                    String valores[] = line.split("="); // Divide la línea en dos partes separadas por el signo "="
                    if (valores.length == 2) { // Si se encontraron dos partes 
                        if (parametros.containsKey(valores[0])) { // Verifica si la clave ya existe en el mapa de parámetros
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        } else {
                            parametros.put(valores[0].trim(), valores[1].trim()); // Agrega la clave y el valor al mapa de parámetros
                        }
                    } else if (valores.length == 1) { // Si se encontró solo una parte 
                        if (parametros.containsKey(valores[0])) { // Verifica si la palabra ya existe en el mapa de parámetros
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        } else {
                            parametros.put(valores[0].trim(), ""); // Agrega la palabra al mapa de parámetros con un valor vacío
                        }
                    }
                }
            }

            // Procesa los parámetros obtenidos del archivo
            for (String clave : parametros.keySet()) {
                System.out.println(clave + ":" + parametros.get(clave)); // Imprime cada variable y su valor correspondiente
                switch (clave) {
                    case "ip":
                        this.ip = parametros.get(clave); // Actualiza el valor de la dirección IP
                        break;
                    case "puerto":
                        this.puerto = parametros.get(clave); // Actualiza el valor del puerto
                        break;
                    case "usuario":
                        this.usuario = parametros.get(clave); // Actualiza el valor del usuario
                        break;
                    case "password":
                        this.passw = parametros.get(clave); // Actualiza el valor de la contraseña
                        break;
                    case "db":
                        this.db = parametros.get(clave); // Actualiza el valor de la base de datos
                        break;
                }
            }
        } catch (IOException e) {
            // e.printStackTrace();
        } finally {
            try {
                bufferedReader.close(); // Cierra el lector de texto
                reader.close(); // Cierra el archivo
            } catch (IOException ex) {
                // ex.printStackTrace();
            }
        }

        conectar(); // Vuelve a conectar a la base de datos utilizando los nuevos parámetros obtenidos del archivo
    }

    /**
     * Crea la base de datos y las tablas necesarias si no existen.
     */
    public void crearDB() {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();

            // Crea la base de datos si no existe y la utiliza
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

            // Crea la tabla ALUMNOS si no existe
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ALUMNOS("
                    + "   dni CHAR(9)  NOT NULL,"
                    + "   Nombre VARCHAR(40) NOT NULL,"
                    + "   Apellido VARCHAR(35) NOT NULL,"
                    + "   Correo VARCHAR(25) NOT NULL,"
                    + "   Telefono CHAR(9) NOT NULL,"
                    + "   PRIMARY KEY (dni)"
                    + ");");

            // Crea la tabla CURSOS si no existe
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS CURSOS("
                    + "   Nombre VARCHAR(20) NOT NULL,"
                    + "   Descripcion VARCHAR(40) NOT NULL,"
                    + "   NumeroHoras VARCHAR(35) NOT NULL,"
                    + "   PRIMARY KEY (Nombre)"
                    + ");");

            // Crea la tabla INSCRIPCIONES si no existe
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS INSCRIPCIONES("
                    + "   dniAlumno CHAR(9),"
                    + "   nombreCurso VARCHAR(20),"
                    + "   FOREIGN KEY(dniAlumno) REFERENCES ALUMNOS(dni),"
                    + "   FOREIGN KEY(nombreCurso) REFERENCES CURSOS(Nombre),"
                    + "   PRIMARY KEY (dniAlumno, nombreCurso),"
                    + "   fechaInicio DATE NOT NULL,"
                    + "   fechaFin DATE,"
                    + "   calificacion FLOAT(4,2)"
                    + ");");

            this.conn.commit(); // Confirma los cambios en la base de datos

        } catch (SQLException | NullPointerException ex) {
            // ex.printStackTrace();
        }
        // No hace nada en caso de NullPointerException
         finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {

            }
        }
    }

    /**
     * Inserta un nuevo curso en la base de datos.
     *
     * @param nombre Nombre del curso.
     * @param descripcion Descripción del curso.
     * @param numHoras Número de horas del curso.
     */
    public void insertarCurso(String nombre, String descripcion, int numHoras) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("INSERT INTO CURSOS VALUES ('" + nombre + "','" + descripcion + "','" + numHoras + "')");

            this.conn.commit();
        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Inserta un nuevo alumno en la base de datos.
     *
     * @param dni DNI del alumno.
     * @param nombre Nombre del alumno.
     * @param apellido Apellido del alumno.
     * @param correo Correo electrónico del alumno.
     * @param telefono Teléfono del alumno.
     */
    public void insertarAlumno(String dni, String nombre, String apellido, String correo, String telefono) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("INSERT INTO ALUMNOS VALUES ('" + dni + "','" + nombre + "','" + apellido + "','" + correo + "','" + telefono + "')");

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Inserta una nueva inscripción en la base de datos con la fecha de inicio
     * actual.
     *
     * @param nombreCurso Nombre del curso.
     * @param dniAlumno DNI del alumno.
     */
    public void insertarInscripcion(String nombreCurso, String dniAlumno) {
        Statement stmt = null;
        long miliseconds = System.currentTimeMillis();
        Date fecha = new Date(miliseconds);
        System.out.println(fecha);
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("INSERT INTO INSCRIPCIONES (dniAlumno, nombreCurso, fechaInicio) VALUES ('" + dniAlumno + "','" + nombreCurso + "','" + fecha + "')");

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Inserta una nueva inscripción en la base de datos con los datos
     * proporcionados.
     *
     * @param dniAlumno DNI del alumno.
     * @param nombreCurso Nombre del curso.
     * @param inicio Fecha de inicio de la inscripción.
     * @param fin Fecha de fin de la inscripción.
     * @param nota Calificación de la inscripción.
     */
    public void insertarInscSerializada(String dniAlumno, String nombreCurso, String inicio, String fin, float nota) {
        Statement stmt = null;

        System.out.println(dniAlumno + " " + nombreCurso + " " + inicio + " " + fin + " " + nota);
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("INSERT INTO INSCRIPCIONES (dniAlumno, nombreCurso, fechaInicio, fechaFin, calificacion) VALUES ('" + dniAlumno + "','" + nombreCurso + "','" + inicio + "','" + fin + "','" + nota + "')");

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Inserta una nueva inscripción en la base de datos sin fecha de fin ni
     * calificación.
     *
     * @param dniAlumno DNI del alumno.
     * @param nombreCurso Nombre del curso.
     * @param inicio Fecha de inicio de la inscripción.
     */
    public void insertarInscSerializadaNoFinalizada(String dniAlumno, String nombreCurso, String inicio) {
        Statement stmt = null;

        System.out.println(dniAlumno + " " + nombreCurso + " " + inicio);
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("INSERT INTO INSCRIPCIONES (dniAlumno, nombreCurso, fechaInicio) VALUES ('" + dniAlumno + "','" + nombreCurso + "','" + inicio + "')");

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Borra un curso de la base de datos. Si se proporciona el valor "TODO"
     * como nombre, se borran todos los cursos.
     *
     * @param nombre Nombre del curso a borrar o "TODO" para borrar todos los
     * cursos.
     */
    public void borrarCurso(String nombre) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            if (nombre.equals("TODO")) {
                stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
                stmt.executeUpdate("DELETE FROM CURSOS");
                this.conn.commit();
            } else {
                stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
                stmt.executeUpdate("DELETE FROM CURSOS WHERE Nombre='" + nombre + "'");
            }
            this.conn.commit();
        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Borra un alumno de la base de datos. Si se proporciona el valor "TODO"
     * como DNI, se borran todos los alumnos.
     *
     * @param dni DNI del alumno a borrar o "TODO" para borrar todos los
     * alumnos.
     */
    public void borrarAlumno(String dni) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            if (dni.equals("TODO")) {
                stmt.executeUpdate("DELETE FROM ALUMNOS");
            } else {
                stmt.executeUpdate("DELETE FROM ALUMNOS WHERE dni='" + dni + "'");
            }
            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Borra inscripciones de la base de datos según el DNI y el curso
     * proporcionados. Si se proporciona el valor "TODO" como DNI o curso, se
     * borran todas las inscripciones.
     *
     * @param dni DNI del alumno de las inscripciones a borrar o "TODO" para
     * borrar todas las inscripciones.
     * @param curso Nombre del curso de las inscripciones a borrar o "TODO" para
     * borrar todas las inscripciones.
     */
    public void borrarInscripciones(String dni, String curso) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            if (dni.equals("TODO") && curso.equals("TODO")) {
                stmt.executeUpdate("DELETE FROM Inscripciones");
            } else if (curso.equals("TODO")) {
                stmt.executeUpdate("DELETE FROM Inscripciones WHERE dniAlumno='" + dni + "'");
            } else if (dni.equals("TODO")) {
                stmt.executeUpdate("DELETE FROM Inscripciones WHERE nombreCurso='" + curso + "'");
            } else {
                stmt.executeUpdate("DELETE FROM Inscripciones WHERE nombreCurso='" + curso + "' AND dniAlumno = '" + dni + "'");
            }
            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * METODO PARA BUSCAR DATOS DENTRO DE LA BASE DE DATOS
     *
     * @param dato - parametro para introducir el dato que buscas
     * @param nombreTabla - parametro para concretar la tabla donde buscar
     * @param nombreColumna - parametro para concretar la columna de la tabla
     * donde buscar el dato
     * @return
     */
    public boolean buscar(String dato, String nombreTabla, String nombreColumna) {//devuelve true si el dato introducido en la tabla introducida existe
        String campo;
        boolean encontrado = false;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            rs = stmt.executeQuery("SELECT * FROM " + nombreTabla);

            while (rs.next()) {
                campo = rs.getString(nombreColumna);
                if (campo.equalsIgnoreCase(dato)) {
                    encontrado = true;
                }
            }
            this.conn.commit();

        } catch (SQLException ex) {
            //   ex.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (SQLException e) {

                //   e.printStackTrace();
            }

        }
        return encontrado;
    }

    /**
     * Modifica un valor en una columna específica de una tabla en la base de
     * datos.
     *
     * @param clave Valor clave para identificar la fila a modificar.
     * @param columnaClave Nombre de la columna que contiene la clave.
     * @param nombreTabla Nombre de la tabla en la que se realizará la
     * modificación.
     * @param columnaCambio Nombre de la columna a modificar.
     * @param nuevoValor Nuevo valor a asignar a la columna
     *
     * .
     */
    public void modificar(String clave, String columnaClave, String nombreTabla, String columnaCambio, String nuevoValor) {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            rs = stmt.executeQuery("SELECT * FROM " + nombreTabla);
            stmt.executeUpdate("UPDATE " + nombreTabla + " SET " + columnaCambio + " = '" + nuevoValor + "' WHERE " + columnaClave + " = '" + clave + "';");
            this.conn.commit();
        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Asigna una calificación a un alumno en un curso específico en la tabla de
     * inscripciones.
     *
     * @param claveAlumno Valor clave del alumno.
     * @param claveCurso Valor clave del curso.
     * @param nuevoValor Nuevo valor de la calificación.
     */
    public void calificar(String claveAlumno, String claveCurso, float nuevoValor) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("UPDATE inscripciones SET calificacion = '" + nuevoValor + "' WHERE dniAlumno = '" + claveAlumno + "' AND nombreCurso = '" + claveCurso + "';");
            stmt.executeUpdate("UPDATE inscripciones SET fechaFin = CURRENT_DATE() WHERE dniAlumno = '" + claveAlumno + "' AND nombreCurso = '" + claveCurso + "';");
            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                stmt.close();
               
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }
    }

    /**
     * Devuelve un array de Strings que contiene los registros de una tabla
     * específica en la base de datos.
     *
     * @param dato Valor para buscar en la columna especificada.
     * @param nombreTabla Nombre de la tabla en la que se realizará la búsqueda.
     * @param nombreColumnaBuscar Nombre de la columna en la que se buscará el
     * valor especificado.
     * @param nombreColumnaImprimir Nombre de la columna que se desea imprimir
     * en los resultados. Si está vacío, se imprimirán todas las columnas.
     * @return Array de Strings que contiene los registros completos que cumplen
     * con los criterios de búsqueda.
     */
    public String[] imprimir(String dato, String nombreTabla, String nombreColumnaBuscar, String nombreColumnaImprimir) {
        // Verificar si nombreColumnaImprimir está vacío y asignar "*" como valor predeterminado
        if (nombreColumnaImprimir.equals("")) {
            nombreColumnaImprimir = "*";
        }

        // Crear una lista para almacenar los registros obtenidos
        ArrayList<String> registroCompleto = new ArrayList<>();
        String registroIndividual = ""; // Variable para construir cada registro individual
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

            // Construir y ejecutar la consulta SQL basada en los parámetros proporcionados
            if (!dato.equals("*")) {
                rs = stmt.executeQuery("SELECT " + nombreColumnaImprimir + " FROM " + nombreTabla + " WHERE " + nombreColumnaBuscar + " = '" + dato + "'");
            } else {
                rs = stmt.executeQuery("SELECT " + nombreColumnaImprimir + " FROM " + nombreTabla);
            }

            ResultSetMetaData todosDatos = rs.getMetaData();
            int numColumna = todosDatos.getColumnCount();

            // Recorrer los resultados obtenidos de la consulta
            while (rs.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    // Construir cada registro individual concatenando las etiquetas de columna y los valores correspondientes
                    registroIndividual = registroIndividual + todosDatos.getColumnLabel(i) + ": " + rs.getString(i) + " ";

                    // Si es la última columna, agregar el registro individual a la lista de registros completos
                    if (i == numColumna) {
                        registroCompleto.add(registroIndividual);
                    }
                }
                registroIndividual = ""; // Reiniciar el registro individual para el próximo resultado
            }

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }

        // Convertir la lista de registros completos a un array de strings y devolverlo
        String[] devolverRegistros = new String[registroCompleto.size()];
        for (int i = 0; i < devolverRegistros.length; i++) {
            devolverRegistros[i] = registroCompleto.get(i);
        }

        return devolverRegistros;
    }

    /**
     * Verifica si existe una matrícula para un alumno y un curso específicos en
     * las tablas correspondientes.
     *
     * @param nombreTabla Nombre de la tabla en la que se buscará la matrícula.
     * @param dniAlumno DNI del alumno.
     * @param nombreCurso Nombre del curso.
     * @return {@code true} si la matrícula existe, {@code false} si no existe o
     * si el alumno o el curso no existen.
     */
    public boolean existeMatricula(String nombreTabla, String dniAlumno, String nombreCurso) {

        if (buscar(dniAlumno, "alumnos", "dni") && buscar(nombreCurso, "cursos", "nombre")) {

            Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = this.conn.createStatement();
                stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

                // Ejecutar la consulta SQL para obtener todas las filas de la tabla especificada
                rs = stmt.executeQuery("SELECT * FROM " + nombreTabla);

                // Recorrer los resultados obtenidos
                while (rs.next()) {
                    String columnaAlumno = rs.getString("dniAlumno");
                    String columnaCurso = rs.getString("nombreCurso");

                    // Verificar si el alumno y el curso coinciden con los parámetros proporcionados
                    if (columnaAlumno.equals(dniAlumno) && columnaCurso.equals(nombreCurso)) {
                        return true; // La matrícula existe
                    }
                }
            } catch (SQLException ex) {
                // ex.printStackTrace();
            }
        } else {
            return false; // El alumno o el curso no existen, por lo tanto la matrícula no puede existir
        }

        return false; // No se encontró la matrícula
    }

    /**
     * Obtiene una lista de objetos Curso a partir de los datos de la tabla
     * "Cursos".
     *
     * @return Lista de objetos Curso.
     * @throws Exception Si se produce un error al obtener los datos de la
     * tabla.
     */
    public ArrayList<Curso> obtenerCursos() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        stmt = this.conn.createStatement();
        stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

        // Ejecutar la consulta SQL para obtener los datos de los cursos
        rs = stmt.executeQuery("SELECT * FROM Cursos");

        Curso curso;
        ArrayList<Curso> cursos = new ArrayList<>();

        while (rs.next()) {
            curso = new Curso("", "", 0); // Crear un nuevo objeto Curso en cada iteración

            // Asignar los valores obtenidos de la consulta al objeto Curso
            curso.setNombre(rs.getString("nombre"));
            curso.setDescripcion(rs.getString("descripcion"));
            curso.setNumHoras(Integer.parseInt(rs.getString("numeroHoras")));

            // Agregar el objeto Curso a la lista de cursos
            cursos.add(curso);
        }

        rs.close();
        stmt.close();
        return cursos;
    }

    /**
     * Obtiene una lista de objetos Alumno a partir de los datos de la tabla
     * "Alumnos".
     *
     * @return Lista de objetos Alumno.
     * @throws Exception Si se produce un error al obtener los datos de la
     * tabla.
     */
    public ArrayList<Alumno> obtenerAlumnos() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        stmt = this.conn.createStatement();
        stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

        // Ejecutar la consulta SQL para obtener los datos de los alumnos
        rs = stmt.executeQuery("SELECT * FROM Alumnos");

        Alumno alumno;
        ArrayList<Alumno> alumnos = new ArrayList<>();

        while (rs.next()) {
            alumno = new Alumno("", "", "", "", ""); // Crear un nuevo objeto Alumno en cada iteración

            // Asignar los valores obtenidos de la consulta al objeto Alumno
            alumno.setDni(rs.getString("dni"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setCorreo(rs.getString("correo"));
            alumno.setTelefono(rs.getString("telefono"));

            // Agregar el objeto Alumno a la lista de alumnos
            alumnos.add(alumno);
        }

        rs.close();
        stmt.close();

        return alumnos;
    }

    /**
     * Obtiene una lista de objetos Inscripcion a partir de los datos de la
     * tabla "Inscripciones".
     *
     * @return Lista de objetos Inscripcion.
     * @throws Exception Si se produce un error al obtener los datos de la
     * tabla.
     */
    public ArrayList<Inscripcion> obtenerInscripciones() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        stmt = this.conn.createStatement();
        stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

        // Ejecutar la consulta SQL para obtener los datos de las inscripciones
        rs = stmt.executeQuery("SELECT * FROM Inscripciones");

        Inscripcion ins;
        ArrayList<Inscripcion> listaIns = new ArrayList<>();

        while (rs.next()) {
            ins = new Inscripcion("", ""); // Crear un nuevo objeto Inscripcion en cada iteración

            // Asignar los valores obtenidos de la consulta al objeto Inscripcion
            ins.setDni(rs.getString("dniAlumno"));
            ins.setNombreCurso(rs.getString("nombreCurso"));
            ins.setFechaInicio(rs.getDate("fechaInicio"));
            ins.setFechaFin(rs.getDate("fechaFin"));
            ins.setCalificacion(rs.getFloat("calificacion"));

            // Agregar el objeto Inscripcion a la lista de Inscripciones
            listaIns.add(ins);
        }

        rs.close();
        stmt.close();

        return listaIns;
    }

    /**
     * Devuelve todos los registros de inscripciones de la base de datos
     * utilizados para generar un informe de alumnos y notas.
     *
     * @return Lista de registros individuales del informe.
     */
    public ArrayList<String> informesAlumnosNotas() {
        ArrayList<String> informe = new ArrayList<>();  // Lista para almacenar el informe

        ArrayList<String> registroCompleto = new ArrayList<>();  // Lista para almacenar los registros individuales
        String registroIndividual = "";  // Cadena para construir cada registro individual
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

            // Realizar la consulta SQL para obtener el informe de alumnos y notas
            rs = stmt.executeQuery("SELECT alumnos.Nombre, inscripciones.dniAlumno, inscripciones.nombreCurso, inscripciones.calificacion "
                    + "FROM inscripciones "
                    + "JOIN alumnos ON inscripciones.dniAlumno = alumnos.dni "
                    + "ORDER BY alumnos.Nombre");

            ResultSetMetaData todosDatos = rs.getMetaData();
            int numColumna = todosDatos.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    registroIndividual = registroIndividual + todosDatos.getColumnLabel(i) + ": " + rs.getString(i) + " ";
                    if (i == numColumna) {
                        informe.add(registroIndividual);  // Agregar el registro individual a la lista del informe
                    }
                }

                registroIndividual = "";
            }

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                //  e.printStackTrace();
            }
        }

        return informe;  // Devolver el informe completo
    }

    /**
     * Devuelve todos los registros de cursos y descripciones, así como los
     * registros de inscripciones de alumnos en los cursos.
     *
     * @return Lista de registros individuales del informe.
     */
    public ArrayList<String> informesCursosDescripcionesAlumnos() {
        ArrayList<String> informe = new ArrayList<>();  // Lista para almacenar el informe

        ArrayList<String> registroCompleto = new ArrayList<>();  // Lista para almacenar los registros individuales
        String registroIndividual = "";  // Cadena para construir cada registro individual
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("USE Sergio_Adrian_centroFormacion");

            // Consulta de los cursos con sus descripciones
            rs = stmt.executeQuery("SELECT cursos.Nombre, cursos.Descripcion "
                    + "FROM cursos "
                    + "ORDER BY cursos.Nombre");

            ResultSetMetaData todosDatos = rs.getMetaData();
            int numColumna = todosDatos.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    registroIndividual = registroIndividual + todosDatos.getColumnLabel(i) + ": " + rs.getString(i) + " ";
                    if (i == numColumna) {
                        informe.add(registroIndividual);  // Agregar el registro individual a la lista del informe
                    }
                }

                registroIndividual = "";
            }

            // Realizar la consulta SQL para obtener el curso y los alumnos
            rs = stmt.executeQuery("SELECT inscripciones.nombreCurso, alumnos.Nombre, alumnos.Apellido "
                    + "FROM inscripciones "
                    + "JOIN alumnos ON inscripciones.dniAlumno = alumnos.dni "
                    + "ORDER BY inscripciones.nombreCurso");

            todosDatos = rs.getMetaData();
            numColumna = todosDatos.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    registroIndividual = registroIndividual + todosDatos.getColumnLabel(i) + ": " + rs.getString(i) + " ";
                    if (i == numColumna) {
                        informe.add(registroIndividual);  // Agregar el registro individual a la lista del informe
                    }
                }

                registroIndividual = "";
            }

            this.conn.commit();

        } catch (SQLException ex) {
            // ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // e.printStackTrace();
            }
        }

        return informe;  // Devolver el informe completo
    }

    /**
     * Serializa un ArrayList de Alumnos en un archivo.
     *
     * @param listaAlumnos ArrayList de Alumnos a serializar.
     */
    public void serializarAlumnos(ArrayList listaAlumnos) {
        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaAlumnos.ser", false);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaAlumnos);
            salida.close();
            archivo.close();

        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    /**
     * Serializa un ArrayList de Cursos en un archivo.
     *
     * @param listaCursos ArrayList de Cursos a serializar.
     */
    public void serializarCursos(ArrayList listaCursos) {
        FileOutputStream archivoC = null;
        ObjectOutputStream salida = null;
        try {
            archivoC = new FileOutputStream("Ficheros/listaCursos.ser");
            salida = new ObjectOutputStream(archivoC);
            salida.writeObject(listaCursos);
        } catch (IOException e) {
            // e.printStackTrace();
        } finally {

            try {
                salida.close();
                archivoC.close();
            } catch (IOException e) {
                //e.printStackTrace();
            }
        }
    }

    /**
     * Deserializa un ArrayList de Cursos desde un archivo.
     *
     * @return ArrayList de Cursos deserializado.
     */
    public ArrayList<Curso> deserializarCursos() {
        FileInputStream archivo = null;
        ObjectInputStream entrada = null;
        ArrayList<Curso> listaCursos = null;
        try {
            archivo = new FileInputStream("Ficheros/listaCursos.ser");
            entrada = new ObjectInputStream(archivo);
            listaCursos = (ArrayList<Curso>) entrada.readObject();

        } catch (Exception e) {
            // e.printStackTrace();
        } finally {

            try {
                entrada.close();
                archivo.close();

            } catch (IOException e) {

                //  e.printStackTrace();
            }
        }
        return listaCursos;
    }

    //para insertar los cursos serializados
    /**
     * Inserta cursos serializados en la base de datos.
     *
     * @param cursos ArrayList de Cursos serializados a insertar.
     */
    public void insertarCS(ArrayList<Curso> cursos) {
        Statement stmt = null;
        if (cursos != null && cursos.size() > 0) {
            try {
                stmt = this.conn.createStatement();
                stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

                for (int i = 0; i < cursos.size(); i++) {
                    stmt.executeUpdate("insert into CURSOS values ('" + cursos.get(i).getNombre() + "','" + cursos.get(i).getDescripcion() + "','" + cursos.get(i).getNumHoras() + "')");

                    this.conn.commit();
                }
                System.out.println("Cursos insertados en la base de datos");
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } finally {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    //e.printStackTrace();
                }
            }
        }
    }

    /**
     * Deserializa y inserta los alumnos en la base de datos.
     *
     * @return ArrayList de Alumnos deserializados (siempre devuelve null).
     */
    public ArrayList<Alumno> deserializarAlumnos() {
        try {
            FileInputStream archivo = new FileInputStream("Ficheros/listaAlumnos.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            ArrayList<Alumno> listaAlumnos = (ArrayList<Alumno>) entrada.readObject();

            // Se borra cualquier registro
            borrarAlumno("TODO");
            // Insertar los alumnos en la base de datos
            if (!listaAlumnos.isEmpty()) {
                for (Alumno alumno : listaAlumnos) {
                    insertarAlumno(
                            alumno.getDni(),
                            alumno.getNombre(),
                            alumno.getApellido(),
                            alumno.getCorreo(),
                            alumno.getTelefono()
                    );
                }
                this.conn.commit();
                entrada.close();
                archivo.close();

                System.out.println("Alumnos deserializados e insertados en la base de datos correctamente.");
            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            // e.printStackTrace();
        }
        return null;
    }

    /**
     * Serializa y guarda en un archivo las inscripciones proporcionadas.
     *
     * @param listaInscripciones ArrayList de Inscripcion a serializar.
     */
    public void serializarInscripciones(ArrayList listaInscripciones) {

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaInscripciones.ser", false);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaInscripciones);
            salida.close();
            archivo.close();
            this.conn.commit();
        } catch (IOException | SQLException e) {
            //e.printStackTrace();
        }

    }

    /**
     * Deserializa y guarda en la base de datos las inscripciones previamente
     * serializadas.
     */
    public void deserializarInscripciones() {
        try {
            FileInputStream archivo = new FileInputStream("Ficheros/listaInscripciones.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            ArrayList<Inscripcion> listaInscripciones = (ArrayList<Inscripcion>) entrada.readObject();
            entrada.close();
            archivo.close();

            GestionesDeBD bd = new GestionesDeBD();
            // Se borra cualquier registro
            bd.borrarInscripciones("TODO", "TODO");
            // Insertar las inscripciones en la base de datos

            if (!listaInscripciones.isEmpty()) {

                for (Inscripcion inscrip : listaInscripciones) {
                    if (inscrip.getFechaFin() != null) {
                        insertarInscSerializada(inscrip.getDni(),
                                inscrip.getNombreCurso(),
                                inscrip.getFechaInicio().toString(),
                                inscrip.getFechaFin().toString(),
                                inscrip.getCalificacion());
                    } else {
                        insertarInscSerializadaNoFinalizada(inscrip.getDni(),
                                inscrip.getNombreCurso(),
                                inscrip.getFechaInicio().toString());

                    }

                }
            }

            entrada.close();
            archivo.close();
            this.conn.commit();

        } catch (IOException | ClassNotFoundException | SQLException e) {
            //e.printStackTrace();
        }
    }

    /**
     * Verifica si un archivo está vacío o no existe.
     *
     * @param filePath La ruta del archivo a verificar.
     * @return true si el archivo está vacío o no existe, false en caso
     * contrario.
     */
    public boolean existeFicheros(String filePath) {
        File file = new File(filePath);

        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                // Intenta leer un objeto del archivo
                Object obj = objectInputStream.readObject();

                objectInputStream.close();
                fileInputStream.close();

                // Si el objeto es nulo, el archivo está vacío
                if (obj == null) {
                    return false;
                }
            } catch (IOException | ClassNotFoundException e) {
                //e.printStackTrace();
            }

            return true;
        } else {
            return false; // El archivo no existe o está vacío
        }
    }
}
