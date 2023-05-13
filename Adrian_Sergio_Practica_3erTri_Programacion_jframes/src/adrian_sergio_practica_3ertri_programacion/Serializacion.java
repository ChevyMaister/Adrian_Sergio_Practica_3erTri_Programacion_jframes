/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializacion {

    private static final String URL = "jdbc:mariadb://localhost:3306/Sergio_Adrian_centroFormacion";
    private static final String USER = "Root";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws Exception {
        ArrayList<Alumno> alumnos = obtenerAlumnos();
        ArrayList<Curso> cursos = obtenerCursos();
        ArrayList<Inscripcion> inscripciones = obtenerInscripciones();

        FileOutputStream fileOut = new FileOutputStream("datos.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(alumnos);
        out.writeObject(cursos);
        out.writeObject(inscripciones);

        out.close();
        fileOut.close();
    }

    private static ArrayList<Alumno> obtenerAlumnos() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT dni, nombre, apellido, correo, telefono FROM listaAlumnos");

        ArrayList alumnos = new ArrayList<>();
        try {
            while (rs.next()) {
                Alumno alumno = new Alumno("", "", "", "", "");
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
        conn.close();

        return alumnos;
    }

    private static ArrayList<Curso> obtenerCursos() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT  nombre, descripcion, horas FROM listaCursos");

        ArrayList<Curso> cursos = new ArrayList<>();
        while (rs.next()) {
            Curso curso = new Curso("", "", 0);

            curso.setNombre(rs.getString("nombre"));
            curso.setDescripcion(rs.getString("descripcion"));
            curso.setNumHoras(rs.getInt("NumeroHoras"));

            cursos.add(curso);
        }

        rs.close();
        stmt.close();
        conn.close();

        return cursos;
    }

    private static ArrayList<Inscripcion> obtenerInscripciones() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id_inscripcion, dni, nombre_curso, calificacion FROM inscripcionesAlumnosCursos");

        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        while (rs.next()) {
            Inscripcion inscripcion = new Inscripcion();
            //inscripcion.setIdInscripcion(rs.getInt("id_inscripcion"));
            inscripcion.setDni(rs.getString("dniAlumno"));
            inscripcion.setNombreCurso(rs.getString("nombreCurso"));
            inscripcion.setFechaInicio(rs.getDate("fechaInicio"));
            inscripcion.setFechaFin(rs.getDate("fechaFin"));
            inscripcion.setCalificacion(rs.getInt("calificacion"));

            inscripciones.add(inscripcion);
        }

        rs.close();
        stmt.close();
        conn.close();

        return inscripciones;
    }

}
