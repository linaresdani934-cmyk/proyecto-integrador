package com.uped.proyecto;

public class Empleado extends Persona {

    private final int id;
    private final double salario;

    public Empleado(int id, String nombre, String dui, double salario) {
        super(nombre, dui);

        if (id <= 0) {
            throw new IllegalArgumentException("El id debe ser mayor a cero.");
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }

        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double calcularBeneficioAnual() {
        return salario * 0.10;
    }
    @Override
    public String describirBeneficio() {
        return "Beneficio del 10% sobre el salario";
    }
}