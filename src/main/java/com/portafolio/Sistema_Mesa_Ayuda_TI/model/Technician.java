package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity that represents an IT technician.
 * A technician may have different specialties
 * and can manage multiple support tickets.
 */
@Entity
@Table(name = "technicians")
@Getter
@Setter
public class Technician extends Person {

    /**
     * Technician's specialties (e.g., Hardware, Software, Networking).
     */
    private String specialties;
}


