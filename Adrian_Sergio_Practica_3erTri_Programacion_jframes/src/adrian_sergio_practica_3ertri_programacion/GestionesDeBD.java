package adrian_sergio_practica_3ertri_programacion;

import java.io.BufferedReader;
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

    public GestionesDeBD() {
        conectar();
    }

    public void conectar() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //System.out.println("jdbc:mariadb://"+this.ip+":"+this.puerto+"/"+this.db+" "+this.usuario+" "+this.passw);
            this.conn = DriverManager.getConnection("jdbc:mariadb://" + this.ip + ":" + this.puerto + "/" + this.db, this.usuario, this.passw);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void Datos(String fichero) {//introducir DatosDeBBDD 
        FileReader reader = null; //para leer el fichero de texto 
        BufferedReader bufferedReader = null;
        String line; // para guardar cada linea del fichero
        HashMap<String, String> parametros = new HashMap<String, String>(); // para guardar los datos de configuracion del fichero 
        try {
            reader = new FileReader(fichero);
            bufferedReader = new BufferedReader(reader);
            int cont = 1;
            while ((line = bufferedReader.readLine()) != null) {// si no esta vacia la 
                System.out.println("num linea " + cont + " " + line);
                cont++;
                line = line.trim();
                if (line.length() != 0) {
                    String valores[] = line.split("=");
                    if (valores.length == 2) {
                        if (parametros.containsKey(valores[0])) {
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        } else {
                            parametros.put(valores[0].trim(), valores[1].trim());
                        }
                    } else if (valores.length == 1) {
                        if (parametros.containsKey(valores[0])) {
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        } else {
                            parametros.put(valores[0].trim(), "");
                        }
                    }
                }

            }
            for (String clave : parametros.keySet()) {
                System.out.println(clave + ":" + parametros.get(clave));
                switch (clave) {
                    case "ip":
                        this.ip = parametros.get(clave);
                        break;
                    case "puerto":
                        this.puerto = parametros.get(clave);
                        break;
                    case "usuario":
                        this.usuario = parametros.get(clave);
                        break;
                    case "password":
                        this.passw = parametros.get(clave);
                        break;
                    case "db":
                        this.db = parametros.get(clave);
                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        conectar();
    }

    public void crearDB() {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("create database if not exists Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ALUMNOS("
                    + "   dni CHAR(9)  NOT NULL  ,"
                    + "   Nombre VARCHAR (40)     NOT NULL,"
                    + "   Apellido VARCHAR(35)   NOT NULL,"
                    + "   Correo  VARCHAR (25)    NOT NULL,"
                    + "   Telefono CHAR(9)      NOT NULL,"
                    + "   PRIMARY KEY (dni)"
                    + ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS CURSOS("
                    + "   Nombre VARCHAR (20)     NOT NULL,"
                    + "   Descripcion VARCHAR (40)     NOT NULL,"
                    + "   NumeroHoras VARCHAR(35)              NOT NULL,"
                    + "   PRIMARY KEY (Nombre)"
                    + ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS INSCRIPCIONES("
                    + "   dniAlumno CHAR(9),"
                    + "   nombreCurso VARCHAR(20), "
                    + "   FOREIGN KEY(dniAlumno) REFERENCES ALUMNOS(dni),"
                    + "   FOREIGN KEY(nombreCurso) REFERENCES CURSOS(Nombre),"
                    + "   PRIMARY KEY ( dniAlumno , nombreCurso ),"
                    + "   fechaInicio DATE NOT NULL,"
                    + "   fechaFin DATE,"
                    + "   calificacion FLOAT(4,2)"
                    + ");");
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    //METODOS PARA DAR DE ALTA EN LA BASE DE DATOS
    public void insertarCurso(String nombre, String descripcion, String numHoras) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("insert into CURSOS values ('" + nombre + "','" + descripcion + "','" + numHoras + "')");

            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void insertarAlumno(String dni, String nombre, String apellido, String correo, String telefono) {
        Statement stmt = null;
        try {

            stmt = this.conn.createStatement();

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            System.out.println("insert into ALUMNOS values ('" + dni + "','" + nombre + "','" + apellido + "','" + correo + "','" + telefono + "')");
            System.out.println(stmt.executeUpdate("SHOW TABLES FROM sergio_adrian_centroformacion;"));
            stmt.executeUpdate("insert into ALUMNOS values ('" + dni + "','" + nombre + "','" + apellido + "','" + correo + "','" + telefono + "')");
            System.out.println(stmt.executeUpdate("SHOW TABLES FROM sergio_adrian_centroformacion;"));
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {

                e.printStackTrace();
            }
        }

    }

    public void insertarInscripcion(String nombreCurso, String dniAlumno) {// para insertar los datos de la tabla inscripcion 
        Statement stmt = null;
        long miliseconds = System.currentTimeMillis();
        Date fecha = new Date(miliseconds);
        System.out.println(fecha);
        try {

            stmt = this.conn.createStatement();

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("insert into INSCRIPCIONES (dniAlumno, nombreCurso, fechaInicio) values ('" + dniAlumno + "','" + nombreCurso + "','" + fecha + "')");

            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {

                e.printStackTrace();
            }
        }

    }

    public void insertarInscSerializada(String nombreCurso, String dniAlumno, String inicio, String fin, float nota) {// para insertar los datos de la tabla inscripcion 
        Statement stmt = null;
        long miliseconds = System.currentTimeMillis();
        Date fecha = new Date(miliseconds);
        System.out.println(fecha);
        try {

            stmt = this.conn.createStatement();

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
String query = "INSERT INTO INSCRIPCIONES (dniAlumno, nombreCurso, fechaInicio, fechaFin, calificacion) VALUES (?, ?, ?, ?, ?)";

PreparedStatement pstmt = conn.prepareStatement(query);
pstmt.setString(1, dniAlumno);
pstmt.setString(2, nombreCurso);
pstmt.setString(3, inicio);
pstmt.setString(4, fin);
pstmt.setFloat(5, nota);

pstmt.executeUpdate();
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {

                e.printStackTrace();
            }
        }

    }

    //METODOS PARA DAR DE BAJA EN LA BASE DE DATOS
    public void borrarCurso(String nombre) {

        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("delete from CURSOS where Nombre='" + nombre + "' ;");

            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();

            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    //METODO PARA BORRAR UN ALUMNO, RECOGE DNI LO BORRA EN LA BD, si en la string pone TODO se borra todo
    public void borrarAlumno(String dni) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            if (dni.equals("TODO")) {
                stmt.executeUpdate("delete from ALUMNOS;");
            } else {
                stmt.executeUpdate("delete from ALUMNOS where dni='" + dni + "' ;");
            }
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();

            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    public void borrarInscripciones(String dni, String curso) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            if (dni.equals("TODO") && curso.equals("TODO")) {
                stmt.executeUpdate("delete from Inscripciones;");
            } else if (curso.equals("TODO")) {
                stmt.executeUpdate("delete from Inscripciones where dniAlumno='" + dni + "' ;");
            } else if (dni.equals("TODO")) {
                stmt.executeUpdate("delete from Inscripciones where nombreCurso='" + curso + "' ;");
            } else {
                stmt.executeUpdate("delete from Inscripciones where nombreCurso='" + curso + "' AND dniAlumno = '" + dni + "';");
            }
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();

            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    /**
     *
     * @param dato - parametro para introducir el dato que buscas
     * @param nombreTabla - parametro para concretar la tabla donde buscar
     * @param nombreColumna - parametro para concretar la columna de la tabla
     * donde buscar el dato
     * @return
     */
    //METODO PARA BUSCAR DATOS DENTRO DE LA BASE DE DATOS
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
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
        return encontrado;
    }

    //METODO PARA MODIFICAR CURSOS
    public void modificarCurso(String nombreCurso, String columna, String datoNuevo) {
        String curso = "";

        Statement stmt = null;
        // ResultSet rs = null;
        switch (columna) {

            case "Descripcion":
        try {
                stmt = this.conn.createStatement();

                stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
                stmt.executeUpdate("UPDATE cursos SET " + columna + " = '" + datoNuevo + "' WHERE Nombre = '" + nombreCurso + "';");

                this.conn.commit();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    stmt.close();
                    //rs.close();
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
            break;
            case "Nombre":
        try {
                stmt = this.conn.createStatement();

                stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

                stmt.executeUpdate("UPDATE cursos SET " + columna + " = '" + datoNuevo + "' WHERE Nombre = '" + nombreCurso + "';");

                this.conn.commit();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    stmt.close();
                    //rs.close();
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
            break;
            case "NumeroHoras":
        try {
                stmt = this.conn.createStatement();

                stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

                stmt.executeUpdate("UPDATE cursos SET " + columna + " = '" + datoNuevo + "' WHERE Nombre = '" + nombreCurso + "';");

                this.conn.commit();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    stmt.close();
                    //rs.close();
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
            break;
            default:

        }

    }
// metodo para modificar general

    public void modificar(String clave, String columnaClave, String nombreTabla, String columnaCambio, String nuevoValor) {

        boolean encontrado = false;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            rs = stmt.executeQuery("SELECT * FROM " + nombreTabla);

            stmt.executeUpdate("UPDATE " + nombreTabla + " SET " + columnaCambio + " = '" + nuevoValor + "' WHERE " + columnaClave + " = '" + clave + "';");

            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    //Metodo para calificar a los alumnos en los cursos en la tabla INCRIPCIONES
    public void calificar(String claveAlumno, String claveCurso, float nuevoValor) {

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            //rs = stmt.executeQuery("SELECT * FROM inscripciones");
            stmt.executeUpdate("UPDATE inscripciones SET calificacion = '" + nuevoValor + "' WHERE dniAlumno = '" + claveAlumno + "' AND nombreCurso = '" + claveCurso + "';");
            stmt.executeUpdate("UPDATE inscripciones SET fechaFin = CURRENT_DATE() WHERE dniAlumno = '" + claveAlumno + "' AND nombreCurso = '" + claveCurso + "';");
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    //Metodo que devuelve una array de String para poder meterlo en la Lista. Devuelve los datos requeridos metiendo por parametro el nombre de la tabla, la columna donde quiere buscar, y el nombre de la columna que quiere devolver
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

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

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
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Convertir la lista de registros completos a un array de strings y devolverlo
        String[] devolverRegistros = new String[registroCompleto.size()];
        for (int i = 0; i < devolverRegistros.length; i++) {
            devolverRegistros[i] = registroCompleto.get(i);
        }

        return devolverRegistros;
    }

    // Verificar si el alumno y el curso existen en las respectivas tablas
    public boolean existeMatricula(String nombreTabla, String dniAlumno, String nombreCurso) {

        if (buscar(dniAlumno, "alumnos", "dni") && buscar(nombreCurso, "cursos", "nombre")) {

            Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = this.conn.createStatement();
                stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

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
                ex.printStackTrace();
            }
        } else {
            return false; // El alumno o el curso no existen, por lo tanto la matrícula no puede existir
        }

        return false; // No se encontró la matrícula
    }

    //Devuelve todos los alumnos de la bbdd utilizado para serializar
    public ArrayList<Alumno> obtenerAlumnos() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        stmt = this.conn.createStatement();
        stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

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

    //Devuelve todas las Inscripciones de la bbdd utilizado para serializar
    public ArrayList<Inscripcion> obtenerInscripciones() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        stmt = this.conn.createStatement();
        stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

        // Ejecutar la consulta SQL para obtener los datos de los Inscripcion
        rs = stmt.executeQuery("SELECT * FROM Inscripciones");

        Inscripcion ins = new Inscripcion("", "");
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

    //Devuelve todos los registros de inscripciones de la bbdd utilizado para serializar
    public ArrayList<String> informesAlumnosNotas() {
        ArrayList<String> informe = new ArrayList<>();  // Lista para almacenar el informe

        ArrayList<String> registroCompleto = new ArrayList<>();  // Lista para almacenar los registros individuales
        String registroIndividual = "";  // Cadena para construir cada registro individual
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

            // Realizar la consulta SQL para obtener el informe de alumnos y notas
            rs = stmt.executeQuery(""
                    + "SELECT alumnos.Nombre, inscripciones.dniAlumno, inscripciones.nombreCurso, inscripciones.calificacion  "
                    + "FROM inscripciones "
                    + "JOIN alumnos ON inscripciones.dniAlumno=ALUMNOS.dni "
                    + "ORDER BY ALUMNOS.Nombre;");

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
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return informe;  // Devolver el informe completo
    }

    public void serializarAlumnos(ArrayList listaAlumnos) {
        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaAlumnos.ser", false);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaAlumnos);
            salida.close();
            archivo.close();

            System.out.println("ArrayList serializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Alumno> deserializarAlumnos() {
        try {
            FileInputStream archivo = new FileInputStream("Ficheros/listaAlumnos.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            ArrayList<Alumno> listaAlumnos = (ArrayList<Alumno>) entrada.readObject();

            // Se borra cualquier registro
            borrarAlumno("TODO");
            // Insertar los alumnos en la base de 
            if (listaAlumnos.size() > 0) {
                for (Alumno alumno : listaAlumnos) {

                    insertarAlumno(
                            alumno.getDni(),
                            alumno.getNombre(),
                            alumno.getApellido(),
                            alumno.getCorreo(),
                            alumno.getTelefono()
                    );
                }

                entrada.close();
                archivo.close();

                System.out.println("Alumnos deserializados e insertados en la base de datos correctamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void serializarInscripciones(ArrayList listaInscripciones) {

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaInscripciones.ser", false);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaInscripciones);
            salida.close();
            archivo.close();
            System.out.println("ArrayList INSCRIPCIONES serializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deserializarInscripciones() {
        try {
            FileInputStream archivo = new FileInputStream("Ficheros/listaInscripciones.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            ArrayList<Inscripcion> listaInscripciones = (ArrayList<Inscripcion>) entrada.readObject();
            entrada.close();
            archivo.close();

            GestionesDeBD bd = new GestionesDeBD();
            // Se borra cualquier registro
            bd.borrarAlumno("TODO");
            // Insertar las inscripciones en la base de datos
            System.out.println(listaInscripciones.size());
            if (!listaInscripciones.isEmpty()) {
                for (Inscripcion inscrip : listaInscripciones) {
                    
                    insertarInscSerializada(inscrip.getDni(),
                            inscrip.getNombreCurso(), 
                            inscrip.getFechaInicio().toString(), 
                            inscrip.getFechaFin().toString(), 
                            inscrip.getCalificacion());
                }
            }
            System.out.println("Inscripciones deserializadas e insertados en la base de datos correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
