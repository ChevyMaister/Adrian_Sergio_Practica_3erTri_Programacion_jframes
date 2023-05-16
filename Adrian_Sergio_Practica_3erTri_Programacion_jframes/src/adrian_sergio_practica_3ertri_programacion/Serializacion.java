/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Serializacion {

    public void serializarAlumnos(ArrayList listaAlumnos) {
        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaAlumnos.ser",false);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaAlumnos);
            salida.close();
            archivo.close();
            
            System.out.println("ArrayList serializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializarAlumnos() {
        try {
            FileInputStream archivo = new FileInputStream("Ficheros/listaAlumnos.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            ArrayList<Alumno> listaAlumnos = (ArrayList<Alumno>) entrada.readObject();
            entrada.close();
            archivo.close();

            GestionesDeBD bd = new GestionesDeBD();
            // Se borra cualquier registro
            bd.borrarAlumno("TODO");
            // Insertar los alumnos en la base de datos
            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno.getDni());
                System.out.println(alumno.getNombre());
                System.out.println(alumno.getApellido());
                System.out.println(alumno.getCorreo());
                System.out.println(alumno.getTelefono());
                bd.insertarAlumno(
                        alumno.getDni().trim().toUpperCase(),
                        alumno.getNombre().trim().toUpperCase(),
                        alumno.getApellido().trim().toUpperCase(),
                        alumno.getCorreo().trim().toUpperCase(),
                        alumno.getTelefono().trim().toUpperCase()
                );
            }

            System.out.println("Alumnos deserializados e insertados en la base de datos correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serializarInscripciones(ArrayList listaInscripciones) {

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaInscripciones.ser",false);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaInscripciones);
            salida.close();
            archivo.close();
            System.out.println("ArrayList serializado correctamente.");
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
            // Insertar los alumnos en la base de datos
            for (Inscripcion inscrip : listaInscripciones) {
                Date inicio = inscrip.getFechaInicio();
                bd.insertarInscSerializada(inscrip.getDni(), inscrip.getNombreCurso(), inscrip.getFechaInicio().toString(), inscrip.getFechaFin().toString(), inscrip.getCalificacion());
            }

            System.out.println("Alumnos deserializados e insertados en la base de datos correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
