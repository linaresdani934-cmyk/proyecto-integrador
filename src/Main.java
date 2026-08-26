
package com.uped.proyecto;

import com.uped.proyecto.modelo.Registro;
import com.uped.proyecto.modelo.LibroBiblioteca;
import com.uped.proyecto.modelo.Vehiculo;
import com.uped.proyecto.modelo.Punto;
import com.uped.proyecto.modelo.Carrito;
import com.uped.proyecto.modelo.ConfiguracionReporte;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Pedido;
import com.uped.proyecto.modelo.Suscripcion;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(101);

        Suscripcion s1 = new Suscripcion("ana");
        System.out.println(s1);

        Suscripcion s2 = Suscripcion.mensual("Luis");
        Suscripcion s3 = Suscripcion.anual("Marta");

        System.out.println(s2);
        System.out.println(s3);

        ConfiguracionReporte reporte =
                new ConfiguracionReporte.Builder()
                        .titulo("Ventas agosto")
                        .formato("PDF")
                        .incluirGraficos(true)
                        .build();

        System.out.println(reporte);

        Carrito carrito = new Carrito();

        carrito.agregar("Laptop");
        carrito.agregar("Mouse");

        System.out.println(carrito);
        System.out.println(carrito.getProductos());

        Empleado empleado = new Empleado(1, "Carlos", 850.50);

        System.out.println(empleado);

        Punto punto = new Punto(10.5, 20.5);

        System.out.println(punto);

        // Ejercicio 8.2 - Vehiculo
        Vehiculo v1 = Vehiculo.nuevo("P123-789", "Kia");

        System.out.println(v1);

        v1.recorrer(150);

        System.out.println(v1);

        v1.recorrer(-20);

        // Ejemplo LibroBiblioteca
        LibroBiblioteca l1 =
                new LibroBiblioteca("Clean Code", "R. Martin", 3);

        LibroBiblioteca l2 =
                LibroBiblioteca.unico("Effective Java", "J. Bloch");

        l1.prestar();
        l2.prestar();
        l2.prestar();

        // Ejercicio 8.1 - Registro
        Registro registro = new Registro();

        // Ejercicio 8.4 - Builder de Suscripcion
        Suscripcion s4 =
                new Suscripcion.Builder()
                        .usuario("Carlos")
                        .plan("PREMIUM")
                        .inicio(java.time.LocalDate.of(2026, 8, 26))
                        .meses(6)
                        .build();

        System.out.println(s4);
    }
}