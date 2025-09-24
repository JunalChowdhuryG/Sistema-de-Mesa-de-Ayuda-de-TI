package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee extends Person {

    private String email;

    private String deparment;
}

