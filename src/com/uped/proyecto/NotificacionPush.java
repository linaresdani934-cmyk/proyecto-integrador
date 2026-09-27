package com.uped.proyecto;

public class NotificacionPush extends Notificación {

    public NotificacionPush(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación Push a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        registrarHistorial("Push enviado a " + destinatario);
    }
}
