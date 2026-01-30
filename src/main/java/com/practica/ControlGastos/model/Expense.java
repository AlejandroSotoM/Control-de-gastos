package com.practica.ControlGastos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Descripcion
    @Column(nullable = false, length = 200)
    @NotBlank(message = "La descripcion no puede ser nula ni vacia")
    @Size(min = 3, max = 200)
    private String description;

    //Amount
    @Column(nullable = false, precision = 10, scale = 2)
    @NotNull(message = "El monto o puede ser nulo")
    @DecimalMin(value = "0.01", inclusive = true, message = "El monto debe ser mayor o igual a 0.01")
    @Digits(integer = 8, fraction = 2, message = "El monto solo puede tener 2 decimales")
    private BigDecimal amount;

    //Category
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "La categoria es obligatoria")
    private CategoryEnum category;

    //Date
    @Column(nullable = false)
    @NotNull(message = "La fecha es obligatoria")
    @PastOrPresent(message = "La fecha no puede ser futura")
    private LocalDate date;

    //PaymentMethod
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "El metodo de pago es obligatorio")
    private PaymentMethodEnum paymentMethod;

    //Constructor vacio para JPA
    public Expense(){}

    //Constructor
    public Expense(Long id, String description, BigDecimal amount, CategoryEnum category, LocalDate date, PaymentMethodEnum paymentMethod) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    //Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
