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

4.  EndPoint para mostrar usuariosActivos
    ```
       http://localhost:8080/employee
    ```
5. EndPoint Agregar contrato Nuevo
   ```
       {

        "dateFrom": "2024-01-02 08:00:00",
        "dateTo": "2024-11-31",
        "salaryPerDay": 100.00,
        "isActive": 1,
        "dateCreated": "2024-01-02 08:00:00"
    }

    ```
   6. EndPoint agreggar nuevo empleado
   ```
    {
        "taxIdNumber": "85247",
        "name": "Jorge",
        "lastName": "Zamora",
        "birthDate": "1992-02-02",
        "email": "jorge.zamora@example.com",
        "cellPhone": "+1234567891",
        "isActive": true,
        "dateCreated": "2024-01-02 08:00:00"
    }


    ```
   6. Creación de la Base de Datos por QUERY y registros
      ```
      use apiv1;
        -- Crear tabla ContractType
        CREATE TABLE ContractType (
        ContractTypeId SMALLINT AUTO_INCREMENT PRIMARY KEY,
        Name VARCHAR(80) NOT NULL,
        Description VARCHAR(255),
        IsActive BOOLEAN NOT NULL,
        DateCreated DATETIME NOT NULL
    );
    
       -- Crear tabla Employee
        CREATE TABLE Employee (
        EmployeeId INT AUTO_INCREMENT PRIMARY KEY,
        TaxIdNumber VARCHAR(13) NOT NULL,
        Name VARCHAR(60) NOT NULL,
        LastName VARCHAR(120) NOT NULL,
        BirthDate DATE NOT NULL,
        Email VARCHAR(60) NOT NULL,
        CellPhone VARCHAR(20) NOT NULL,
        IsActive BOOLEAN NOT NULL,
        DateCreated DATETIME NOT NULL
    );
    
        -- Crear tabla Contract
        CREATE TABLE Contract (
        ContractId BIGINT AUTO_INCREMENT PRIMARY KEY,
        EmployeeId INT NOT NULL,
        ContractTypeId SMALLINT NOT NULL,
        DateFrom DATETIME NOT NULL,
        DateTo DATETIME NOT NULL,
        SalaryPerDay DECIMAL(10, 2) NOT NULL,
        IsActive BOOLEAN NOT NULL,
        DateCreated DATETIME NOT NULL,
        FOREIGN KEY (EmployeeId) REFERENCES Employee(EmployeeId),
        FOREIGN KEY (ContractTypeId) REFERENCES ContractType(ContractTypeId)
    );CREATE DATABASE `apiv1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

      use Apiv8;
        INSERT INTO Employee (tax_id_number, name, last_name, birth_date, email, cell_phone, is_active, date_created) VALUES 
        ('1234567890123', 'John', 'Doe', '1990-01-01', 'john.doe@example.com', '+1234567890', TRUE, '2024-01-01 08:00:00'),
        ('1234567890124', 'Jane', 'Smith', '1992-02-02', 'jane.smith@example.com', '+1234567891', TRUE, '2024-01-02 08:00:00'),
        ('1234567890125', 'Bob', 'Johnson', '1985-03-03', 'bob.johnson@example.com', '+1234567892', TRUE, '2024-01-03 08:00:00'),
        ('1234567890126', 'Alice', 'Williams', '1988-04-04', 'alice.williams@example.com', '+1234567893', FALSE, '2024-01-04 08:00:00'),
        ('1234567890127', 'Charlie', 'Brown', '1995-05-05', 'charlie.brown@example.com', '+1234567894', FALSE, '2024-01-05 08:00:00');
        
        use Apiv8;
        INSERT INTO Contract_Type (name, description, is_active, date_created) VALUES 
        ('Full-Time', 'Full-time employment contract', TRUE, '2024-01-01 08:00:00'),
        ('Part-Time', 'Part-time employment contract', TRUE, '2024-01-02 08:00:00'),
        ('Temporary', 'Temporary employment contract', TRUE, '2024-01-03 08:00:00'),
        ('Internship', 'Internship contract', FALSE, '2024-01-04 08:00:00'),
        ('Freelance', 'Freelance contract', FALSE, '2024-01-05 08:00:00');
        --------------------------------------
        use Apiv8;
        INSERT INTO contract (employee_id, contract_type_id, date_from, date_to, salary_per_day, is_active, date_created) VALUES 
        (1, 1, '2024-01-01 08:00:00', '2024-12-31 17:00:00', 100.00, TRUE, '2024-01-01 08:00:00'),
        (2, 2, '2024-01-02 08:00:00', '2024-12-31 17:00:00', 80.00, TRUE, '2024-01-02 08:00:00'),
        (3, 3, '2024-01-03 08:00:00', '2024-06-30 17:00:00', 90.00, TRUE, '2024-01-03 08:00:00'),
        (4, 4, '2024-01-04 08:00:00', '2024-06-30 17:00:00', 70.00, FALSE, '2024-01-04 08:00:00'),
        (5, 5, '2024-01-05 08:00:00', '2024-12-31 17:00:00', 120.00, FALSE, '2024-01-05 08:00:00');
      ```
   
