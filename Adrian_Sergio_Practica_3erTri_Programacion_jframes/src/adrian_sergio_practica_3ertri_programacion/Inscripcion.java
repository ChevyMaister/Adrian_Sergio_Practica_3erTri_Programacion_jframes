/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.util.Date;

/**
 * La clase Inscripcion representa una inscripción de un alumno a un curso.
 * Contiene información sobre el alumno, el curso, las fechas de inicio y fin, y
 * la calificación obtenida.
 */
public class Inscripcion {

    private String dni; // DNI del alumno
    private String nombre_curso; // Nombre del curso
    private Date fechaInicio; // Fecha de inicio de la inscripción
    private Date fechaFin; // Fecha de finalización de la inscripción
    private float calificacion; // Calificación obtenida en el curso

    public Inscripcion(String dni, String nombre_curso) {
        this.dni = dni;
        this.nombre_curso = nombre_curso;
        this.fechaInicio = new Date();
 
    }

    
    /**
     * Obtiene el DNI del alumno.
     *
     * @return El DNI del alumno.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del alumno.
     *
     * @param dni El DNI del alumno.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombreCurso() {
        return nombre_curso;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombre_curso El nombre del curso.
     */
    public void setNombreCurso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    /**
     * Obtiene la fecha de inicio de la inscripción.
     *
     * @return La fecha de inicio de la inscripción.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la inscripción.
     *
     * @param fechaInicio La fecha de inicio de la inscripción.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de fin de la inscripción.
     *
     * @return La fecha de fin de la inscripción.
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de fin de la inscripción.
     *
     * @param fechaFin La fecha de fin de la inscripción.
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene la calificación obtenida en el curso.
     *
     * @return La calificación obtenida en el curso.
     */
    public float getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación obtenida en el curso.
     *
     * @param calificacion La calificación obtenida en el curso.
     */
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
