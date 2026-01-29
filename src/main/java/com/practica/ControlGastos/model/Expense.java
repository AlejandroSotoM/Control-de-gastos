package com.practica.ControlGastos.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Expense {
    private Long id;
    private String description;
    private BigDecimal amount;

    private LocalDate date;

}
