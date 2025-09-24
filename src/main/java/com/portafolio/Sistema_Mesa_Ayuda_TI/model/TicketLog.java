package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "ticket_log")
@Getter
@Setter
public class TicketLog extends BaseEntity {

    @Column(name = "log_date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}

