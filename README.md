# Sistema escolar "Hope"
Proyecto final sobre sistema escolar
**Equipo 14**

Rodriguez Alavez Alejandro

Peralta López Denis


# 1.Descripción del proyecto.

Nuestro proyecto consiste en desarrollar un Sistema Escolar utilizando la arquitectura MVC (Modelo-Vista-Controlador). Este sistema busca facilitar la gestión de la información de alumnos, profesores, usuarios, grupos, materias y horarios. Además, permite la interacción entre los diferentes usuarios del sistema. El sistema también garantiza la seguridad de la información y la diferenciación de roles de usuarios.

La estructura del proyecto está organizada de la siguiente manera:

*1. Estructura MVC*

-Modelo-

La capa donde se define la lógica del sistem y la conexión a la base de datos. Contiene las clases que representan a los objetos clave del sistema, como Usuarios, Alumnos, Profesores, Grupos, Materias y Horarios y también se encarga de ejecutar consultas SQL para la gestión de la información almacenada en la base de datos PostgreSQL.
Esta capa de modelo se comunica directamente con la base de datos (PostgreSQL) para realizar operaciones de consulta, inserción, actualización y eliminación de registros (CRUD).

-Vista-

Es la interfaz gráfica de usuario (GUI) que permite la interacción con el sistema. Aqui los usuarios pueden visualizar, ingresar y consultar información de manera sencilla e intuitiva. La vista está diseñada para ser fácil de usar y accesible, con formularios de entrada de datos, botones de acción y tablas de visualización de información.

-Controlador-
La capa intermediaria que gestiona la comunicación entre la Vista y el Modelo. Se encarga de procesar las solicitudes del usuario, invocar los métodos del modelo y actualizar la vista de acuerdo con la información obtenida. También se encarga de la validación de los formularios y la gestión de errores.


2. Módulos del Proyecto

1. Gestión de Usuarios (CRUD):
- Crear, Leer, Actualizar y Eliminar usuarios.
- Dos niveles de usuarios con permisos diferenciados: Administrador y Usuario Estándar.
- Los administradores tienen acceso a todas las funciones, mientras que los usuarios estándares tienen permisos restringidos.
- Validación de los campos de entrada de datos (por ejemplo, que no existan campos vacíos y que el correo sea válido).
2. Gestión de Alumnos (CRUD):
- Registro, consulta, modificación y eliminación de información de los alumnos.
- Asignación de los alumnos a grupos específicos.
- Los datos de los alumnos incluyen nombre, apellidos, número de control, correo electrónico, teléfono y género.

2. Gestión de Profesores (CRUD):
- Registro, consulta, modificación y eliminación de información de los profesores.
- Los datos de los profesores incluyen nombre, apellidos, teléfono, domicilio y cédula profesional.

3. Gestión de Grupos:
- Creación de grupos asignados a un profesor responsable.
- Asignación de alumnos a grupos.
- Relación de los grupos con las materias que se imparten.

4. Gestión de Materias (CRUD):
- Registro, consulta, modificación y eliminación de información de las materias.
- Asignación de las materias a grupos y profesores.
- Definición de horarios de las materias, incluyendo día de la semana, hora de inicio y hora de fin.

*Horarios de Profesores:*
- Registro de los horarios en los que los profesores imparten clases.
- Asignación de días y horas para cada materia en función del grupo asignado.

*Autenticación y Seguridad:*
-Sistema de autenticación para el acceso de usuarios con diferentes niveles de acceso.
-Contraseñas cifradas para proteger la seguridad de los usuarios.
-Control de sesión para evitar el acceso no autorizado.

*Validación de Campos Requeridos:*
-Todos los formularios de entrada de datos validan que no haya campos vacíos.
-Validación de la longitud y formato de campos como el correo electrónico y la contraseña.


3. Conexión a la Base de Datos

El sistema está conectado a una base de datos PostgreSQL que almacena la información de usuarios, alumnos, profesores, grupos, materias y horarios. La estructura de la base de datos incluye las siguientes tablas:

- Usuarios: Almacena información de los usuarios, incluyendo nombre de usuario, nombre completo, correo, contraseña y tipo de usuario.
- Alumnos: Almacena información de los alumnos, incluyendo nombre, apellidos, correo, número de control, teléfono y género.
- Profesores: Contiene la información de los profesores, como nombre, apellidos, teléfono, domicilio y cédula profesional.
- Grupos: Almacena los grupos creados, con su respectivo nombre, fecha de creación y profesor asignado.
- Materias: Almacena las materias registradas, con información sobre el crédito, semestre, aula y horario de la materia.
- Horarios de Profesores: Define los horarios de las clases asignadas a cada profesor, especificando la materia, el día, la hora de inicio y la hora de fin.
- Grupos-Alumnos: Relaciona a los alumnos con los grupos a los que pertenecen.
- Grupos-Materias: Relaciona a los grupos con las materias que cursan.


4. Validaciones de Campos Requeridos
Para garantizar la integridad de los datos ingresados, se establecen validaciones en todos los formularios. Las principales validaciones son:

- Campos obligatorios: Los campos esenciales, como nombre, correo y contraseña, deben completarse antes de enviar el formulario.
- Validación de formato: Los campos de correo electrónico deben tener un formato correcto y las contraseñas deben cumplir con requisitos de longitud y complejidad.
- Mensajes de error amigables: Si ocurre un error de validación, se muestra un mensaje de error claro para que el usuario sepa cómo corregir la información.


# 2.Instrucciones de instalación y configuración.

## Instalación del Proyecto en NetBeans
1. Descarga del Proyecto:

Para comenzar, descarga el proyecto comprimido en formato ZIP desde el repositorio.

![image](https://github.com/user-attachments/assets/6c80ccbb-245d-42d9-9728-1e894f66d3c0)

2. Importación del Proyecto en NetBeans:

Abre NetBeans y dirígete a la pestaña *File* en la barra de menú.
Selecciona *Import Project* y luego haz clic en *From ZIP....*

![Captura de pantalla 2024-11-02 233822](https://github.com/user-attachments/assets/eaf226c6-6ac3-4629-bb97-0b63cd512b5a)

Aparecerá una ventana emergente. En el campo *ZIP File*, haz clic en *Browse* y localiza el archivo ZIP que descargaste.

![image](https://github.com/user-attachments/assets/ff0e77e6-eb12-47db-a4e9-2fe20c431321)

![image](https://github.com/user-attachments/assets/23244809-4a4d-4e68-aa29-be0d11f4a3a1)

Finalmente haz clic en import.

3. Limpieza y Construcción del Proyecto:

Después de importar el proyecto, haz clic derecho sobre el nombre del proyecto en el panel de proyectos y selecciona *Clean and Build*.

![image](https://github.com/user-attachments/assets/5f0840a3-6b40-4a2a-a636-7f8973f2be2d)


# 3.Explicación del funcionamiento y la estructura de la base de datos.
Antes de poner en funcionamiento nuestro proyecto, es necesario crear la base de datos en la que se guardaran todos los registros.
1. Para ello, abriremos nuestra aplicación de pgAdmin4 que ya debemos tener previamente instalada.
2. Despues buscaremos en la parte izquierda de nuestra pantalla donde diga `Databases`, daremos clic drecho sobre `Databases`, despues en `Create` y posteriormente en `Database...`

![image](https://github.com/user-attachments/assets/f8bcd7a0-1d06-40d9-8e00-6bc06bad256e)

Nos abrirá una ventana como la siguiente:

![image](https://github.com/user-attachments/assets/07a29b60-766d-4766-8c07-bd50740fd794)

en la que unicamente tenemos que poner el nobre de nuestra base de datos, en este caso será `hope`.

y listo, habrá quedado creada nuestra base de datos.
la podemos encontrar en `daabases` en la parte izquierda de nuestra pantalla, debemos dar clic sobre ella y hacer clic sobre el icono de `Query tool` ![image](https://github.com/user-attachments/assets/d3356f8e-2848-4e59-91fe-65974a3e6c98)  para conectarnos y poder trabajaar con nuestra base de datos.

![image](https://github.com/user-attachments/assets/1352ad53-b621-4e06-97b3-4115d0e4a120)

Posterior a ello, debemos copiar y pegar este código para la creación de las tablas.
```sql
BEGIN;
CREATE TABLE IF NOT EXISTS public.alumnos
(
    id serial NOT NULL,
    id_usuario integer NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellido_paterno character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellido_materno character varying(50) COLLATE pg_catalog."default",
    numero_control character varying(20) COLLATE pg_catalog."default" NOT NULL,
    correo character varying(100) COLLATE pg_catalog."default" NOT NULL,
    telefono character varying(20) COLLATE pg_catalog."default",
    genero character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT alumnos_pkey PRIMARY KEY (id),
    CONSTRAINT alumnos_correo_key UNIQUE (correo),
    CONSTRAINT alumnos_numero_control_key UNIQUE (numero_control)
);

CREATE TABLE IF NOT EXISTS public.grupos
(
    id serial NOT NULL,
    nombre_grupo character varying(50) COLLATE pg_catalog."default" NOT NULL,
    id_profesor integer NOT NULL,
    fecha_creacion timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT grupos_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.grupos_alumnos
(
    id serial NOT NULL,
    id_grupo integer NOT NULL,
    id_alumno integer NOT NULL,
    fecha_asignacion timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT grupos_alumnos_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.grupos_materias
(
    id serial NOT NULL,
    id_grupo integer NOT NULL,
    id_materia integer NOT NULL,
    CONSTRAINT grupos_materias_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.horarios_profesor
(
    id serial NOT NULL,
    id_profesor integer NOT NULL,
    materia character varying(100) COLLATE pg_catalog."default",
    dia character varying(20) COLLATE pg_catalog."default",
    hora_inicio time without time zone,
    hora_fin time without time zone,
    aula character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT horarios_profesor_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.materias
(
    id serial NOT NULL,
    nombre_materia character varying(100) COLLATE pg_catalog."default" NOT NULL,
    creditos integer NOT NULL,
    aula character varying(50) COLLATE pg_catalog."default",
    semestre integer NOT NULL,
    cupo integer NOT NULL,
    id_profesor integer NOT NULL,
    dia_semana character varying(50) COLLATE pg_catalog."default",
    hora_inicio time without time zone,
    hora_fin time without time zone,
    CONSTRAINT materias_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.profesores
(
    id serial NOT NULL,
    id_usuario integer NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellido_paterno character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellido_materno character varying(50) COLLATE pg_catalog."default",
    telefono character varying(20) COLLATE pg_catalog."default",
    domicilio character varying(100) COLLATE pg_catalog."default",
    cedula character varying(30) COLLATE pg_catalog."default",
    CONSTRAINT profesores_pkey PRIMARY KEY (id),
    CONSTRAINT profesores_cedula_key UNIQUE (cedula)
);

CREATE TABLE IF NOT EXISTS public.usuarios
(
    id serial NOT NULL,
    nombre_usuario character varying(50) COLLATE pg_catalog."default" NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellidos character varying(50) COLLATE pg_catalog."default",
    correo character varying(100) COLLATE pg_catalog."default" NOT NULL,
    contrasena character varying(255) COLLATE pg_catalog."default" NOT NULL,
    tipo_usuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usuarios_pkey PRIMARY KEY (id),
    CONSTRAINT usuarios_correo_key UNIQUE (correo)
);

ALTER TABLE IF EXISTS public.alumnos
    ADD CONSTRAINT alumnos_id_usuario_fkey FOREIGN KEY (id_usuario)
    REFERENCES public.usuarios (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.grupos
    ADD CONSTRAINT grupos_id_profesor_fkey FOREIGN KEY (id_profesor)
    REFERENCES public.profesores (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.grupos_alumnos
    ADD CONSTRAINT grupos_alumnos_id_alumno_fkey FOREIGN KEY (id_alumno)
    REFERENCES public.alumnos (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.grupos_alumnos
    ADD CONSTRAINT grupos_alumnos_id_grupo_fkey FOREIGN KEY (id_grupo)
    REFERENCES public.grupos (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.grupos_materias
    ADD CONSTRAINT grupos_materias_id_grupo_fkey FOREIGN KEY (id_grupo)
    REFERENCES public.grupos (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.grupos_materias
    ADD CONSTRAINT grupos_materias_id_materia_fkey FOREIGN KEY (id_materia)
    REFERENCES public.materias (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.horarios_profesor
    ADD CONSTRAINT horarios_profesor_id_profesor_fkey FOREIGN KEY (id_profesor)
    REFERENCES public.profesores (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.materias
    ADD CONSTRAINT fk_profesor FOREIGN KEY (id_profesor)
    REFERENCES public.profesores (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE IF EXISTS public.profesores
    ADD CONSTRAINT profesores_id_usuario_fkey FOREIGN KEY (id_usuario)
    REFERENCES public.usuarios (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE;
END;
```

Una vez tengamos el codigo en nuestra terminal, simplemente lo ejecutaremos,para ello localizamos el botón de `execute script` ![image](https://github.com/user-attachments/assets/b8093c84-a60f-45d7-921f-0e604c53605a) y le daremos clic

![image](https://github.com/user-attachments/assets/df23bbb4-c6b0-4dae-851b-e502c5681a23)

Si todo salió de forma correcta, podremos visualizar nuestras tablas en `hope` -> `schemas` -> `public` -> `Tables`.
![image](https://github.com/user-attachments/assets/fbfcf428-d6d1-43f2-8efd-332154549622)


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

### Login

En nuestra vista login, se incluye una combinación de validaciones de datos y lógica de negocio para gestionar el inicio de sesión.

![image](https://github.com/user-attachments/assets/e92455bc-0ae8-4478-831a-22a58c7a1ed0)

A continuación, explicaremos cada uno de sus métodos.

**`txtUsuarioFocusLost:`**

Comprueba si el campo de texto txtUsuario está vacío al perder el foco. Si está vacío, muestra un indicador visual (lblObligatorio1) para indicar que es un campo obligatorio.

```java
    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if(txtUsuario.getText().trim().isEmpty()){
            lblObligatorio1.setVisible(true);
        }else{
            lblObligatorio1.setVisible(false);
        }
    }
```

**`txtUsuarioActionPerformed`**

Este evento se activa cuando el usuario presiona Enter mientras está en el campo de texto.

```java
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //leerArchivo();
    }                                          
```                               
**`btnIngreso`**

Este es el método principal para gestionar el inicio de sesión. Obtiene los valores ingresados por el usuario (correo, contraseña y tipoUsuario).
- Validaciones: - 
- Que los campos no estén vacíos.
- El formato del correo sea válido.
- La contraseña cumpla con los requisitos mínimos (al menos 6 caracteres).
- Que el tipo de usuario sea válido.
- Conexión a la base de datos: -
- Consulta en la base de datos si existe un usuario con las credenciales proporcionadas.
- Si las credenciales coinciden:
- Redirige a la vista correspondiente según el tipo de usuario (Profesor, Administrador o Alumno).
- Si no hay coincidencia, muestra un mensaje de error.

```java
    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Obtener los valores de los campos
    String correo = txtUsuario.getText();
    String contrasena = new String(txtContraseña.getPassword());
    String tipoUsuario = (String) cmbTipoUsuario.getSelectedItem();

    // Validar campos no vacíos
    if (!ValidacionUsuario.camposNoVacios(correo, contrasena)) {
        JOptionPane.showMessageDialog(this, "El correo y la contraseña no pueden estar vacíos.");
        return;
    }

    // Validar formato de correo
    if (!ValidacionUsuario.valCorreo(correo)) {
        JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido.");
        return;
    }

    // Validar contraseña
    if (!ValidacionUsuario.valContraseña(contrasena)) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.");
        return;
    }

    // Validar tipo de usuario
    if (!ValidacionUsuario.tipoUsuarioValido(tipoUsuario)) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un tipo de usuario.");
        return;
    }

    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        con = (Connection) ConexionDB.conectar();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "No se pudo establecer conexión con la base de datos.");
            return;
        }

        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ? AND tipo_usuario = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, correo);
        stmt.setString(2, contrasena);
        stmt.setString(3, tipoUsuario);

        rs = stmt.executeQuery();
        
if (rs.next()) {
    switch (tipoUsuario) {
        case "Profesor" -> {
            // Obtener el ID del usuario logueado
            int idUsuario = rs.getInt("id");

            // Consultar el ID del profesor asociado a este usuario
            int idProfesor = getIdProfesor(idUsuario);

            if (idProfesor != -1) {
                // Abrir la vista del horario del profesor
                VPPaginaPrincipalProf profesor = new VPPaginaPrincipalProf();
            profesor.setVisible(true);
            this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un profesor asociado a este usuario.");
            }
        }
        case "Administrador" -> {
            VAdmPaginaPrincipalAdmin admin = new VAdmPaginaPrincipalAdmin();
            admin.setVisible(true);
            this.dispose();
        }
        case "Alumno" -> {
            VAlPaginaPrincipalAlumno alumno = new VAlPaginaPrincipalAlumno();
            alumno.setVisible(true);
            this.dispose();
        }
        default -> JOptionPane.showMessageDialog(this, "Tipo de usuario no reconocido.");
    }
} else {
    JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
}
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + e.getMessage());
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) ConexionDB.cerrarConexion((java.sql.Connection) con);
        } catch (SQLException ex) {
            System.out.println("Error al cerrar recursos: " + ex.getMessage());
        }
    }
    }                                          
```

**`txtContraseñaFocusLost`**

Valida la contraseña. Si no cumple con los criterios, muestra un mensaje de advertencia visual.

```java
    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        if(val.valContraseña(new String(txtContraseña.getPassword()))){
            lblObligatorio2.setVisible(false);
        }else{
            lblObligatorio2.setVisible(true);
        }
    }
```

**`btnUnir1ActionPerformed`**

Abre la ventana de registro para crear un nuevo usuario (NuevoUsuario).

```java
    private void btnUnir1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        NuevoUsuario ventanaRegistro = new NuevoUsuario();
        ventanaRegistro.setVisible(true);
    }                                        
```

**`lblOjo1`**

Alternan la visibilidad de los caracteres en el campo de contraseña entre ocultos (*) y visibles, usando la variable contraseñaVisible.
                               
```java
    private void lbOjo1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:

        if (contraseñaVisible) {
            txtContraseña.setEchoChar('*');
        } else {
            txtContraseña.setEchoChar((char) 0);
        }
        contraseñaVisible = !contraseñaVisible;
    }
```

**`getIdProfesor`**

Este método consulta el ID del profesor asociado a un usuario en la base de datos.
Si encuentra un registro, retorna el ID del profesor. Si no, devuelve -1.

```java
/**
 * Obtiene el ID del profesor asociado al usuario logueado.
 * @param idUsuario El ID del usuario logueado.
 * @return El ID del profesor, o -1 si no se encuentra.
 */
private int getIdProfesor(int idUsuario) {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        con = ConexionDB.conectar();
        String query = "SELECT id FROM profesores WHERE id_usuario = ?";
        stmt = con.prepareStatement(query);
        stmt.setInt(1, idUsuario);

        rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("id");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener el ID del profesor: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) ConexionDB.cerrarConexion(con);
        } catch (SQLException ex) {
            System.out.println("Error al cerrar recursos: " + ex.getMessage());
        }
    }
    return -1; // Retorna -1 si no se encuentra el profesor
}
```


### NuevoUsuario

![image](https://github.com/user-attachments/assets/638fc5e0-4283-4eae-8071-e5acf1074d06)

**`btnVolverActionPerformed`**

Cierra la ventana actual del formulario al ejecutar this.dispose().

```java
   private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.dispose();
    }                                         
```

**`btnEliminarActionPerformed`**

Elimina un usuario de la base de datos en función del valor ingresado en el campo "nombreUsuario". Si el usuario es eliminado correctamente, se muestra un mensaje de confirmación y se recarga la tabla de usuarios.

```java
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
    String nombreUsuario = txtNombreUsuario.getText();

        Connection con = ConexionDB.conectar();
        if (con != null) {
            try {
                String sql = "DELETE FROM usuarios WHERE nombre_usuario = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, nombreUsuario);

                int filasAfectadas = stmt.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");
                    cargarTablaUsuarios(); // Recargar la tabla después de eliminar el usuario
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el usuario: " + e.getMessage());
            } finally {
                ConexionDB.cerrarConexion(con);
            }
        }
    }
```

**`btnAñadirActionPerformed`**

Agrega un nuevo usuario a la base de datos validando los datos ingresados (como correo, contraseña y tipo de usuario). Si los datos son válidos, los inserta en la tabla de usuarios y recarga la tabla.

```java
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {                                          
    String nombreUsuario = txtNombreUsuario.getText();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        String contrasena = txtContraseña.getText();
        String tipoUsuario = (String) cmbTipoUsuario.getSelectedItem();

        // Validaciones
        if (!ValidacionUsuario.camposNoVacios(correo, contrasena)) {
            JOptionPane.showMessageDialog(this, "El correo y la contraseña no pueden estar vacíos.");
            return;
        }

        if (!ValidacionUsuario.tipoUsuarioValido(tipoUsuario)) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un tipo de usuario.");
            return;
        }

        if (!ValidacionUsuario.valCorreo(correo)) {
            JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido.");
            return;
        }

        if (!ValidacionUsuario.valContraseña(contrasena)) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.");
            return;
        }

        // Proceder con la inserción en la base de datos
        Connection con = ConexionDB.conectar();
        if (con != null) {
            try {
                String sql = "INSERT INTO usuarios (nombre_usuario, nombre, apellidos, correo, contrasena, tipo_usuario) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, nombreUsuario);
                stmt.setString(2, nombre);
                stmt.setString(3, apellidos);
                stmt.setString(4, correo);
                stmt.setString(5, contrasena);
                stmt.setString(6, tipoUsuario);

                int filasAfectadas = stmt.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Usuario agregado correctamente.");
                    cargarTablaUsuarios(); // Recargar la tabla después de agregar el usuario
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al agregar el usuario: " + e.getMessage());
            } finally {
                ConexionDB.cerrarConexion(con);
            }
        }
    }
```
                                        
**`btnModificarActionPerformed`**
A
ctualiza los datos de un usuario seleccionado en la tabla, basándose en el nombre de usuario anterior como referencia. También valida los campos antes de proceder con la actualización.

```java
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
    String nombreUsuario = txtNombreUsuario.getText(); // Asegúrate de que el texto se obtiene correctamente
    String nombre = txtNombre.getText();
    String apellidos = txtApellidos.getText();
    String correo = txtCorreo.getText();
    String contrasena = txtContraseña.getText();
    String tipoUsuario = (String) cmbTipoUsuario.getSelectedItem();

    // Verificamos que se haya seleccionado un usuario de la tabla
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un usuario de la tabla.");
        return;
    }

    // Depuración: Verificar el contenido de la fila seleccionada
    String nombreUsuarioAnterior = jTable1.getValueAt(filaSeleccionada, 0).toString();
    System.out.println("Nombre de usuario anterior: " + nombreUsuarioAnterior); // Depuración

    // Validaciones
    if (!ValidacionUsuario.camposNoVacios(correo, contrasena)) {
        JOptionPane.showMessageDialog(this, "El correo y la contraseña no pueden estar vacíos.");
        return;
    }

    if (!ValidacionUsuario.tipoUsuarioValido(tipoUsuario)) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un tipo de usuario.");
        return;
    }

    if (!ValidacionUsuario.valCorreo(correo)) {
        JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido.");
        return;
    }

    if (!ValidacionUsuario.valContraseña(contrasena)) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.");
        return;
    }

    // Proceder con la actualización en la base de datos
    Connection con = ConexionDB.conectar();
    if (con != null) {
        try {
            String sql = "UPDATE usuarios SET nombre = ?, apellidos = ?, correo = ?, contrasena = ?, tipo_usuario = ? WHERE nombre_usuario = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nombreUsuario);
            stmt.setString(1, nombre);
            stmt.setString(2, apellidos);
            stmt.setString(3, correo);
            stmt.setString(4, contrasena);
            stmt.setString(5, tipoUsuario);
            stmt.setString(6, nombreUsuarioAnterior); // Utilizamos el nombre de usuario anterior como referencia

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente.");
                cargarTablaUsuarios(); // Recargar la tabla después de actualizar el usuario
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario para actualizar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el usuario: " + e.getMessage());
        } finally {
            ConexionDB.cerrarConexion(con);
        }
    }
    }                                            
```

**`btnAñadir2ActionPerformed`**

Limpia todos los campos del formulario (nombre de usuario, nombre, apellidos, correo, contraseña y tipo de usuario) y recarga la tabla de usuarios para reflejar cambios recientes.

```java
    private void btnAñadir2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
 // Limpiar los campos de texto
        txtNombreUsuario.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtContraseña.setText("");
        cmbTipoUsuario.setSelectedIndex(0); // Reseteamos el combo box a su valor predeterminado

        // Actualizamos la tabla de usuarios
        cargarTablaUsuarios();
    }                                          
```

**`Table1MouseClicked`**

Al hacer clic en una fila de la tabla, llena los campos del formulario con los datos del usuario seleccionado, permitiendo editarlos o visualizarlos.

```java
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // Obtenemos el índice de la fila seleccionada
        int filaSeleccionada = jTable1.getSelectedRow();

        // Rellenamos los campos de texto con los datos de la fila seleccionada
        if (filaSeleccionada != -1) {
            txtNombreUsuario.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(jTable1.getValueAt(filaSeleccionada, 1).toString());
            txtApellidos.setText(jTable1.getValueAt(filaSeleccionada, 2).toString());
            txtCorreo.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
            String tipoUsuario = jTable1.getValueAt(filaSeleccionada, 4).toString();
            cmbTipoUsuario.setSelectedItem(tipoUsuario);
        }
    }                                    
```

**`btnSiguienteActionPerformed`**

Avanza a la siguiente página de la tabla de usuarios si no se ha alcanzado el límite de páginas y recarga los datos de la tabla.

```java
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {                                             
            int totalPaginas = (int) Math.ceil((double) totalUsuarios / usuariosPorPagina);
    if (paginaActual < totalPaginas) {
        paginaActual++;
        cargarTablaUsuarios(); // Recargar los usuarios para la siguiente página
    }
    }                                            
```

**`btnAtrasActionPerformed`**

Retrocede a la página anterior de la tabla de usuarios si no se está en la primera página y recarga los datos de la tabla.

```java
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (paginaActual > 1) {
        paginaActual--;
        cargarTablaUsuarios(); // Recargar los usuarios para la página anterior
    }
    }                                        
```

**`cargarTablaUsuarios`**

Llena la tabla de usuarios con los datos obtenidos de la base de datos, mostrando un número limitado de usuarios por página. Calcula el rango de registros a mostrar en función de la página actual.

```java                                        
 private void cargarTablaUsuarios() {
        Connection con = ConexionDB.conectar();
        if (con != null) {
            try {
                // Obtener el total de usuarios
                String sqlTotal = "SELECT COUNT(*) FROM usuarios";
                PreparedStatement stmtTotal = con.prepareStatement(sqlTotal);
                ResultSet rsTotal = stmtTotal.executeQuery();
                if (rsTotal.next()) {
                    totalUsuarios = rsTotal.getInt(1);
                }

                // Calcular el rango de registros a mostrar
                int inicio = (paginaActual - 1) * usuariosPorPagina;
                String sql = "SELECT * FROM usuarios LIMIT ? OFFSET ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, usuariosPorPagina);
                stmt.setInt(2, inicio);
                ResultSet rs = stmt.executeQuery();

                // Limpiar la tabla antes de cargar nuevos datos
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0);

                // Agregar filas a la tabla
                while (rs.next()) {
                    Object[] fila = {
                        rs.getString("nombre_usuario"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getString("correo"),
                        rs.getString("tipo_usuario")
                    };
                    modelo.addRow(fila);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar la tabla de usuarios: " + e.getMessage());
            } finally {
                ConexionDB.cerrarConexion(con);
            }
        }}
```

**`actualizarPaginacion`**

Habilita o deshabilita los botones "Anterior" y "Siguiente" en función de si el usuario está en la primera o última página de la tabla, respectivamente.

```java
private void actualizarPaginacion() {
    // Deshabilitar el botón "Anterior" si estamos en la primera página
    btnVolver.setEnabled(paginaActual > 1);
    
    // Deshabilitar el botón "Siguiente" si estamos en la última página
    int totalPaginas = (int) Math.ceil((double) totalUsuarios / usuariosPorPagina);
    btnSiguiente.setEnabled(paginaActual < totalPaginas);
}
```
