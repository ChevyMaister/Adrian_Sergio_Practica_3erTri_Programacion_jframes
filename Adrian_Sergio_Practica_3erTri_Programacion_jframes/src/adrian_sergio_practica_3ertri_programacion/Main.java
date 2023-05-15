/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

import java.util.HashMap;

/**
 *
 * @author Chevy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //HOLA SERGIO GOMEZ
    public static void main(String[] args) {
        GestionesDeBD baseDatos = new GestionesDeBD();
        baseDatos.Datos("DatosDeBBDD.txt");
        baseDatos.crearDB();
        
        HashMap<String, Alumno> listaAlumnos = new HashMap();
        HashMap<String, Curso> listaCursos = new HashMap();

        PrincipalJFrame panelPrincipal = new PrincipalJFrame(listaAlumnos, listaCursos);

        GestionCursos gesC = new GestionCursos(listaCursos);
        panelPrincipal.setVisible(true);
    }

}
