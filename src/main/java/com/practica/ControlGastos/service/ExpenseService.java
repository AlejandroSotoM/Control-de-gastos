package com.practica.ControlGastos.service;

import com.practica.ControlGastos.model.Expense;
import com.practica.ControlGastos.repository.ExpenseRepository;
import org.hibernate.tool.schema.spi.ExecutionOptions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    Expense create(Expense expense);

    Expense update(Long id, Expense expense);

    void delete(Long id);

    Expense findById(Long id);

    List<Expense> findByDateRange(String start, String end);


}
