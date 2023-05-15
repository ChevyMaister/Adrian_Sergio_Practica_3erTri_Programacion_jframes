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

    public void serializarAlumnos(ArrayList listaAlumnos) {
        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaAlumnos.ser");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaAlumnos);
            salida.close();
            archivo.close();
            System.out.println("ArrayList serializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Inscripcion> obtenerInscripciones() throws Exception {
        /*Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
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
         */
        return null;
    }

}
