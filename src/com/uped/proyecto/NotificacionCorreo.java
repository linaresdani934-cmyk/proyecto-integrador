package com.uped.proyecto;

public class NotificacionCorreo extends Notificación {

    public NotificacionCorreo(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        registrarHistorial("Correo enviado a " + destinatario);
    }
}
