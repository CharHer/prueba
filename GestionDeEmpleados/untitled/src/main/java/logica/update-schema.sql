CREATE TABLE Empleado
(
    id            INT AUTO_INCREMENT NOT NULL,
    nombre        VARCHAR(255) NULL,
    apellido      VARCHAR(255) NULL,
    salario DOUBLE NOT NULL,
    fecha_ingreso datetime NULL,
    CONSTRAINT pk_empleado PRIMARY KEY (id)
);