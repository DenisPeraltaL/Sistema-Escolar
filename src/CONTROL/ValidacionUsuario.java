/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

/**
 *
 * @author ALEJANDRO
 */
public class ValidacionUsuario {

    // Validar que los campos no estén vacíos
    public static boolean camposNoVacios(String correo, String contrasena) {
        return !(correo.isEmpty() || contrasena.isEmpty());
    }

    // Validar formato de correo
    public static boolean valCorreo(String correo) {
        return correo.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    // Validar que la contraseña tenga al menos 6 caracteres
    public static boolean valContraseña(String contrasena) {
        return contrasena.length() >= 6;
    }

    // Validar que el tipo de usuario sea válido
    public static boolean tipoUsuarioValido(String tipoUsuario) {
        return !tipoUsuario.equals("Tipo de usuario");
    }
}
