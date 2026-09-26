
package com.uped.proyecto;

public class Main {

    public static void main(String[] args) {

        Persona[] personas = {
                new Cliente("Ana", "0451...", "7777-1", 4000.0),
                new Empleado(1, "Luis", "0622...", 850.0),
                new Estudiante("Kevin", "0399...", "UPED-045",
                        "Ing. Sistemas", 9.1)
        };

        for (Persona p : personas) {
            System.out.println(p.presentarse());
            System.out.println("Beneficio: $" + p.calcularBeneficioAnual());
            System.out.println(p.describirBeneficio());
            System.out.println();
        }

        Gerente gerente = new Gerente(
                2,
                "Marta Díaz",
                "05123456-7",
                1200.0,
                5
        );

        DocenteInvestigador di = new DocenteInvestigador(
                "Dr. Iván Reyes",
                "07321456-9",
                "Ingeniería de Software",
                8,
                4
        );

        System.out.println(di);
        System.out.println("Beneficio: "
                + di.calcularBeneficioAnual());

        System.out.println(gerente);
        System.out.println("Beneficio: "
                + gerente.calcularBeneficioAnual());

        Proveedor prov = new Proveedor(
                "Comercial Ríos",
                "06554321-8",
                8000.0
        );

        Persona persona = new Gerente(
                3,
                "Carlos Méndez",
                "07876543-2",
                1500.0,
                6
        );

        if (persona instanceof Gerente) {
            Gerente g = (Gerente) persona;
            System.out.println("Downcasting seguro:");
            System.out.println("Tamaño del equipo: "
                    + g.getTamanoEquipo());
        }

        System.out.println("Ejercicio 8.1:");
        new C();

        System.out.println(prov);
        System.out.println("Beneficio: "
                + prov.calcularBeneficioAnual());
        System.out.println(prov.describirBeneficio());
    }
}