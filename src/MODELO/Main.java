
package MODELO;

/**
 *
 * @author ALEJANDRO
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // Obtener conexión a la base de datos
        Connection con = ConexionDB.conectar();
        
        if (con != null) {
            try {
                // Crear una declaración (statement) para ejecutar consultas SQL
                Statement stmt = con.createStatement();

                // Consulta SQL para obtener los usuarios
                String sql = "SELECT * FROM usuarios";
                ResultSet rs = stmt.executeQuery(sql);

                // Mostrar los resultados de la consulta
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre"));
                }

                // Cerrar el ResultSet y la conexión
                rs.close();
            } catch (Exception e) {
                System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            } finally {
                // Asegurarse de cerrar la conexión después de usarla
                ConexionDB.cerrarConexion(con);
            }
        }
    }
}
