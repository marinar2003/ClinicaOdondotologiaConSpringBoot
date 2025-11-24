🦷 ClinicaOdontologicaII - API RESTful

Descripción GeneralEste proyecto es una aplicación API RESTful desarrollada con Spring Boot que simula el sistema de gestión de una clínica odontológica. 
Permite administrar información sobre odontólogos, pacientes y turnos, implementando las operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

Tecnologías UtilizadasLenguaje: 
Java 17+ (o la versión que estés utilizando)
Framework: Spring Boot 3+
Base de Datos (Ejemplo): H2 (para desarrollo)
Persistencia: Spring Data JPA
Build Tool: Maven🛠️ Configuración y Ejecución Local

Sigue estos pasos para poner en marcha la aplicación en tu entorno local:
1. Clonar el RepositorioBashgit clone https://github.com/tu_usuario/ClinicaOdontologicaII.git
cd ClinicaOdontologicaII
2. Configuración de la Base de Datos
El proyecto utiliza Spring Data JPA.
Si estás usando H2 Database (configuración común para Spring Boot), la base de datos se inicializará automáticamente en memoria al arrancar, sin necesidad de pasos adicionales.
3. Ejecutar la Aplicación
Puedes ejecutar el proyecto directamente usando Maven:
Bash # Ejecutar con Maven
./mvnw spring-boot:run
La aplicación estará disponible en http://localhost:8080.
