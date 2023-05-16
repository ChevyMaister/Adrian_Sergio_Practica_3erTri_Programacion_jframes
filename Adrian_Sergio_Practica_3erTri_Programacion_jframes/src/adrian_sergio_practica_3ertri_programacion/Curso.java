
package adrian_sergio_practica_3ertri_programacion;

import java.util.ArrayList;

public class Curso {
    private String nombre ;
    private String descripcion ;
    private int numHoras;
    private ArrayList <Alumno> alumnosInscritos; 

    public Curso(String nombre, String descripcion, int numHoras) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numHoras = numHoras;
        alumnosInscritos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(ArrayList<Alumno> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }
    
   @Override
    public String toString() {
        String infoCurso = nombre +" ,descripcion: " + descripcion + " ,numero de horas: " + numHoras + " ,alumnos inscritos: ";
        if (!alumnosInscritos.isEmpty()) {
            for (int i=0;i<alumnosInscritos.size();i++) {
                infoCurso = infoCurso + " " + alumnosInscritos.get(i);
            }
        } else {
            infoCurso += " Todavia no tiene alumnos";
        }
        return infoCurso;
    }
    
}
