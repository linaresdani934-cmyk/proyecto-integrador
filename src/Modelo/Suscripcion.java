package com.uped.proyecto.modelo;

import java.time.LocalDate;

public class Suscripcion {

    private final String usuario;
    private final String plan;
    private final LocalDate inicio;
    private final int meses;

    // Constructor completo
    public Suscripcion(String usuario, String plan,
                       LocalDate inicio, int meses) {

        if (usuario == null || usuario.isBlank()) {
            throw new IllegalArgumentException(
                    "El usuario es obligatorio.");
        }

        if (plan == null || plan.isBlank()) {
            throw new IllegalArgumentException(
                    "El plan es obligatorio.");
        }

        if (inicio == null) {
            throw new IllegalArgumentException(
                    "La fecha de inicio es obligatoria.");
        }

        if (meses <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad de meses debe ser mayor a cero.");
        }

        this.usuario = usuario;
        this.plan = plan;
        this.inicio = inicio;
        this.meses = meses;
    }

    // Nivel 3
    public Suscripcion(String usuario, String plan, LocalDate inicio) {
        this(usuario, plan, inicio, 1);
    }

    // Nivel 2
    public Suscripcion(String usuario, String plan) {
        this(usuario, plan, LocalDate.now());
    }

    // Nivel 1
    public Suscripcion(String usuario) {
        this(usuario, "GRATIS");
    }

    // Fábrica mensual
    public static Suscripcion mensual(String usuario) {
        return new Suscripcion(
                usuario,
                "MENSUAL",
                LocalDate.now(),
                1
        );
    }

    // Fábrica anual
    public static Suscripcion anual(String usuario) {
        return new Suscripcion(
                usuario,
                "ANUAL",
                LocalDate.now(),
                12
        );
    }

    // Builder
    public static class Builder {

        private String usuario;
        private String plan = "GRATIS";
        private LocalDate inicio = LocalDate.now();
        private int meses = 1;

        public Builder usuario(String usuario) {
            this.usuario = usuario;
            return this;
        }

        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        public Builder inicio(LocalDate inicio) {
            this.inicio = inicio;
            return this;
        }

        public Builder meses(int meses) {
            this.meses = meses;
            return this;
        }

        public Suscripcion build() {
            return new Suscripcion(
                    usuario,
                    plan,
                    inicio,
                    meses
            );
        }
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "usuario='" + usuario + '\'' +
                ", plan='" + plan + '\'' +
                ", inicio=" + inicio +
                ", meses=" + meses +
                '}';
    }
}