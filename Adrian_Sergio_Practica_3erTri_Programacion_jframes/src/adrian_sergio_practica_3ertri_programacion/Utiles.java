package adrian_sergio_practica_3ertri_programacion;

import java.util.HashMap;
import java.util.Map;

public class Utiles {

    /**
     * Método para validar que el DNI tenga 8 cifras y una letra , devolvera un
     * true si las dos condiciones son aprobadas correctamente
     *
     * @param dni
     * @return boolean
     */
    public boolean validarDNI(String dni) {
        boolean valido = false;
        if (dni.length() == 9) {// comprueba que el dni sea de 9 caracteres de longitud y que 8 sean digitos ( numeros ) y 1 caracteres ( letras )
            boolean tieneLetra = false;
            boolean tieneNumeros = true;
            for (int i = 0; i < 8 && tieneNumeros; i++) {//recorro todo menos el ultimo caracter para comprobar que hasta ahi son numeros
                char c = dni.charAt(i);
                if (!Character.isDigit(c)) {
                    tieneNumeros = false;
                }
            }
            char letra = dni.charAt(8);
            if (Character.isLetter(letra)) {// y aqui comprueba si el ultimo caracter es una letrra con Character.isLetter
                tieneLetra = true;
            }
            if (tieneLetra && tieneNumeros) {
                valido = true;
            }
        }
        return valido;
    }

    /**
     * Método para validar que el correo tenga una @
     *
     * @param correo
     * @return
     */
    public boolean validarCorreo(String correo) {
        return correo.contains("@");
    }

    /**
     * Método para validar que el número de teléfono tenga 9 dígitos
     *
     * @param telefono
     * @return
     */
    public boolean validarTelefono(String telefono) {
        if (esNumero(telefono)) {//comprueba que es un numero con el metodo telefono
            return telefono.length() == 9;//comprueba que el numero tiene una longitud igual a 9 
        } else {
            return esNumero(telefono);
        }
    }

    /**
     * Método para validar que un String es un número
     *
     * @param num
     * @return
     */
    public boolean esNumero(String num) {
        boolean esNumero = true;

        for (int i = 0; i < num.length() && esNumero; i++) {
            char n = num.charAt(i);
            if (!Character.isDigit(n)) {//comprueba si son digitos ( numeros )
                esNumero = false;
            }
        }

        return esNumero;
    }

    /**
     * Método para validar que un String es un número float y devolverlo ( entre
     * 0 y 10 )
     *
     * @param num
     * @return
     */
    public float esNotaValida(String num) {
        try {
            float valor = Float.parseFloat(num);
            if (valor >= 0 && valor <= 10) {
                return valor;
            }
        } catch (NumberFormatException e) {
            // no hacer nada
        }
        return -1;
    }

    /**
     * metodo para comprobar que es mas de X caracteres
     *
     * @param dato Texto entrante
     * @param num , sera el tamaño exacto al que queramos limitar el texto
     * entrate
     * @return boolean
     */
    public boolean validarLongitud(String dato, int num) {
        if (dato.length() >= num) { //si el string es mas largo o igual que el numero introducido para limitar 
            return dato.length() >= num;//devuleve que el dato es verdadero
        } else {
            return false;//en caso de que no lo sea nos devolvera false
        }
    }

    /**
     * metodo para comprobar que es numero mayor de 0 despues de haber
     * comprobado con el metodo esNumeroCur que el numero introducido es un
     * numero y menos de 5 digitos de longitud
     *
     * @param num
     * @return boolean
     */
    public boolean esNumeroC(String num) {
        int n;
        if (esNumeroCur(num)) {//Si el String num es un numero y menor o igual que 5 de longitud 
            if (!num.equals("")) {//tambien comprueba que no sea null , si es null sera igual a 0 
                n = Integer.parseInt(num);//despues de todas las comprobaciones lo transforma en un int para comprobar si es mayor que cero 
            } else {
                n = 0;
            }
            if (n > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Recibe un string que sera el numero de horas para un curso , primero
     * comprueba que ese String tiene menos de 5 carcarteres y despues recore el
     * String para comprobar que cada caracter sea un nidmero ( Digito ) Si no
     * es un digito devolvera false lo cual enviaremos al metodo de esNumeroC
     * para comprobar que dicho numero es mayor que cero
     *
     * @param num
     * @return esNumeroC
     */
    public boolean esNumeroCur(String num) {
        boolean esNumeroC = true;
        if (num.length() <= 5) {//compruebo que el string es mas largo de 5 caracteres 
            for (int i = 0; i < num.length() && esNumeroC; i++) {
                char n = num.charAt(i);
                if (!Character.isDigit(n)) {//compruebo que cada caracter del string es un nuemero 
                    esNumeroC = false;
                }
            }
        } else {
            esNumeroC = false;
        }
        return esNumeroC;
    }
}
