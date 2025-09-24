package com.portafolio.Sistema_Mesa_Ayuda_TI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticket", fetch = FetchType.EAGER)
    private Set<TicketLog> logs = new HashSet<>();
}

