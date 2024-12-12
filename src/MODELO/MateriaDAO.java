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

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAO {

    public List<Materia> listarTodas() {
        List<Materia> lista = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = ConexionDB.getConnection();
            String sql = "SELECT id, nombre_materia FROM materias";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre_materia");
                lista.add(new Materia(id, nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if(rs!=null) rs.close(); } catch(SQLException ex){}
            try { if(pst!=null) pst.close(); } catch(SQLException ex){}
            try { if(conn!=null) conn.close(); } catch(SQLException ex){}
        }
        return lista;
    }
}

