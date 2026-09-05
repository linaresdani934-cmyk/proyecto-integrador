# Diagrama de clases - Semana 6

```mermaid
classDiagram

class Persona {
    <<abstract>>
    #String nombre
    #String dui
    +Persona(String nombre, String dui)
    +String presentarse()
    +double calcularBeneficioAnual()
}

class Cliente {
    -String telefono
    -double comprasAnuales
    +Cliente(String nombre, String dui, String telefono, double comprasAnuales)
    +double calcularBeneficioAnual()
    +String describirBeneficio()
}

class Estudiante {
    -String carnet
    -String carrera
    -double promedio
    +Estudiante(String nombre, String dui, String carnet, String carrera, double promedio)
    +double calcularBeneficioAnual()
    +String describirBeneficio()
}

class Docente {
    -String especialidad
    -int aniosExperiencia
    +Docente(String nombre, String dui, String especialidad, int aniosExperiencia)
    +double calcularBeneficioAnual()
    +String describirBeneficio()
}

class Voluntario {
    -double horasServicio
    +Voluntario(String nombre, String dui, double horasServicio)
    +double calcularBeneficioAnual()
    +String describirBeneficio()
}

class Proveedor {
    -double montoFacturado
    +Proveedor(String nombre, String dui, double montoFacturado)
    +double calcularBeneficioAnual()
    +String describirBeneficio()
}

class Empleado {
    -int id
    -double salario
    +Empleado(int id, String nombre, String dui, double salario)
    +double calcularBeneficioAnual()
    +String describirBeneficio()
}

Persona <|-- Cliente
Persona <|-- Estudiante
Persona <|-- Docente
Persona <|-- Voluntario
Persona <|-- Proveedor
Persona <|-- Empleado
```
## Pruebas realizadas

- Se ejecutó `Main.java` correctamente.
- Se comprobó el polimorfismo mediante referencias de tipo `Persona`.
- Se verificó que cada subclase implementa `calcularBeneficioAnual()`.
- Se agregó y probó el segundo método abstracto `describirBeneficio()`.
- Se comprobó que el proyecto compila sin errores.