
package com.gabrimf.biblioteca2025_entrega;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gabri
 */

public class Biblioteca2025_entrega {
 
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;
    private ArrayList <Prestamo> prestamosHist;

    public Biblioteca2025_entrega() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
        this.prestamosHist = new ArrayList();
    }
    
    public static void main(String[] args) {
       Biblioteca2025_entrega b= new Biblioteca2025_entrega();
       b.cargaDatos();
       b.fueraPlazo();
       b.menuPrincipal();
    }
    
    /*
    -------------------------------- Menus --------------------------------
    */
    
    private void menuPrincipal(){
        Scanner sc=new Scanner (System.in);
        int option;
        do{        
            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Principal
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para gestiones sobre libros.
                    - 2 Para gestiones sobre usuarios.
                    - 3 Para gestiones sobre prestamos.

                    - 0 Para cerrar la aplicacion.
                                                                                                                        """);
            option=sc.nextInt();
            switch (option){
                case 1:{
                    menuLibros();
                    break;
                }    
                case 2:{
                    menuUsuarios();
                    break;
                } 
                case 3:{
                    menuPrestamos();
                    break;
                }
                case 0:{
                    System.out.println("\n\n                            Gracias por probar mi aplicacion!                                    \n"
                        + "_________________________________________________________________________________________________\n"
                        + "_________________________________________________________________________________________________\n\n"
                        + "               #   #   #   ##### #####   #       #     #   # #####  ####  ###   #                \n"
                        + "               #   #  # #  #       #    # #      #     #   # #     #     #   #  #                \n"
                        + "               ##### #   # #####   #   #   #     #     #   # ####  #  ## #   #  #                \n"
                        + "               #   # #####     #   #   #####     #     #   # #     #   # #   #                   \n"
                        + "               #   # #   # #####   #   #   #     #####  ###  #####  ###   ###   #                \n"
                        + "_________________________________________________________________________________________________\n"
                        + "_________________________________________________________________________________________________\n\n");
                    break;
                }
                default :{
                    System.out.println("Por favor, introduzca una opcion valida");   
                }
                
            }
        }while (option != 0);
    }
    
    private void menuLibros() {
        Scanner sc=new Scanner (System.in);
        int option;
        do{
            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Libros
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para agregar un libro.
                    - 2 Para eliminar un libro.
                    - 3 Para modificar un libro.
                    - 4 Para consultar el listado de ejemplares.

                    - 0 Para volver al menu principal.
                                                                                                                        """);
            option=sc.nextInt();
            switch (option){
                case 1:{
                    nuevoLibro();
                    break;
                }    
                case 2:{
                    eliminarLibro();
                    break;
                } 
                case 3:{
                    modificarLibros();
                    break;
                } 
                case 4:{
                    listaLibros();
                    break;
                } 
            }
        }while (option != 0);
    }
        
    private void menuUsuarios() {
        Scanner sc=new Scanner (System.in);
        int option;
        do{
            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Usuarios
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para agregar un usuario.
                    - 2 Para eliminar un usuario.
                    - 3 Para modificar un usuario.
                    - 4 Para consultar el listado de usuarios.

                    - 0 Para volver al menu principal.
                                                                                                                        """);
            option=sc.nextInt();
            switch (option){
                case 1:{
                    nuevoUsuario();
                    break;
                }    
                case 2:{
                    eliminarUsuario();
                    break;
                } 
                case 3:{
                    modificarUsuario();
                    break;
                } 
                case 4:{
                    listaUsuarios();
                    break;
                } 
            }
        }while (option != 0);
    }
    
    private void menuPrestamos() {
        Scanner sc=new Scanner (System.in);
        int option;
        do{

            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Prestamos
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para agregar un prestamo.
                    - 2 Para devolver un prestamo.
                    - 3 Para prorrogar un prestamo.
                    - 4 Para consultar el listado de prestamos general.
                    - 5 Para consultar el listado de prestamos de un usuario.
                    - 6 Para consultar el listado de prestamos de un libro.
                    - 7 Para consultar el libro mas leido.
                    - 8 Para consultar el usuario mas lector.

                    - 0 Para volver al menu principal.
                                                                                                                        """);            
            option=sc.nextInt();
            switch (option){
                case 1:{
                    nuevoPrestamo();
                    break;
                }    
                case 2:{
                    devolucion();
                    break;
                } 
                case 3:{
                    prorroga();
                    break;
                } 
                case 4:{
                    listaPrestamos();
                    break;
                } 
                case 5:{
                    listaPrestamosUsu();
                    break;
                }
                case 6:{
                    listaPrestamosLibro();
                    break;
                }
                case 7:{
                    libroMasLeido();
                    break;
                }
                case 8:{
                    usuarioMasLector();
                    break;
                }
                default:{
                    System.out.println("Introduzca una opcion valida.");
                }
            }
        }while (option != 0);
    }
    
    /*
    -------------------------------- Gestion Libros --------------------------------
    */
    
    private void nuevoLibro() {
        String isbn, titulo, autor, genero;
        int ejemplares;
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Nuevo Libro
                           __________________________________________________________________________________________________________""");
        
        System.out.println("Titulo: ");
        titulo = sc.nextLine();
        
        System.out.println("Autor: ");
        autor = sc.nextLine();
             
        System.out.println("Genero: ");
        genero = sc.nextLine();
        
        System.out.println("ISBN: ");
        isbn = sc.nextLine();
        
        System.out.println("Ejemplares: ");
        ejemplares = sc.nextInt();
        
        Libro nuevoLibro = new Libro(isbn, titulo, autor, genero, ejemplares);
        libros.add(nuevoLibro);
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "El libro " + nuevoLibro.getTitulo()+ " se ha agregado correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        
    }

    private void eliminarLibro() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                        Eliminar Libro
                           __________________________________________________________________________________________________________""");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el ISBN del libro que desea eliminar.");

        String isbn = solicitaIsbn();
        int posicionLibro = buscaIsbn(isbn);
        
        if (posicionLibro == -1){
            System.out.println("Por favor, introduca un libro registrado.");
        }else{
            String libroEliminado = libros.get(posicionLibro).getTitulo();
            libros.remove(posicionLibro);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "El libro " + libroEliminado + " ha sido eliminado satisfactoriamente.\n"
                    + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }  
        
    }

    private void modificarLibros() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Editar Libro
                           __________________________________________________________________________________________________________""");
        
        Scanner sc=new Scanner (System.in);
        String isbn;
        int posicionLibro = -1;
        boolean existeLibro = false;
        do {
            System.out.println("Escribe el ISBN del libro a editar.");
            
            isbn = solicitaIsbn();
            posicionLibro = buscaIsbn(isbn);
            
            if(posicionLibro == -1){
                System.out.println("Por favor, introduzca un libro registrado.");
            }
            if (posicionLibro!=-1){
                existeLibro = true;
            }
        } while (existeLibro = false);

        System.out.println("Introduzca cuandos libros quiere agregar o restar al total de ejemplares:");
        int variacionEjemplares = sc.nextInt();
        int nuevoEjemplares = libros.get(posicionLibro).getEjemplares() + variacionEjemplares;
        libros.get(posicionLibro).setEjemplares(nuevoEjemplares);
 
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "                 El libro "+ libros.get(posicionLibro).getTitulo() + ", con ISBN " + libros.get(posicionLibro).getIsbn() +" se ha modificado a correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void listaLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
    
    /*
    -------------------------------- Gestion Usuarios --------------------------------
    */
    
    private void nuevoUsuario() {
        String dni, nombre, email, telefono;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Nuevo Usuario
                           __________________________________________________________________________________________________________""");
        
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Telefono: ");
        telefono = sc.nextLine();
        
        System.out.println("Email: ");
        email = sc.nextLine();
        
        System.out.println("DNI: ");
        dni = sc.nextLine();
        
        Usuario nuevoUsuario = new Usuario(dni, nombre, email, telefono);
        usuarios.add(nuevoUsuario);
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "El usuario " + nuevoUsuario.getNombre()+ " se ha agregado correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void eliminarUsuario() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                        Eliminar Usuario
                           __________________________________________________________________________________________________________""");
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca el dni del usuario a eliminar.");
          
        String dni = solicitaDni();       
        int posicionUsuario = buscaDni(dni);
        
        if(posicionUsuario == -1){
            System.out.println("El DNI introducido no esta registrado.\n"
                    + "Por favor, introduzca el dni de un usuario registrado.");
        }else{
            String usuarioEliminadoNom = usuarios.get(posicionUsuario).getNombre();
            String usuarioEliminadoDni = usuarios.get(posicionUsuario).getDni();
            
            usuarios.remove(posicionUsuario);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "El usuario " + usuarioEliminadoNom + " con DNI "+ usuarioEliminadoDni +" ha sido eliminado satisfactoriamente.\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }  
    }

    private void modificarUsuario() {
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Editar Usuario
                           __________________________________________________________________________________________________________""");
        
        Scanner sc = new Scanner (System.in);
        String dniUsuario;
        int posicionUsuario = -1;
        boolean existeUsuario = false;
        
        do {
            System.out.println("Escribe el DNI del usuario a editar.");

            dniUsuario = solicitaDni();
            posicionUsuario = buscaDni(dniUsuario);
            
            if(posicionUsuario==-1){
                System.out.println("Por favor, introduzca un DNI de un usuario registrado.");
            }
            if (posicionUsuario!=-1){
                existeUsuario = true;
            }
        } while (existeUsuario = false);
        
        System.out.println("""
                           Por favor, indicque el valor a modificar.
                                - 1. Nombre.
                                - 2. Telefono.
                                - 3. Correo Electronico.""");
        int option;
        option = sc.nextInt();
        sc.nextLine();
        switch(option){
            case 1 :{
                System.out.println("Introduzca el nuevo nombre:");
                String nuevoNombre = new String(sc.nextLine());
                usuarios.get(posicionUsuario).setNombre(nuevoNombre);
                break;
            }
            case 2 :{
                System.out.println("Introduzca el nuevo telefono:");
                String nuevoNumero = new String(sc.nextLine());
                usuarios.get(posicionUsuario).setTelefono(nuevoNumero);
                break;
            }
            case 3 :{
                System.out.println("Introduzca el nuevo correo electronico:");
                String nuevoCorreo = new String(sc.nextLine());
                usuarios.get(posicionUsuario).setEmail(nuevoCorreo);
                break;
            }
            default:{
                System.out.println("Introduzca una opcion valida.");
            }
        } 
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "                 El usuario "+ usuarios.get(posicionUsuario).getNombre() +" se ha modificado correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void listaUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
    
    /*
    -------------------------------- Gestion Prestamos --------------------------------
    */
        
    private void nuevoPrestamo() {
        System.out.println("Introduzca el DNI del usuario:");
        String dni=solicitaDni();
        int posUsuario = buscaDni(dni);
        
        if (posUsuario==-1){
            System.out.println("El DNI introducido no pertenece a ningun usuario de la biblioteca.");
        }else{
            System.out.println("Introduzca el ISBN del libro:"); 
            String isbn=solicitaIsbn();
            int posLibro=buscaIsbn(isbn);
           
            if (posLibro==-1){
                System.out.println("El ISBN no pertenece a ningun libro de la biblioteca.");
                
            } else if (libros.get(posLibro).getEjemplares()>0){
                
                if ((buscaPrestamo(dni,isbn))==-1){
                    LocalDate hoy = LocalDate.now();
                    
                    prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                    
                    libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
                    
                    }else{
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                                + "El usuario " + usuarios.get(posUsuario).getNombre()+" ya tiene "
                                + libros.get(posLibro).getTitulo()+" prestado.\n"
                                        + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
                    }
                }else{
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                            + "No quedan unidades disponibles del libro\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
                }
        }
    }
    
    private void devolucion() {
        System.out.println("Datos para la devolucion del préstamo:");
        
        System.out.println("Introduzca el ISBN del libro, por favor.");
        String isbnLibro=solicitaIsbn();
        
        int pos=buscaPrestamo(solicitaDni(),isbnLibro);
        
        if (pos==-1){
            System.out.println("No hay ningun préstamo con esos datos");
            
        }else{
            
            prestamos.get(pos).setFechaDev(LocalDate.now());
            libros.get(buscaIsbn(isbnLibro)).setEjemplares(libros.get(buscaIsbn(isbnLibro)).getEjemplares()+1);
            prestamosHist.add(prestamos.get(pos));
            prestamos.remove(pos);
            
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "Devolucion registrada correctamente."
                    + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }
    }
    
    private void prorroga() {
        System.out.println("Datos para la prorroga del préstamo.");
        
        System.out.println("Introduzca el DNI del usuario.");
        String dni = solicitaDni();
        System.out.println("Introduzca el ISBN del libro.");
        String isbn = solicitaIsbn();
        
        int pos=buscaPrestamo(dni,isbn);
        
        if (pos==-1){
            System.out.println("No hay ningun préstamo con esos datos");
        }else{
            prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
            prestamos.get(pos).setFechaPrest(LocalDate.now());
            
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "                     Prorroga registrada correctamente."
                    + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }
    }

    private void listaPrestamos() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "                         Listado de prestamos activos"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        for (Prestamo p : prestamos) {
            if (p.getFechaDev().isBefore(LocalDate.now())){
                        System.out.print("Libro fuera de plazo: ");
            }
            System.out.println(p);  
        }
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "                         Listado de prestamos historicos"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        for (Prestamo p : prestamosHist) {
            System.out.println(p);  
        }
    }
    
    private void listaPrestamosUsu(){
        String dni=solicitaDni();
        int pos=buscaDni(dni);
        
        if (pos==-1){
            System.out.println("El DNI introducido no corresponde con ningun usuario de la biblioteca.");
        }else{
            
            System.out.println("Prestamos activos de " + usuarios.get(pos).getNombre() +":");
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrest().getDni().equals(dni)){
                    if (p.getFechaDev().isBefore(LocalDate.now())){
                        System.out.print("Libro fuera de plazo: ");
                    }
                    System.out.println(p);  
                }
            }
            
            System.out.println("\nPrestamos ya devueltos por "+ usuarios.get(pos).getNombre() +":");
            for (Prestamo p : prestamosHist) {
                if (p.getUsuarioPrest().getDni().equals(dni)){
                    System.out.println(p);  
                }
            }
        }
    }
    
    private void listaPrestamosLibro(){
        String isbn=solicitaIsbn();
        int pos=buscaIsbn(isbn);
        if (pos==-1){
             System.out.println("El ISBN no se corresponde con ningun libro de la biblioteca.");
        }else{
            System.out.println("Usuarios en posesion:");
            for (Prestamo p : prestamos) {
                if (p.getLibroPrest().getIsbn().equals(isbn)){
                    System.out.println(p.getUsuarioPrest());
                }
            }
            
            System.out.println("Usuarios que lo han leido:");
            for (Prestamo p : prestamosHist) {
                if (p.getLibroPrest().getIsbn().equals(isbn)){
                    System.out.println(p.getUsuarioPrest());
                }
            }
        }
    }
    
    private void libroMasLeido(){
        ArrayList <Integer> contadoresLibros=new ArrayList();
        int contador;
        for (Libro l : libros) {
            contador=0;
            for (Prestamo p:prestamos) {
                if (l==p.getLibroPrest()){
                    contador++;
                }
            }
            for (Prestamo p:prestamosHist) {
                if (l==p.getLibroPrest()){
                    contador++;
                }
            }
            contadoresLibros.add(contador);
        }
        
        int max=0;
        for (int c:contadoresLibros){
            if (c>max){
                max=c;
            }
        }
        System.out.println("El libro mas leido con " + max + " prestamos es: " );
               
        for (int i = 0; i < contadoresLibros.size(); i++) {
            if (contadoresLibros.get(i)==max){
                System.out.println(libros.get(i));
            }
        }
    }
    
    private void usuarioMasLector(){
        ArrayList <Integer> contadoresUsuarios=new ArrayList();
        int contador;
        for (Usuario u : usuarios) {
            contador=0;
            for (Prestamo p:prestamos) {
                if (u==p.getUsuarioPrest()){
                    contador++;
                }
            }
            for (Prestamo p:prestamosHist) {
                if (u==p.getUsuarioPrest()){
                    contador++;
                }
            }
            contadoresUsuarios.add(contador);
        }
        
        int max=0;
        for (int c:contadoresUsuarios){
            if (c>max){
                max=c;
            }
        }
        System.out.println("El usuario mas lector con " + max + " prestamos es: " );
               
        for (int i = 0; i < contadoresUsuarios.size(); i++) {
            if (contadoresUsuarios.get(i)==max){
                System.out.println(usuarios.get(i));
            }
        }
    }
    
    /*
    -------------------------------- Metodos auxiliares --------------------------------
    */
        
    /**
     * Método para solicitar por teclado el DNI de un usuario. pdte de validación
     * @return (String) dni del usuario tecleado
     */
    
    public void fueraPlazo(){
        System.out.println("Prestamos fuera de plazo:");
        for (Prestamo p : prestamos) {
            if (p.getFechaDev().isBefore(LocalDate.now())){
                    System.out.println(p);
            }
        }
    }
          
    public boolean esInt(String s){
        int n;
        try {
            n = Integer.parseInt(s);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
            
        }
    }    
    
    public boolean esDouble(String s){
        Double n;
        try {
            n = Double.parseDouble(s);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
            
        }
    }
    
    public String solicitaDni(){
        Scanner sc=new Scanner(System.in);
        String dni=sc.next();
        return dni;
    }
    
    /**
     * Método para solicitar por teclado el ISBN de un libro. pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String solicitaIsbn(){
        Scanner sc=new Scanner(System.in);
        String isbn=sc.next();
        return isbn;
    }
    
    
    /**
     * Método para buscar un dni en la colección usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int buscaDni(String dni){
        int pos=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getDni().equals(dni)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
    
     /**
     * Método para buscar un libro en la colección libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del libro el Arraylist, valor -1 si no se encuentra
     */
    public int buscaIsbn(String isbn){
        int pos=-1;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
    
     /**
     * Método para buscar un préstamo en la colección préstamos
     * @param dni (String) del usuario que realizó el préstamo
     * @param isbn (String) del libro prestado
     * @return posición (int) del préstamo en el Arraylist, 
     *         valor -1 si no se encuentra un préstamo con esos datos
     */
    public int buscaPrestamo(String dni, String isbn){
        int pos=-1;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getUsuarioPrest().getDni().equals(dni)
                && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn)){   
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
    public void cargaDatos(){
        
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Medico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chaman","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraiso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudu","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El ultimo barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",9
        )); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(1), hoy,hoy.plusDays(15)));
        
        prestamosHist.add(new Prestamo(libros.get(0),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(2),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(5),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(1),usuarios.get(1), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(2), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHist.add(new Prestamo(libros.get(6),usuarios.get(3), hoy.minusDays(20),hoy.minusDays(5)));
    }
}
