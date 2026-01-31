package com.practica.ControlGastos.service;

import com.practica.ControlGastos.model.Expense;

import java.util.List;

public interface ExpenseService {

    Expense create(Expense expense);

    Expense update(Long id, Expense expense);

    void delete(Long id);

    Expense findById(Long id);

    List<Expense> findByDateRange(String start, String end);


}
