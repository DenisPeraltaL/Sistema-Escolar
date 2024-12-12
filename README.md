# Sistema escolar "Hope"
Proyecto final sobre sistema escolar
**Equipo 14**
Rodriguez Alavés Alejandro
Peralta López Denis

# 1.Descripción del proyecto.


# 2.Instrucciones de instalación y configuración.


# 3.Explicación del funcionamiento y la estructura de la base de datos.


# 4.Resumen de cada clase y sus responsabilidades.
## MODELO
### Alumno

En modelo, tenemos la clase Alumno que representa un modelo para almacenar la información de un alumno.
En ella podemos encontrar sus atributos, constructor y métodos setters y getters.

```java
    package MODELO;
    public class Alumno {
        private int id;
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String numeroControl;
        private String correo;
        private String telefono;
        private String genero;
    
        // Constructor
        public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, 
                      String numeroControl, String correo, String telefono, String genero) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.numeroControl = numeroControl;
            this.correo = correo;
            this.telefono = telefono;
            this.genero = genero;
        }
    
        // Getters y Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
    
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
    
        public String getApellidoPaterno() { return apellidoPaterno; }
        public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    
        public String getApellidoMaterno() { return apellidoMaterno; }
        public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    
        public String getNumeroControl() { return numeroControl; }
        public void setNumeroControl(String numeroControl) { this.numeroControl = numeroControl; }
    
        public String getCorreo() { return correo; }
        public void setCorreo(String correo) { this.correo = correo; }
    
        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }
    
        public String getGenero() { return genero; }
        public void setGenero(String genero) { this.genero = genero; }
    }
```

### AlumnoDAO

La clase AlumnoDAO (Data Access Object) se encarga de la comunicación con la base de datos. Su función principal es realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para la tabla de alumnos en la base de datos, esto nos permite agregar alumnos a la base de datos y obtener alumnos almacenados en la base de datos.

```java
    package MODELO;
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
```

### ConexionBD

La clase ConexionDB se encarga de gestionar la conexión entre una aplicación Java y una base de datos PostgreSQL, permitiendo establecer, reutilizar y cerrar conexiones de forma eficiente. Esta clase contiene tres métodos principales: conectar(), que establece una conexión con la base de datos utilizando la URL, el usuario y la contraseña definidos como constantes; cerrarConexion(Connection con), que cierra de forma segura la conexión para liberar recursos; y getConnection(), que actúa como un método de acceso para obtener una conexión reutilizando el método conectar(). Esta clase es esencial para ejecutar consultas SQL desde la aplicación, ya que facilita el acceso a la base de datos y la administración de las conexiones de forma centralizada.

```java
    package MODELO;
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
```

### Grupo

La clase Grupo cuenta con atributos como id, nombre, idProfesor y una lista de objetos Materia que están asociadas al grupo. Esta clase nos permite crear instancias de grupos con un nombre, un identificador del profesor responsable y una lista de materias asignadas. Además, incluye un constructor vacío y otro que inicializa sus atributos, junto con métodos getter y setter para acceder y modificar cada uno de ellos. La clase facilita la organización de los grupos, asignando a cada uno un conjunto de materias y un profesor responsable.

```java
    package MODELO;
    import java.util.List;
    
    public class Grupo {
        private int id;
        private String nombre;
        private int idProfesor;  
        private List<Materia> materias;  // Lista de materias asociadas
    
        public Grupo() {
        }
    
        public Grupo(String nombre, int idProfesor, List<Materia> materias) {
            this.nombre = nombre;
            this.idProfesor = idProfesor;
            this.materias = materias;
        }
    
        // Getters y Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
    
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
    
        public int getIdProfesor() { return idProfesor; }
        public void setIdProfesor(int idProfesor) { this.idProfesor = idProfesor; }
    
        public List<Materia> getMaterias() { return materias; }
        public void setMaterias(List<Materia> materias) { this.materias = materias; }
    }
```

### GrupoDAO

La clase GrupoDAO se encarga de gestionar la interacción con la base de datos para las operaciones relacionadas con los grupos. Su principal objetivo es permitir la inserción de un grupo y sus materias asociadas en la base de datos. La clase cuenta con el método insertarGrupo, que inserta un nuevo grupo y devuelve su id generado automáticamente por la base de datos. También tiene el método insertarMateriasDelGrupo, que asocia las materias a un grupo en la tabla grupos_materias. Finalmente, el método crearGrupo combina ambas acciones, primero insertando el grupo y luego asignándole sus materias correspondientes. Además, se utilizan conexiones de base de datos administradas por ConexionDB.

```java
    package MODELO;
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
```
    
### Horario

La clase Horario nos permite almacenar la información relacionada con una materia específica, incluyendo el día de la semana, la hora de inicio y fin de la clase, así como el aula asignada. Esta clase cuenta con un constructor que inicializa todos sus atributos y métodos getter y setter para acceder y modificar cada uno de ellos, facilitando la manipulación de la información del horario. Esta clase se utiliza para generar, modificar o visualizar los horarios de clases de los estudiantes o profesores en nuestro sistema escolar.

```java
    package MODELO;
    
    public class Horario {
        private String materia;
        private String dia;
        private String horaInicio;
        private String horaFin;
        private String aula;
    
        // Constructor
        public Horario(String materia, String dia, String horaInicio, String horaFin, String aula) {
            this.materia = materia;
            this.dia = dia;
            this.horaInicio = horaInicio;
            this.horaFin = horaFin;
            this.aula = aula;
        }
    
        // Getters y setters
        public String getMateria() {
            return materia;
        }
    
        public void setMateria(String materia) {
            this.materia = materia;
        }
    
        public String getDia() {
            return dia;
        }
    
        public void setDia(String dia) {
            this.dia = dia;
        }
    
        public String getHoraInicio() {
            return horaInicio;
        }
    
        public void setHoraInicio(String horaInicio) {
            this.horaInicio = horaInicio;
        }
    
        public String getHoraFin() {
            return horaFin;
        }
    
        public void setHoraFin(String horaFin) {
            this.horaFin = horaFin;
        }
    
        public String getAula() {
            return aula;
        }
    
        public void setAula(String aula) {
            this.aula = aula;
        }
    }
```

### Materia

La clase Materia representa una materia académica con dos atributos principales: un identificador único (id) y el nombre de la materia (nombre). Esta clase también cuenta con un constructor para inicializar estos atributos, métodos getter para acceder a ellos y una sobrescritura del método toString(), que devuelve el nombre de la materia como una representación en texto. Esta clase nos servirá para almacenar y mostrar la información de las materias dentro de nuestro sistema.

```java
    package MODELO;
    public class Materia {
        private int id;
        private String nombre;
    
        public Materia(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }
    
        public int getId() { return id; }
        public String getNombre() { return nombre; }
        
        @Override
        public String toString() {
            return nombre;
        }
    }
```

### MateriaDAO

La clase MateriaDAO se encarga de gestionar las operaciones de acceso a datos relacionadas con las materias en nuestra base de datos de postgres. El método listarTodas() obtiene todas las materias almacenadas en la tabla materias de la base de datos. Realiza una consulta SQL para seleccionar los identificadores (id) y los nombres (nombre_materia) de las materias, y luego los almacena en una lista de objetos Materia. Al finalizar la operación, cierra la conexión con la base de datos y retorna la lista de materias.

```java
    package MODELO;
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
```    
    
### Profesor

La clase Profesor almacena información personal y profesional. Tiene atributos como el nombre, apellido paterno, apellido materno, teléfono, domicilio, cédula, especialidad y fecha de inicio de labores del profesor. Además, incluye un constructor para inicializar estos atributos y métodos getter y setter para cada uno de los campos, permitiendo acceder y modificar los valores de los atributos. Esta clase la utilizamos en nuestro sistema para encapsular los datos del profesor y facilitar su manejo en el sistema para gestionar la información de los docentes.

```java
    package MODELO;
    
    public class Profesor {
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String telefono;
        private String domicilio;
        private String cedula;
        private String especialidad;
        private String fechaInicio;
    
        // Constructor
        public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, 
                        String domicilio, String cedula, String especialidad, String fechaInicio) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.telefono = telefono;
            this.domicilio = domicilio;
            this.cedula = cedula;
            this.especialidad = especialidad;
            this.fechaInicio = fechaInicio;
        }
    
        // Métodos getter y setter para cada campo
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
    
        public String getApellidoPaterno() { return apellidoPaterno; }
        public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    
        public String getApellidoMaterno() { return apellidoMaterno; }
        public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    
        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }
    
        public String getDomicilio() { return domicilio; }
        public void setDomicilio(String domicilio) { this.domicilio = domicilio; }
    
        public String getCedula() { return cedula; }
        public void setCedula(String cedula) { this.cedula = cedula; }
    
        public String getEspecialidad() { return especialidad; }
        public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
        public String getFechaInicio() { return fechaInicio; }
        public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    }
```

### Usuario

La clase Usuario representa a un usuario en el sistema escolar, con atributos como el nombre de usuario, nombre, apellidos, correo electrónico y tipo de usuario. Tiene un constructor que inicializa estos atributos y métodos getter y setter para cada uno de ellos, permitiendo acceder y modificar los valores. El campo tipoUsuario es para diferenciar entre diferentes tipos de usuarios (en este caso: administrador, profesor, alumno). Esta clase nos sirve  para gestionar la información de los usuarios dentro del sistema, facilitando la manipulación de datos relacionados con la autenticación y gestión de usuarios.

```java
    package MODELO;
    
    public class Usuario {
    
        private String nombreUsuario;
        private String nombre;
        private String apellidos;
        private String correo;
        private String tipoUsuario;
    
        // Constructor
        public Usuario(String nombreUsuario, String nombre, String apellidos, String correo, String tipoUsuario) {
            this.nombreUsuario = nombreUsuario;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.correo = correo;
            this.tipoUsuario = tipoUsuario;
        }
    
        // Getters y Setters
        public String getNombreUsuario() {
            return nombreUsuario;
        }
    
        public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getApellidos() {
            return apellidos;
        }
    
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
    
        public String getCorreo() {
            return correo;
        }
    
        public void setCorreo(String correo) {
            this.correo = correo;
        }
    
        public String getTipoUsuario() {
            return tipoUsuario;
        }
    
        public void setTipoUsuario(String tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
        }
    }
```    

### UsuarioControl

La clase UsuarioControl es la responsable de interactuar con la base de datos para obtener la información de los usuarios y llenar la tabla con estos datos. 

En este caso, el método obtenerUsuarios realiza lo siguiente:

- Ejecuta una consulta SQL para obtener los campos nombre_usuario, nombre, apellidos, correo y tipo_usuario de la tabla usuario. La consulta filtra a los usuarios cuyo tipo_usuario sea 'admin', 'profesor' o 'alumno'.
- Usa el método ConexionDB.conectar() para obtener una conexión a la base de datos.
- Recorre los resultados de la consulta (almacenados en un ResultSet) y agrega cada fila al modelo de tabla, asegurándose de que los valores nulos se manejen correctamente, asignándoles una cadena vacía ("").
- Si ocurre algún error durante la ejecución de la consulta o la conexión, el error se imprime en la consola.
- Antes de agregar nuevos datos, limpia el modelo de la tabla para evitar datos duplicados. Luego, añade una nueva fila por cada usuario encontrado en el ResultSet.

```java
    package MODELO;
    import java.sql.*;
    import javax.swing.table.DefaultTableModel;
    
    public class UsuarioControl {
        // Método para obtener todos los usuarios y llenar el modelo de la tabla
        public static void obtenerUsuarios(DefaultTableModel model) {
            String sql = "SELECT nombre_usuario, nombre, apellidos, correo, tipo_usuario FROM usuario WHERE tipo_usuario IN ('admin', 'profesor', 'alumno')";
    
            try (Connection con = ConexionDB.conectar();
                 PreparedStatement pst = con.prepareStatement(sql);
                 ResultSet rs = pst.executeQuery()) {
    
                // Limpiar la tabla antes de agregar los nuevos datos
                model.setRowCount(0);
    
                // Verificar si hay registros en el ResultSet
                if (!rs.isBeforeFirst()) {
                    System.out.println("No se encontraron registros.");
                } else {
                    // Recorrer el ResultSet y agregar las filas al modelo de la tabla
                    while (rs.next()) {
                        String nombreUsuario = rs.getString("nombre_usuario") != null ? rs.getString("nombre_usuario") : "";
                        String nombre = rs.getString("nombre") != null ? rs.getString("nombre") : "";
                        String apellidos = rs.getString("apellidos") != null ? rs.getString("apellidos") : "";
                        String correo = rs.getString("correo") != null ? rs.getString("correo") : "";
                        String tipoUsuario = rs.getString("tipo_usuario") != null ? rs.getString("tipo_usuario") : "";
    
                        // Agregar la fila al modelo
                        model.addRow(new Object[]{nombreUsuario, nombre, apellidos, correo, tipoUsuario});
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error al obtener los usuarios: " + e.getMessage());
            }
        }
    }
```

### UsuarioDAO

La clase UsuarioDAO interactua con la base de datos para obtener información sobre los usuarios y devolverla como una lista de objetos Usuario. 
Cuenta con los siguientes métodos:
**-obtenerUsuariosDeBaseDeDatos:**
1. Este método se encarga de ejecutar una consulta SQL para obtener los datos de la tabla usuarios en la base de datos.
2. Se usa una conexión a la base de datos mediante conectar(), que establece una conexión con el servidor de la base de datos.
3. Luego, se prepara una sentencia SQL (PreparedStatement) y se ejecuta para obtener los datos del ResultSet.
4. Se recorre el ResultSet, extrayendo los valores de las columnas y creando un objeto Usuario con los datos obtenidos.
5. Cada Usuario creado se agrega a una lista llamada listaUsuarios, que finalmente es retornada.
**-conectar:**
Este método maneja la conexión a la base de datos, utilizando la clase DriverManager para obtener una conexión con las credenciales proporcionadas (en este caso, la URL de la base de datos, el usuario root y la contraseña dpl123456).
Es importante asegurarse de que la URL de la base de datos y tanto el usuario como la contraseña sean correctas según la configuración del servidor de base de datos.

```java
    package MODELO;
    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;
    
    public class UsuarioDAO {
    
        // Método para obtener los usuarios desde la base de datos
        public List<Usuario> obtenerUsuariosDeBaseDeDatos() {
            List<Usuario> listaUsuarios = new ArrayList<>();
            
            String query = "SELECT * FROM usuarios"; // Asegúrate de que la consulta SQL esté correcta
            
            try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {
                
                // Recorrer el resultado de la consulta y agregar cada usuario a la lista
                while (rs.next()) {
                    String nombreUsuario = rs.getString("nombreUsuario");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    String correo = rs.getString("correo");
                    String tipoUsuario = rs.getString("tipoUsuario");
                    
                    // Crear un objeto Usuario con los datos obtenidos de la base de datos
                    Usuario usuario = new Usuario(nombreUsuario, nombres, apellidos, correo, tipoUsuario);
                    
                    // Agregar el usuario a la lista
                    listaUsuarios.add(usuario);
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de errores
            }
            
            return listaUsuarios;
        }
    
        // Método de conexión a la base de datos
        private Connection conectar() throws SQLException {
            // Aquí va la lógica de conexión a tu base de datos
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_final", "root", "dpl123456");
        }
    }
```

## CONTROLADOR

##RegistroUsuario
Esta clase se encarga de registrar un nuevo usuario en la base de datos. Contiene un método llamado registrarUsuario que recibe cuatro parámetros: nombreUsuario, correo, contrasena y tipoUsuario. Este método establece una conexión con la base de datos a través de la clase ConexionDB. Si la conexión es exitosa, prepara una sentencia SQL para insertar los datos del nuevo usuario en la tabla usuarios. Los valores de los parámetros se asignan a la consulta utilizando un PreparedStatement. Luego, ejecuta la consulta y, si se insertan filas correctamente, devuelve true, indicando que el registro fue exitoso. Si ocurre algún error durante el proceso, el método maneja la excepción SQLException y devuelve false, indicando que el registro falló.

```java
package CONTROL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import MODELO.ConexionDB;

public class RegistroUsuario {
    public boolean registrarUsuario(String nombreUsuario, String correo, String contrasena, String tipoUsuario) {
        Connection conn = ConexionDB.conectar();
        if (conn != null) {
            String query = "INSERT INTO usuarios (nombre_usuario, correo, contrasena, tipo_usuario) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                // Setear los valores de los parámetros
                pstmt.setString(1, nombreUsuario);
                pstmt.setString(2, correo);
                pstmt.setString(3, contrasena);
                pstmt.setString(4, tipoUsuario);

                // Ejecutar la consulta
                int filasInsertadas = pstmt.executeUpdate();
                if (filasInsertadas > 0) {
                    return true;  // Usuario registrado exitosamente
                }
            } catch (SQLException ex) {
                System.out.println("Error al insertar el usuario: " + ex.getMessage());
            }
        }
        return false;
    }
}
```

### Validacion
La clase Validacion tiene métodos para verificar diferentes aspectos relacionados con los datos de un usuario. Contiene métodos para validar el formato del correo electrónico (valCorreo), asegurando que siga una expresión regular básica para correos electrónicos. También valida que la contraseña tenga al menos 6 caracteres a través del método valContraseña. El método camposNoVacios verifica que tanto el correo como la contraseña no estén vacíos. Además, el método validarUsuario realiza una consulta en la base de datos para comprobar si las credenciales proporcionadas (usuario y contraseña) existen, retornando true si son válidas y false si no lo son. Este último método es esencial para la autenticación de usuarios en la aplicación.

```java
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
     * Valida si la contraseña cumple con los requisitos mínimos (mínimo 6 caracteres)
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
```

### ValidacionUsuario
La clase ValidacionUsuario proporciona varios métodos estáticos para realizar validaciones relacionadas con los datos de un usuario. El método camposNoVacios verifica que los campos de correo y contraseña no estén vacíos. El método valCorreo valida que el formato del correo electrónico sea correcto utilizando una expresión regular. Por su parte, valContraseña asegura que la contraseña tenga al menos 6 caracteres. Finalmente, el método tipoUsuarioValido comprueba que el tipo de usuario no sea el valor predeterminado ("Tipo de usuario"). Estos métodos son útiles para asegurar que los datos proporcionados por los usuarios sean correctos antes de proceder con su registro o autenticación.

```java
package CONTROL;

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
```

## VISTA
