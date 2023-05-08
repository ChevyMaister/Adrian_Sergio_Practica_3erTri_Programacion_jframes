/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.util.ArrayList;

/**
 *
 * @author Chevy
 */
public class Alumno {

    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    ArrayList[] listaCursos;

    public Alumno(String dni, String nombre, String apellido, String correo, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        listaCursos = new ArrayList[4];
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList[] getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList[] listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        String infoAlumno = " "+nombre +" "+ apellido + " con dni: " + dni + " correo: " + correo + ", telefono: " + telefono + " cursa:";
        if (listaCursos[0]!=null) {
            for (int i=0;i<listaCursos.length;i++) {
                infoAlumno = infoAlumno + " " + listaCursos[i];
            }
        } else {
            infoAlumno += " Todavia no tiene cursos";
        }
        return infoAlumno;
    }

}
