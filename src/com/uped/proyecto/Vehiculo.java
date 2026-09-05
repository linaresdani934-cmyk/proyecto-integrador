package com.uped.proyecto;

public class Vehiculo {

    private final String placa;
    private String marca;
    private int kilometraje;

    // Constructor completo
    public Vehiculo(String placa, String marca, int kilometraje) {
        validar(placa, kilometraje);

        this.placa = placa;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    // Constructor abreviado
    public Vehiculo(String placa, String marca) {
        this(placa, marca, 0);
    }

    // Método de fábrica estático
    public static Vehiculo nuevo(String placa, String marca) {
        return new Vehiculo(placa, marca);
    }

    // Incrementa el kilometraje únicamente si km > 0
    public void recorrer(int km) {
        if (km > 0) {
            kilometraje += km;
        } else {
            System.out.println(
                    "Los kilómetros a recorrer deben ser mayores a 0.");
        }
    }

    // Validación centralizada
    private void validar(String placa, int kilometraje) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException(
                    "La placa es obligatoria.");
        }

        if (kilometraje < 0) {
            throw new IllegalArgumentException(
                    "El kilometraje no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}