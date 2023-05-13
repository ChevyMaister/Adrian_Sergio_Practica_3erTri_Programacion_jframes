/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.sql.*;

/**
 *
 * @author 34603
 */
public class PersistenciaBD {

    private String puerto = "3306";
    private String ip = "localhost";
    private String usuario = "root";
    private String passw = "";
    private String db = "";
    private Connection conn = null;

    public PersistenciaBD(String ip, String port, String user, String psw, String db) {
        this.puerto = port;
        this.ip = ip;
        this.usuario = user;
        this.passw = psw;
        this.db = db;
        conectar();
    }

    public PersistenciaBD() {
        conectar();
    }

    public void conectar() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //System.out.println("jdbc:mariadb://"+this.ip+":"+this.puerto+"/"+this.db+" "+this.usuario+" "+this.passw);
            this.conn = DriverManager.getConnection("jdbc:mariadb://" + this.ip + ":" + this.puerto + "/" + this.db , this.usuario, this.passw);
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
                    + "   fechaFin DATE"
                    + "   calificacion FLOAT(4,2)"                 
                    + ");");
            this.conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
            stmt.close();
            }catch(Exception e){
               
                e.printStackTrace();
            }
            
        }
    }
    //METODOS PARA DAR DE ALTA EN LA BASE DE DATOS
    public void insertarCurso( String nombre, String descripcion, String numHoras) {
        Statement stmt = null ;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("insert into CURSOS values ('" + nombre + "','" + descripcion + "','" + numHoras + "')");

            this.conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
            stmt.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void insertarAlumno(String dni, String nombre, String apellido, String correo, String telefono) {
        Statement stmt = null;
        try {
            
            stmt = this.conn.createStatement();
            
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("insert into ALUMNOS values ('" + dni + "','" + nombre + "','" + apellido + "','" + telefono + "')");

            this.conn.commit();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
               stmt.close();
            }catch (Exception e){
                
                e.printStackTrace();
            }
        }

    }

    public void insertarInscripcion() {// para insertar los datos de la tabla inscripcion 

    }
    //METODOS PARA DAR DE BAJA EN LA BASE DE DATOS
    public void borrarCurso( String nombre) {
        
        Statement stmt = null;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("delete from CURSOS where Nombre='"+nombre+"' ;");

            this.conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
              stmt.close();  
                 
            }catch(Exception e ){
                
              e.printStackTrace();
            }
            
        }
    }
    
    public void borrarAlumno( String dni ) {
        
        
        
    }
    /**
     * 
     * @param dato - parametro para introducir el dato que buscas
     * @param nombreTabla - parametro para concretar la tabla donde buscar
     * @param nombreColumna - parametro para concretar la columna de la tabla donde buscar el dato
     * @return 
     */
    //METODO PARA BUSCAR DATOS DENTRO DE LA BASE DE DATOS
    public boolean buscar (String dato , String nombreTabla , String nombreColumna){//devuelve true si el dato introducido en la tabla introducida existe
       String campo = "";
        boolean encontrado = false ;
    Statement stmt = null;
    ResultSet rs = null;
        try {
            stmt = this.conn.createStatement();
           
            stmt.executeUpdate("use Sergio_Adrian_centroFormacion");
            rs = stmt.executeQuery("SELECT * FROM "+nombreTabla);
            
          while (rs.next()) {
          campo = rs.getString(nombreColumna);
          if ( campo.equalsIgnoreCase(dato)){
              encontrado = true;
          }else{
              encontrado = false;
          }
    }
            this.conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
          try{
             stmt.close(); 
             rs.close();
          }catch(Exception e){
              
             e.printStackTrace();
          }  
   
        }
    return encontrado ; 
}
    
    
}