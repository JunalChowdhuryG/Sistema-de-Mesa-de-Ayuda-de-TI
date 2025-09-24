-- ==========================================================
-- V1__Initial_schema.sql
-- Migración inicial del esquema de base de datos
-- Crea las tablas principales para el sistema de mesa de ayuda:
-- employees, technicians, tickets y ticket_logs.
-- ==========================================================

-- Tabla de empleados de la empresa
CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    department VARCHAR(255)
);

-- Tabla de técnicos de TI
CREATE TABLE technicians (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    specialties VARCHAR(255)
);

-- Tabla de tickets de soporte
CREATE TABLE tickets (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255),
    creation_date DATE,
    status VARCHAR(255), -- estado del ticket (ej: abierto, en progreso, cerrado)
    employee_id BIGINT,
    technician_id BIGINT,
    FOREIGN KEY (employee_id) REFERENCES employees(id),
    FOREIGN KEY (technician_id) REFERENCES technicians(id)
);

-- Tabla de registros (logs) asociados a un ticket
CREATE TABLE ticket_logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    log_date DATE,
    description VARCHAR(255),
    ticket_id BIGINT,
    FOREIGN KEY (ticket_id) REFERENCES tickets(id)
);
