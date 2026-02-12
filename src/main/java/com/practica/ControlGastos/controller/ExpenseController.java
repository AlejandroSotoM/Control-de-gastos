package com.practica.ControlGastos.controller;

import com.practica.ControlGastos.service.ExpenseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    //End Points

    //1. CREAR GASTO - POST /expenses

    //2. OBTENER TODOS LOS GASTOS - GET /expenses


    //3. OBTENER GASTO POR ID - GET /expenses/{id}

    //4. ACTUALIZAR GASTO - PUT /expenses/{id}

    //5. ELIMINAR GASTO - DELETE /expenses/{id}

    //6. FILTRAR POR CATEGORIA - GET /expenses/category/{category}


    //7. FILTRAR POR RANGO DE FECHAS - GET /expenses/between


    //8. FILTRAR POR METODO DE PAGO - GET /expenses/payment-method/{paymentMethod}


    //9. REPORTE TOTAL POR CATEGORIA - GET /expenses/reports/by-category


    //10. REPORTE TOTAL POR PERIODO - GET /expenses/reports/period


    //11. REPORTE RESUMEN DEL MES ACTUAL -GET /expenses/reports/current-month


}
