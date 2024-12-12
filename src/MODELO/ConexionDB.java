/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author ALEJANDRO
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/hope"; // Asegúrate de que la URL y la base de datos sean correctas
    private static final String USER = "postgres"; // Cambia por el nombre de tu usuario
    private static final String PASSWORD = "Dpl123456"; // Cambia por tu contraseña

    // Método para establecer una conexión con la base de datos
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    // Método para obtener la conexión, puedes usarlo en lugar de conectar()
    public static Connection getConnection() {
        return conectar(); // Se puede reutilizar el método conectar() para obtener la conexión
    }
}
