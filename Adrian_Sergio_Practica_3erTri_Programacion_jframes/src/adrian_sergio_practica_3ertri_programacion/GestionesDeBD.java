/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 34603
 */
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
        String line = null; // para guardar cada linea del fichero
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
            stmt.executeUpdate("insert into ALUMNOS values ('" + dni + "','" + nombre + "','" + apellido + "','" + correo + "','" + telefono + "')");

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

    public void borrarAlumno(String dni) {
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("delete from ALUMNOS where dni='" + dni + "' ;");

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

    public void calificar(String claveAlumno, String claveCurso, String nombreTabla, float nuevoValor) {

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            rs = stmt.executeQuery("SELECT * FROM " + nombreTabla);

            stmt.executeUpdate("UPDATE " + nombreTabla + " SET calificacion = '" + nuevoValor + "' WHERE dniAlumno = '" + claveAlumno + "' AND nombreCurso = '" + claveCurso + "';");
            stmt.executeUpdate("UPDATE " + nombreTabla + " SET fechaFin = CURRENT_DATE() WHERE dniAlumno = '" + claveAlumno + "' AND nombreCurso = '" + claveCurso + "';");
            this.conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Entra aqui");
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    public String[] imprimir(String dato, String nombreTabla, String nombreColumna) {
        ArrayList<String> registroCompleto = new ArrayList();
        String registroIndividual = "";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            if (!dato.equals("*")) {
                rs = stmt.executeQuery("SELECT * FROM " + nombreTabla + " WHERE " + nombreColumna + " = '" + dato + "'");
            } else {
                rs = stmt.executeQuery("SELECT * FROM " + nombreTabla);
            }

            ResultSetMetaData todosDatos = rs.getMetaData();
            int numColumna = todosDatos.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    registroIndividual = registroIndividual + todosDatos.getColumnLabel(i) + ": " + rs.getString(i) + " -";
                    if (i == numColumna) {
                        registroCompleto.add(registroIndividual);
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
        String[] devolverRegistros = new String[registroCompleto.size()];
        for (int i = 0; i < devolverRegistros.length; i++) {

            devolverRegistros[i] = registroCompleto.get(i);
        }

        return devolverRegistros;
    }

    public boolean existeMatricula(String nombreTabla, String dniAlumno, String nombreCurso) {

        try {
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet rs = metaData.getPrimaryKeys(null, null, nombreTabla);
            while (rs.next()) {
                String columnaAlumno = rs.getString("dniAlumno");
                String columnaCurso = rs.getString("nombreCurso");
                if (columnaAlumno.equals(dniAlumno) && columnaCurso.equals(nombreCurso)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public ArrayList<Alumno> obtenerAlumnos() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        stmt = this.conn.createStatement();
        stmt.executeUpdate("use Sergio_Adrian_centroFormacion");

        rs = stmt.executeQuery("SELECT dni, nombre, apellido, correo, telefono FROM Alumnos");

        Alumno alumno = new Alumno("", "", "", "", "");
        ArrayList alumnos = new ArrayList<>();
        try {
            while (rs.next()) {

                alumno.setDni(rs.getNString("dni"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setApellido(rs.getNString("apellido"));
                alumno.setCorreo(rs.getNString("correo"));
                alumno.setDni(rs.getNString("telefono"));
                alumnos.add(alumno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Serializacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();

        return alumnos;
    }
}
