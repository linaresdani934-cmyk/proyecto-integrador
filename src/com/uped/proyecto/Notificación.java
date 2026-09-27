package com.uped.proyecto;

import java.util.ArrayList;
import java.util.List;

public abstract class Notificación {

    protected String destinatario;
    protected String mensaje;
    protected List<String> historial;

    public Notificación(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.historial = new ArrayList<>();
    }

    public abstract void enviar();

    public final void registrarHistorial(String registro) {
        historial.add(registro);
    }

    public void mostrarHistorial() {
        for (String registro : historial) {
            System.out.println(registro);
        }
    }
}
