package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity that represents a company employee.
 * An employee can create multiple support tickets.
 */
@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee extends Person {

    /**
     * Employee's email address.
     */
    private String email;

    /**
     * Department where the employee works.
     */
    private String deparment;
}


