/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author ALEJANDRO
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    
    public static boolean agregarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumnos (nombre, apellido_paterno, apellido_materno, numero_control, correo, telefono, genero) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, alumno.getNombre());
            stmt.setString(2, alumno.getApellidoPaterno());
            stmt.setString(3, alumno.getApellidoMaterno());
            stmt.setString(4, alumno.getNumeroControl());
            stmt.setString(5, alumno.getCorreo());
            stmt.setString(6, alumno.getTelefono());
            stmt.setString(7, alumno.getGenero());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Alumno> obtenerAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumnos";
        
        try (Connection conn = ConexionDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Alumno alumno = new Alumno(
                    rs.getString("nombre"),
                    rs.getString("apellido_paterno"),
                    rs.getString("apellido_materno"),
                    rs.getString("numero_control"),
                    rs.getString("correo"),
                    rs.getString("telefono"),
                    rs.getString("genero")
                );
                alumno.setId(rs.getInt("id"));
                alumnos.add(alumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alumnos;
    }
}
