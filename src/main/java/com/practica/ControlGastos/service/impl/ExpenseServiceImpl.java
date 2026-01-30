package com.practica.ControlGastos.service.impl;

import com.practica.ControlGastos.model.Expense;
import com.practica.ControlGastos.repository.ExpenseRepository;
import com.practica.ControlGastos.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    
    
    //Create
    @Override
    public Expense create(Expense expense) {

        return null;
    }
    
    
    //Update
    @Override
    public Expense update(Long id, Expense expense) {
        return null;
    }
    
    
    //Delete
    @Override
    public void delete(Long id) {

    }
    
    
    //FindById
    @Override
    public Expense findById(Long id) {
        return null;
    }

    @Override
    public List<Expense> findByDateRange(String start, String end) {
        return List.of();
    }
}
