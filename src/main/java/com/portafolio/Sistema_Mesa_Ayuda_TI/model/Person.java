package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * Abstract class that represents a person in the system.
 * Serves as a base class for employees and technicians.
 */
@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity {

    /**
     * First name of the person.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Last name of the person.
     */
    @Column(name = "last_name")
    private String lastName;
}

