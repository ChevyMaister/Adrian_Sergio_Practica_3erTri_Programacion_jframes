package adrian_sergio_practica_3ertri_programacion;

import java.util.ArrayList;

/**
 * Clase que representa a un alumno.
 */

public class Alumno {

    private String dni; // DNI del alumno
    private String nombre; // Nombre del alumno
    private String apellido; // Apellido del alumno
    private String correo; // Correo electrónico del alumno
    private String telefono; // Número de teléfono del alumno
    private ArrayList[] listaCursos; // Lista de cursos que el alumno está cursando

    /**
     * Constructor de la clase Alumno.
     *
     * @param dni DNI del alumno
     * @param nombre Nombre del alumno
     * @param apellido Apellido del alumno
     * @param correo Correo electrónico del alumno
     * @param telefono Número de teléfono del alumno
     */
    public Alumno(String dni, String nombre, String apellido, String correo, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        listaCursos = new ArrayList[4];
    }

    /**
     * Método para obtener el DNI del alumno.
     *
     * @return DNI del alumno
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método para establecer el DNI del alumno.
     *
     * @param dni DNI del alumno
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método para obtener el nombre del alumno.
     *
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del alumno.
     *
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el apellido del alumno.
     *
     * @return Apellido del alumno
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método para establecer el apellido del alumno.
     *
     * @param apellido Apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método para obtener el correo electrónico del alumno.
     *
     * @return Correo electrónico del alumno
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método para establecer el correo electrónico del alumno.
     *
     * @param correo Correo electrónico del alumno
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método para obtener el número de teléfono del alumno.
     *
     * @return Número de teléfono del alumno
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método para establecer el número de teléfono del alumno.
     *
     * @param telefono Número de teléfono del alumno
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener la lista de cursos que el alumno está cursando.
     *
     * @return Lista de cursos del alumno
     */
    public ArrayList[] getListaCursos() {
        return listaCursos;
    }

    /**
     * Método para establecer la lista de cursos que el alumno está cursando.
     *
     * @param listaCursos Lista de cursos del alumno
     */
    public void setListaCursos(ArrayList[] listaCursos) {
        this.listaCursos = listaCursos;
    }

    /**
     *
     * Devuelve una cadena que representa al objeto actual.
     *
     * @return información del alumno en forma de cadena
     */
    @Override
    public String toString() {
        String infoAlumno = " " + nombre + " " + apellido + " con dni: " + dni + " correo: " + correo + ", telefono: " + telefono + " cursa:";
        if (listaCursos[0] != null) {
            for (int i = 0; i < listaCursos.length; i++) {
                infoAlumno = infoAlumno + " " + listaCursos[i];
            }
        } else {
            infoAlumno += " Todavia no tiene cursos";
        }
        return infoAlumno;
    }

}
