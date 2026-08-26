package com.uped.proyecto.modelo;

public class ConfiguracionNotificacion {

    private final String canal;
    private final String destinatario;
    private final String asunto;

    private ConfiguracionNotificacion(Builder b) {
        this.canal = b.canal;
        this.destinatario = b.destinatario;
        this.asunto = b.asunto;
    }

    public static class Builder {

        private String canal = "CORREO";
        private String destinatario;
        private String asunto = "Notificacion";

        public Builder canal(String canal) {
            this.canal = canal;
            return this;
        }

        public Builder destinatario(String destinatario) {
            this.destinatario = destinatario;
            return this;
        }

        public Builder asunto(String asunto) {
            this.asunto = asunto;
            return this;
        }

        public ConfiguracionNotificacion build() {

            if (destinatario == null || destinatario.isBlank()) {
                throw new IllegalArgumentException(
                        "El destinatario es obligatorio.");
            }

            return new ConfiguracionNotificacion(this);
        }
    }

    @Override
    public String toString() {
        return "ConfiguracionNotificacion{" +
                "canal='" + canal + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", asunto='" + asunto + '\'' +
                '}';
    }
}