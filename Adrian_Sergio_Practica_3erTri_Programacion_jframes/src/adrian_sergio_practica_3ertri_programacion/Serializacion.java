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

    public void deserializarAlumnos() {
        try {
            FileInputStream archivo = new FileInputStream("Ficheros/listaAlumnos.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            ArrayList<Alumno> listaAlumnos = (ArrayList<Alumno>) entrada.readObject();
            entrada.close();
            archivo.close();

            // Insertar los alumnos en la base de datos
            GestionesDeBD bd = new GestionesDeBD();
            for (Alumno alumno : listaAlumnos) {
                bd.insertarAlumno(alumno.getDni(), alumno.getNombre(), alumno.getApellido(), alumno.getCorreo(), alumno.getTelefono());
            }

            System.out.println("Alumnos deserializados e insertados en la base de datos correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serializarInscripciones(ArrayList listaInscripciones) {

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros/listaInscripciones.ser");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaInscripciones);
            salida.close();
            archivo.close();
            System.out.println("ArrayList serializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
