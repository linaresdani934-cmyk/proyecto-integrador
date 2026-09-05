
package com.uped.proyecto;


import com.uped.proyecto.Cliente;
import com.uped.proyecto.Empleado;
import com.uped.proyecto.Estudiante;
import com.uped.proyecto.Persona;
import com.uped.proyecto.Proveedor;

public class Main {

    public static void main(String[] args) {

        Persona[] personas = {
                new Cliente("Ana", "0451...", "7777-1", 4000.0),
                new Empleado(1, "Luis", "0622...", 850.0),
                new Estudiante("Kevin", "0399...", "UPED-045",
                        "Ing. Sistemas", 9.1)
        };

        for (Persona p : personas) {
            System.out.println(p.presentarse() + " -> $"
                    + p.calcularBeneficioAnual());

        }
        Proveedor prov = new Proveedor(
                "Comercial Ríos",
                "06554321-8",
                8000.0
        );

        System.out.println(prov);
        System.out.println("Beneficio: "
                + prov.calcularBeneficioAnual());

    }
}