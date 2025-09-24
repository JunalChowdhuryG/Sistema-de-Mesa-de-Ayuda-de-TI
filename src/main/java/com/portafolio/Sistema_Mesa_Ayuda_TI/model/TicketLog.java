package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Entity that represents an activity log entry associated with a ticket.
 * Used to document status changes, notes, or comments during ticket handling.
 */
@Entity
@Table(name = "ticket_log")
@Getter
@Setter
public class TicketLog extends BaseEntity {

    /**
     * Date when the log entry was created.
     */
    @Column(name = "log_date")
    private LocalDate date;

    /**
     * Description of the change or note recorded in the log.
     */
    @Column(name = "description")
    private String description;

    /**
     * Ticket to which this log entry belongs.
     * Many-to-one relationship: a ticket can have multiple logs.
     */
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}

