package com.uped.proyecto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private final List<String> productos = new ArrayList<>();

    public void agregar(String producto) {
        productos.add(producto);
    }

    public List<String> getProductos() {
        return List.copyOf(productos);
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}