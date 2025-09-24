package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Entity that represents a support ticket in the system.
 * Each ticket is created by an employee, assigned to a technician,
 * and can have a history of activity logs.
 */
@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket extends BaseEntity {

    /**
     * Short title describing the reported issue.
     */
    @Column(name = "title")
    private String title;

    /**
     * Detailed description of the reported issue.
     */
    @Column(name = "description")
    private String description;

    /**
     * Date when the ticket was created.
     */
    @Column(name = "creation_date")
    private LocalDate creationDate;

    /**
     * Employee who created the ticket.
     * Many-to-one relationship: multiple tickets can belong to the same employee.
     */
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    /**
     * Technician assigned to the ticket.
     * Many-to-one relationship: a technician can manage multiple tickets.
     */
    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;

    /**
     * Set of activity logs associated with the ticket.
     * One-to-many relationship: a ticket can have multiple logs.
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticket", fetch = FetchType.EAGER)
    private Set<TicketLog> logs = new HashSet<>();
}

