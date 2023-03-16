-- USE bussiness
-- Revisar employee
SELECT * FROM employe;

-- ALIAS
SELECT last_name AS 'Apellido' FROM employe;

-- ALIAS ++
SELECT
employe_id AS 'ID'
first_name AS 'Nombre'
last_name AS 'Apellido'
department AS 'Departamento'
FROM employe;

-- Filtrar por nombre
-- Buscar a monika

SELECT * FROM employee
WHERE first_name = 'Monika';

-- Filtrar doble 
SELECT * FROM employee
WHERE salary = '500000' AND first_name = 'Vivek';

-- Filtrar por NOT 
SELECT * FROM employee
WHERE first_name = 'Barack';

-- Filtrar por dobel negacion
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT  first_name = 'Ian';

-- Ordenamiento ORDER BY
-- Default es orden descendiente
SELECT * FROM employee
ORDER BY department DESC;

-- Ordenamiento asendente
SELECT * FROM employee
ORDER BY department ASC;

-- ordena ascendente department y descendent last_name
SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;


