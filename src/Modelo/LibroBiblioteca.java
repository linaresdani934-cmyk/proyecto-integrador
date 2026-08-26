package com.uped.proyecto.modelo;

public class LibroBiblioteca {

    private final String titulo;
    private final String autor;
    private int ejemplaresDisponibles;

    public LibroBiblioteca(String titulo, String autor, int ejemplaresDisponibles) {
        validar(titulo, autor, ejemplaresDisponibles);

        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public static LibroBiblioteca unico(String titulo, String autor) {
        return new LibroBiblioteca(titulo, autor, 1);
    }

    public boolean prestar() {
        if (ejemplaresDisponibles <= 0) {
            System.out.println(
                    "No hay ejemplares disponibles de: " + titulo);
            return false;
        }

        ejemplaresDisponibles--;

        System.out.println(
                "Prestado: " + titulo +
                        " | Quedan: " + ejemplaresDisponibles);

        return true;
    }

    private void validar(String titulo, String autor, int ejemplaresDisponibles) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException(
                    "El titulo no puede estar vacio.");
        }

        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException(
                    "El autor no puede estar vacio.");
        }

        if (ejemplaresDisponibles < 0) {
            throw new IllegalArgumentException(
                    "Los ejemplares no pueden ser negativos.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }
}