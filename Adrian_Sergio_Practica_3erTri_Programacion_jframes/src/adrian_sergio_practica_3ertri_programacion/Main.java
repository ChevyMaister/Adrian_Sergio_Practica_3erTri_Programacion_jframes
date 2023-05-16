package adrian_sergio_practica_3ertri_programacion;

/**
 * Esta es la clase principal del programa.
 */
public class Main {

    /**
     * El método main es el punto de entrada del programa.
     *
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Se crea una instancia de la clase GestionesDeBD
        GestionesDeBD bd = new GestionesDeBD();
        
        // Se cargan los datos con los parametros necesarios para abrir la BBDD de PHPMYADMIN desde un archivo llamado "DatosDeBBDD.txt"
        bd.Datos("DatosDeBBDD.txt");
        
        // Se crea una base de datos
        bd.crearDB();
        
        // Se crea una instancia de la clase PrincipalJFrame
        PrincipalJFrame panelPrincipal = new PrincipalJFrame();
        
        // Se muestra el panel principal
        panelPrincipal.setVisible(true);
    }
}
