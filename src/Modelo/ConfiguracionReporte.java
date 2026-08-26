package com.uped.proyecto.modelo;

public class ConfiguracionReporte {

    private final String titulo;
    private final String formato;
    private final boolean incluirGraficos;

    private ConfiguracionReporte(Builder b) {
        this.titulo = b.titulo;
        this.formato = b.formato;
        this.incluirGraficos = b.incluirGraficos;
    }

    public static class Builder {

        private String titulo;
        private String formato = "PDF";
        private boolean incluirGraficos = false;

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder formato(String formato) {
            this.formato = formato;
            return this;
        }

        public Builder incluirGraficos(boolean incluirGraficos) {
            this.incluirGraficos = incluirGraficos;
            return this;
        }

        public ConfiguracionReporte build() {
            if (titulo == null || titulo.isBlank()) {
                throw new IllegalArgumentException(
                        "El título es obligatorio.");
            }

            return new ConfiguracionReporte(this);
        }
    }

    @Override
    public String toString() {
        return "ConfiguracionReporte{" +
                "titulo='" + titulo + '\'' +
                ", formato='" + formato + '\'' +
                ", incluirGraficos=" + incluirGraficos +
                '}';
    }
}