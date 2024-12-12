/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

import MODELO.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

    /**
     * Valida si el correo electrónico ingresado tiene un formato correcto.
     * 
     * @param correo El correo electrónico ingresado por el usuario.
     * @return `true` si el correo es válido, `false` en caso contrario.
     */
    public boolean valCorreo(String correo) {
        // Expresión regular para verificar un formato básico de correo electrónico
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zAOL]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    /**
     * Valida si la contraseña cumple con los requisitos mínimos (mínimo 6 caracteres).
     * 
     * @param contrasena La contraseña ingresada por el usuario.
     * @return `true` si la contraseña es válida, `false` en caso contrario.
     */
    public boolean valContraseña(String contrasena) {
        // La contraseña debe tener al menos 6 caracteres
        if (contrasena.length() < 6) {
            return false;
        }
        return true;
    }

    /**
     * Valida si el correo electrónico y la contraseña no están vacíos.
     * 
     * @param correo El correo electrónico ingresado.
     * @param contrasena La contraseña ingresada.
     * @return `true` si ambos campos no están vacíos, `false` en caso contrario.
     */
    public boolean camposNoVacios(String correo, String contrasena) {
        if (correo.trim().isEmpty() || contrasena.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Valida si el usuario y la contraseña ingresados existen en la base de datos
     * y retorna el tipo de usuario (profesor, alumno, administrador).
     * 
     * @param usuario El nombre de usuario ingresado.
     * @param contrasena La contraseña ingresada.
     * @return El tipo de usuario (profesor, alumno, administrador) si las credenciales son válidas,
     *         `null` si no es válido.
     */
public boolean validarUsuario(String usuario, String contrasena) {
    boolean esValido = false;
    String sql = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";

    try (Connection conn = ConexionDB.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        // Establecer los parámetros de la consulta
        pst.setString(1, usuario);
        pst.setString(2, contrasena); // Asegúrate de usar un hash para la contraseña en una aplicación real

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();
        
        // Si se encuentra un usuario con las credenciales proporcionadas, es válido
        if (rs.next()) {
            esValido = true;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return esValido;
}
}
