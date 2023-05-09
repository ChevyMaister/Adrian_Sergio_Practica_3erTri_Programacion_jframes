/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_sergio_practica_3ertri_programacion;

/**
 *
 * @author Chevy
 */
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

public class Utiles {

    // Método para validar que el DNI tenga 8 cifras y una letra
    public boolean validarDNI(String dni) {
        boolean valido = false;
        if (dni.length() == 9) {
            boolean tieneLetra = false;
            boolean tieneNumeros = true;
            for (int i = 0; i < 8 && tieneNumeros; i++) {
                char c = dni.charAt(i);
                if (!Character.isDigit(c)) {
                    tieneNumeros = false;
                }
            }
            char letra = dni.charAt(8);
            if (Character.isLetter(letra)) {
                tieneLetra = true;
            }
            if (tieneLetra && tieneNumeros) {
                valido = true;
            }
        }
        return valido;
    }

    // Método para validar que el correo tenga una @
    public boolean validarCorreo(String correo) {
        return correo.contains("@");
    }

    // Método para validar que el número de teléfono tenga 9 dígitos
    public boolean validarTelefono(String telefono) {
        if (esNumero(telefono)) {
            return telefono.length() == 9;
        } else {
            return esNumero(telefono);
        }
    }

    // Método para validar que un String es un número
    public boolean esNumero(String num) {
        boolean esNumero = true;
        for (int i = 0; i < num.length() && esNumero; i++) {
            char n = num.charAt(i);
            if (!Character.isDigit(n)) {
                esNumero = false;
            }
        }
        return esNumero;
    }

    // Método para comprobar si un alumno existe en el HashMap de lista de alumnos
    public boolean existeAlumno(String dni, HashMap<String, Alumno> listaAlumnos) {
        return listaAlumnos.containsKey(dni);
    }

    // Método para comprobar si un curso existe en el HashMap de cursos
    public boolean existeCurso(String nombre, Map<String, Curso> cursos) {
        if (cursos.containsKey(nombre)) {
            return true;
        }
        return false;
    }

    //metodo para comprobar que es mas de X caracteres
    public boolean validarLongitud(String dato, int num) {
        if (dato.length() >= num) {
            return dato.length() >= num;
        } else {
            return false;
        }
    }

    public boolean esNumeroC(String num) {
        int n;
        if (esNumero(num)) {
            if (!num.equals("")) {
                n = Integer.parseInt(num);
            } else {
                n = 0;
            }
            if (n > 0) {
                return true;
            }
        }
        return false;
    }

}
