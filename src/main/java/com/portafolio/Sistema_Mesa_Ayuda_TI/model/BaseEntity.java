package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * Base class for all entities in the system.
 * Provides a unique auto-generated identifier (ID) for each entity.
 */
@Setter
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * Unique identifier for the entity.
     * Automatically generated using IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

