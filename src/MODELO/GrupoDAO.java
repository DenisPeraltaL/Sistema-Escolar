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
import java.util.List;

public class GrupoDAO {
    
    // Inserta un grupo y devuelve el id generado
    public int insertarGrupo(String nombreGrupo, int idProfesor) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int idGrupo = -1;
        try {
            conn = ConexionDB.getConnection();
            String sql = "INSERT INTO grupos (nombre_grupo, id_profesor) VALUES (?, ?) RETURNING id";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nombreGrupo);
            pst.setInt(2, idProfesor);
            rs = pst.executeQuery();
            if(rs.next()) {
                idGrupo = rs.getInt("id");
            }
        } finally {
            if(rs != null) rs.close();
            if(pst != null) pst.close();
            if(conn != null) conn.close();
        }
        return idGrupo;
    }

    // Inserta las materias del grupo en grupos_materias
    public void insertarMateriasDelGrupo(int idGrupo, List<Materia> materias) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = ConexionDB.getConnection();
            String sql = "INSERT INTO grupos_materias (id_grupo, id_materia) VALUES (?, ?)";
            pst = conn.prepareStatement(sql);
            for(Materia mat : materias) {
                pst.setInt(1, idGrupo);
                pst.setInt(2, mat.getId());
                pst.addBatch();
            }
            pst.executeBatch();
        } finally {
            if(pst != null) pst.close();
            if(conn != null) conn.close();
        }
    }

    // Lógica completa para insertar un grupo con sus materias
    public void crearGrupo(Grupo grupo) throws SQLException {
        // Primero insertar el grupo
        int idGrupo = insertarGrupo(grupo.getNombre(), grupo.getIdProfesor());
        if(idGrupo == -1) {
            throw new SQLException("No se pudo obtener el id del grupo");
        }
        // Insertar las materias del grupo
        insertarMateriasDelGrupo(idGrupo, grupo.getMaterias());
    }
}

