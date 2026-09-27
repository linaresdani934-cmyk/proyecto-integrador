package com.uped.proyecto;

public class NotificacionSMS extends Notificación {

    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        registrarHistorial("SMS enviado a " + destinatario);
    }
}
