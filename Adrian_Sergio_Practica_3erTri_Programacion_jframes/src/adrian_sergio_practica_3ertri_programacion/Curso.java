
package adrian_sergio_practica_3ertri_programacion;

import java.io.Serializable;

/**
 * Clase que representa un curso.
 */
public class Curso implements Serializable {
    private String nombre;
    private String descripcion;
    private int numHoras;

    /**
     * Constructor de la clase Curso.
     *
     * @param nombre      El nombre del curso.
     * @param descripcion La descripción del curso.
     * @param numHoras    El número de horas del curso.
     */
    public Curso(String nombre, String descripcion, int numHoras) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numHoras = numHoras;
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del curso.
     *
     * @return La descripción del curso.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el número de horas del curso.
     *
     * @return El número de horas del curso.
     */
    public int getNumHoras() {
        return numHoras;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombre El nombre del curso.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la descripción del curso.
     *
     * @param descripcion La descripción del curso.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Establece el número de horas del curso.
     *
     * @param numHoras El número de horas del curso.
     */
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }


    /**
     * Devuelve una representación en forma de cadena del objeto Curso.
     *
     * @return Una cadena que contiene el nombre, la descripción, el número de horas y los alumnos inscritos del curso.
     */
    @Override
    public String toString() {
        String infoCurso = nombre + ", descripción: " + descripcion + ", número de horas: " + numHoras;
   
        return infoCurso;
    }
}