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
    
    
    private String puerto = "3307";
    private String ip = "localhost";
    private String usuario = "root";
    private String passw = "";
    private String db = "Sergio_Adrian_centroFormacion";
    private Connection conn = null;

    public PersistenciaBD(String ip, String port, String user, String psw, String db) {
        this.puerto = port;
        this.ip = ip;
        this.usuario = user;
        this.passw = psw;
        this.db = db;        
        conectar();
    }
    
    public PersistenciaBD(){
        conectar();
    }
    
    public void conectar(){
        try {  
            Class.forName("org.mariadb.jdbc.Driver");
            //System.out.println("jdbc:mariadb://"+this.ip+":"+this.puerto+"/"+this.db+" "+this.usuario+" "+this.passw);
            this.conn = DriverManager.getConnection("jdbc:mariadb://"+this.ip+":"+this.puerto+"/"+this.db, this.usuario, this.passw);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void Datos(String fichero){//introducir DatosDeBBDD 
        FileReader reader = null; //para leer el fichero de texto 
        BufferedReader bufferedReader = null;
        String line = null; // para guardar cada linea del fichero
        HashMap<String,String> parametros = new HashMap<String,String>(); // para guardar los datos de configuracion del fichero 
        try {
            reader = new FileReader(fichero);
            bufferedReader = new BufferedReader(reader);
            int cont = 1;
            while ((line = bufferedReader.readLine()) != null) {// si no esta vacia la 
                System.out.println("num linea "+cont+" "+line);
                cont++;                
                line = line.trim();
                if(line.length()!=0){
                    String valores[] = line.split("=");
                    if(valores.length == 2){
                        if(parametros.containsKey(valores[0])){
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        }else{
                            parametros.put(valores[0].trim(),valores[1].trim());
                        }
                    }else if(valores.length == 1){
                        if(parametros.containsKey(valores[0])){
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        }else{
                            parametros.put(valores[0].trim(),"");
                        }
                    }
                }
                
                
            }
            for(String clave: parametros.keySet()){
                System.out.println(clave+":"+parametros.get(clave));
                switch(clave){
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
        }finally{
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        
        conectar();
    }
    public void crearDB(){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("create database if not exists Sergio_Adrian_centroFormacion");
            stmt.executeUpdate("use concesionario");
            stmt.executeUpdate("drop table if exists vehiculos");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ALUMNOS(" +
               
                "   dni CHAR(9)  NOT NULL  ," +
                "   Nombre VARCHAR (40)     NOT NULL," +
                "   Apellidos VARCHAR(35)   NOT NULL," +
                "   correo  VARCHAR (25)    NOT NULL," +
                "   telefono CHAR(9)      NOT NULL,"+
                "   PRIMARY KEY (dni_Alumno)" +
                ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS CURSOS(" +
               
                "   Nombre VARCHAR (20)     NOT NULL," +
                "   Descripcion VARCHAR (40)     NOT NULL," +
                "   numHoras VARCHAR(35)              NOT NULL," +
                "   PRIMARY KEY (Nombre)" +
                ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS INSCRIPCIONES(" +
               
                "   FOREIGN KEY(dni_Alumno) REFERENCES ALUMNOS(dni)," +
                "   FOREIGN KEY(nombre_Curso) REFERENCES CURSOS(Nombre)," +
                "   MODELO VARCHAR(35)     NOT NULL," +
                "   COLOR  VARCHAR (25) ," +
                "   PRIMARY KEY (MATRICULA)" +
                ");");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    }
