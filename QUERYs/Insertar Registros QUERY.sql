use Apiv4;
SELECT * FROM Employee;
SELECT * FROM Contract;
SELECT * FROM Contract_Type;

INSERT INTO Employee (tax_id_number, name, last_name, birth_date, email, cell_phone, is_active, date_created) VALUES 
('1234567890123', 'John', 'Doe', '1990-01-01', 'john.doe@example.com', '+1234567890', TRUE, '2024-01-01 08:00:00'),
('1234567890124', 'Jane', 'Smith', '1992-02-02', 'jane.smith@example.com', '+1234567891', TRUE, '2024-01-02 08:00:00'),
('1234567890125', 'Bob', 'Johnson', '1985-03-03', 'bob.johnson@example.com', '+1234567892', TRUE, '2024-01-03 08:00:00'),
('1234567890126', 'Alice', 'Williams', '1988-04-04', 'alice.williams@example.com', '+1234567893', TRUE, '2024-01-04 08:00:00'),
('1234567890127', 'Charlie', 'Brown', '1995-05-05', 'charlie.brown@example.com', '+1234567894', TRUE, '2024-01-05 08:00:00');

use Apiv4;
INSERT INTO Contract_Type (name, description, is_active, date_created) VALUES 
('Full-Time', 'Full-time employment contract', TRUE, '2024-01-01 08:00:00'),
('Part-Time', 'Part-time employment contract', TRUE, '2024-01-02 08:00:00'),
('Temporary', 'Temporary employment contract', TRUE, '2024-01-03 08:00:00'),
('Internship', 'Internship contract', TRUE, '2024-01-04 08:00:00'),
('Freelance', 'Freelance contract', TRUE, '2024-01-05 08:00:00');
--------------------------------------
use Apiv4;
INSERT INTO contract (employee_id, contract_type_id, date_from, date_to, salary_per_day, is_active, date_created) VALUES 
(1, 1, '2024-01-01 08:00:00', '2024-12-31 17:00:00', 100.00, TRUE, '2024-01-01 08:00:00'),
(2, 2, '2024-01-02 08:00:00', '2024-12-31 17:00:00', 80.00, TRUE, '2024-01-02 08:00:00'),
(3, 3, '2024-01-03 08:00:00', '2024-06-30 17:00:00', 90.00, TRUE, '2024-01-03 08:00:00'),
(4, 4, '2024-01-04 08:00:00', '2024-06-30 17:00:00', 70.00, TRUE, '2024-01-04 08:00:00'),
(5, 5, '2024-01-05 08:00:00', '2024-12-31 17:00:00', 120.00, TRUE, '2024-01-05 08:00:00');