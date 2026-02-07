# 💰 Control de Gastos

API REST desarrollada con **Spring Boot** para el registro y control de gastos personales.  
Permite gestionar gastos diarios, categorizarlos, aplicar filtros y generar reportes básicos para análisis financiero.

---

## 🚀 Tecnologías

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation
- Hibernate
- Maven
- H2 / MySQL

---

## 📋 Funcionalidades

- CRUD de gastos personales
- Clasificación por categorías y métodos de pago
- Filtros por:
  - Categoría
  - Rango de fechas
  - Método de pago
- Reportes financieros:
  - Total por categoría
  - Resumen por período
  - Resumen del mes actual

---

## 🧾 Modelo Principal

**Expense**
- description (String)
- amount (BigDecimal)
- category (Enum)
- date (LocalDate)
- paymentMethod (Enum)

---

## ✅ Buenas Prácticas

- Uso de `BigDecimal` para montos monetarios
- Uso de `LocalDate` para fechas
- Enums con `EnumType.STRING`
- Validaciones con Bean Validation
- Lógica de negocio en la capa de servicio
- Manejo global de excepciones

---

## 🔌 Ejemplo de Endpoint

```http
POST /api/expenses
{
  "description": "Almuerzo en restaurante",
  "amount": 25.50,
  "category": "FOOD",
  "date": "2024-11-18",
  "paymentMethod": "CREDIT_CARD"
}
```

## 🎯 Objetivo

Proyecto enfocado en consolidar conocimientos de Spring Boot, JPA, validaciones, manejo de fechas, montos financieros y generación de reportes.

## 👨‍💻 Autor

Alejandro Soto

