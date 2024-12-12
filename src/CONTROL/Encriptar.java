
package CONTROL;

/**
 *
 * @author Denis Peralta
 */
public class Encriptar {
    static String diccionario = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static int claveBase = 79;
    
    public static int encrip(String x) {
        int resultado = claveBase; // Inicializar el valor para el cálculo
        for (int i = 0; i < x.length(); i++) {
            char caracter = x.charAt(i);
            int indice = diccionario.indexOf(caracter);

            if (indice == -1) { // Si el carácter no está en el diccionario
                throw new IllegalArgumentException("Caracter no válido: " + caracter);
            }

            resultado = (resultado * 13 + indice); // Calcular nuevo valor
        }
        return resultado;
    }
  
}