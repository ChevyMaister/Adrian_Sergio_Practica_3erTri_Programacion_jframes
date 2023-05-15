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
    
    public static void main(String[] args) {
        GestionesDeBD baseDatos = new GestionesDeBD();
        baseDatos.Datos("DatosDeBBDD.txt");
        baseDatos.crearDB();
        PrincipalJFrame panelPrincipal = new PrincipalJFrame();
        GestionCursos gesC = new GestionCursos();
        panelPrincipal.setVisible(true);
        
    }

}
