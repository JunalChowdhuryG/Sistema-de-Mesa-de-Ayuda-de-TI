package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "technicians")
@Getter
@Setter
public class Technician extends Person {

    private String specialties;
}

