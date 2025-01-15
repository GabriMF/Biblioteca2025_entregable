/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrimf.biblioteca2025_entrega;

/**
 *
 * @author gabri
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private int ejemplares;

    public Libro(String isbn, String titulo, String autor, String genero, int ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ejemplares = ejemplares;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public int getEjemplares() {
        return ejemplares;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        //return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", genre=" + genre + ", copies=" + copies + '}';
        return "\n\n"
                +" ____________________________________________________________________________ \n"
                +"|                                 libro                                      |\n"
                +"|____________________________________________________________________________|\n"
                +"|    - Titulo: " + titulo + "                                                 \n"
                +"|    - Autor: " + autor + "                                                   \n"
                +"|    - Genero: " + genero + "                                                 \n"
                +"|    - isbn: " + isbn + "                                                     \n"
                +"|    - Nº de ejemplares: " + ejemplares + "                                   \n"
                +"|____________________________________________________________________________|\n";
    }
}
