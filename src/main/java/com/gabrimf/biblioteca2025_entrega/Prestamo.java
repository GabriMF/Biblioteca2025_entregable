/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrimf.biblioteca2025_entrega;
import java.time.LocalDate;

/**
 *
 * @author gabri
 */
public class Prestamo {
    private Libro libroPrest;
    private Usuario usuarioPrest;
    private LocalDate fechaPrest;
    private LocalDate fechaDev;

    public Prestamo(Libro libroPrest, Usuario usuarioPrest, LocalDate fechaPrest, LocalDate fechaDev) {
        this.libroPrest = libroPrest;
        this.usuarioPrest = usuarioPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDev = fechaDev;
    }

    public Libro getLibroPrest() {
        return libroPrest;
    }
    public Usuario getUsuarioPrest() {
        return usuarioPrest;
    }
    public LocalDate getFechaPrest() {
        return fechaPrest;
    }
    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setLibroPrest(Libro libroPrest) {
        this.libroPrest = libroPrest;
    }
    public void setUsuarioPrest(Usuario usuarioPrest) {
        this.usuarioPrest = usuarioPrest;
    }
    public void setFechaPrest(LocalDate fechaPrest) {
        this.fechaPrest = fechaPrest;
    }
    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    @Override
    public String toString() {
        //return "Loan{" + "loanedBook=" + loanedBook + ", userLoan=" + userLoan + ", loanDate=" + loanDate + ", refundDate=" + refundDate + '}';
        return "\n\n\n\n\n"
            +" _____________________________________________________________________________ \n"
            +"|                                                                             |\n"
            +"|------------------------------- Prestamo ------------------------------------|\n"
            +"|_____________________________________________________________________________|\n"
            +"|                                                                              \n"
            +"|_________________ Libro _________________                                     \n"
            +"|    - Titulo: " + libroPrest.getTitulo() + "                                  \n"
            +"|    - ISBN: " + libroPrest.getIsbn() + "                                      \n"
            +"|                                                                              \n"
            +"|_________________ Usuario _________________                                   \n"
            +"|    - Nombre: " + usuarioPrest.getNombre()+ "                                 \n"
            +"|    - Dni: " + usuarioPrest.getDni() + "                                      \n"
            +"|    - Contacto: " + usuarioPrest.getTelefono()+"                              \n"
            +"|                                                                              \n"
            +"|_________________ Plazo _________________                                     \n"
            +"|    - Fecha del prestamo: " + fechaPrest + "                                  \n"
            +"|    - Fecha de devolucion: " + fechaDev + "                                   \n"
            +"|_____________________________________________________________________________|\n";
    }
}
