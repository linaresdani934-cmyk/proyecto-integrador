package com.uped.proyecto;

public class Cliente extends Persona {

    private String telefono;
    private double comprasAnuales;

    public Cliente(String nombre, String dui,
                   String telefono, double comprasAnuales) {
        super(nombre, dui);
        this.telefono = telefono;
        this.comprasAnuales = comprasAnuales;
    }

    @Override
    public double calcularBeneficioAnual() {
        return comprasAnuales * 0.05;
    }
    @Override
    public String describirBeneficio() {
        return "Beneficio del 5% sobre las compras anuales";
    }
}
