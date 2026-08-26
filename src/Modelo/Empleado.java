package com.uped.proyecto.modelo;

public class Empleado {

    private final int id;
    private final String nombre;
    private final double salario;

    public Empleado(int id, String nombre, double salario) {
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
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
