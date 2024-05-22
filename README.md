# Employee Management API

Este proyecto es una API para la gestión de empleados y contratos utilizando Spring Boot y JPA.

## Estructura del proyecto

- **src/main/java**: Contiene el código fuente de la aplicación.
    - **controllers**: Controladores REST.
    - **models**: Entidades JPA.
    - **repositories**: Repositorios JPA.
    - **services**: Servicios de negocio.
- **src/main/resources**: Contiene los archivos de configuración.
  - **application.properties**: Archivo de configuración de Spring Boot.

## Ejecución del proyecto

1. Clona el repositorio:
    ```sh
    git clone https://github.com/JorgeZamoraRojas/API.git
    cd <main>
    ```

2. Configura la base de datos en `src/main/resources/application.properties`:
    ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/Apiv8
    spring.datasource.username=root
    spring.datasource.password=HolaMundo10
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. Ejecuta la aplicación:
    ```sh
    ./mvnw spring-boot:run
    ```

4.  Get para obtener usurios Actios con POSTMAN Get
  ```
    http://localhost:8080/employee
7.  ```
