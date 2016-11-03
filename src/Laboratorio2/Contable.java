/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import java.util.*;

/**
 *
 * @author UDSS-ALIANZA
 */
public class Contable extends Personal {

    private TreeMap<String, Personal> Personal;
    private TreeMap<String, CategoriaPersonal> Categorias;

    public Contable(CategoriaPersonal Categoria, int numeroDePersonal, String nombre, String cc, String telefono, String email) {
        super(Categoria, numeroDePersonal, nombre, cc, telefono, email);
        this.Personal = new TreeMap<>();
        this.Categorias = new TreeMap<>();
    }

    public void añadirNuevoMiembroDePersonal() {
        System.out.print("nombre del miembro: ");
        Scanner name = new Scanner(System.in);
        String nombre = name.nextLine();

        System.out.print("cedula del miembro: ");
        Scanner cc = new Scanner(System.in);
        String cedula = cc.nextLine();

        System.out.print("telefono del miembro: ");
        Scanner phone = new Scanner(System.in);
        String telefono = phone.nextLine();

        System.out.print("email del miembro: ");
        Scanner mail = new Scanner(System.in);
        String email = mail.nextLine();

        //Informacion CATEGORIA DE PERSONAL 
        System.out.print("categoria de este miembro en el personal:");
        Scanner category = new Scanner(System.in);
        String nombreCategoria = category.nextLine();

        System.out.print("Sueldo: ");
        Scanner dinero = new Scanner(System.in);
        double sueldo = dinero.nextDouble();

        System.out.print("Fecha de inicio de este miembro en esta categoria: ");
        Scanner fechaini = new Scanner(System.in);
        String fechaInicial = fechaini.nextLine();

        CategoriaPersonal Categoria = new CategoriaPersonal(nombreCategoria, sueldo, fechaInicial);

        this.Categorias.put(nombreCategoria, Categoria);

        System.out.print("Ingrese el numero de Personal que se le asigna a este miembro");
        Scanner numPers = new Scanner(System.in);
        int numeroPersonal = numPers.nextInt();

        Personal a = new Personal(Categoria, numeroPersonal, nombre, cedula, telefono, email);

        if (this.Personal.containsKey(a.getCc())) {
            System.out.println("Este miembro ya existe");
        } else {
            this.Personal.put(a.getCc(), a);
        }
    }

    public void añadirCategoriaPersonal() {
        System.out.print("nombre de categoria del personal:");
        Scanner category = new Scanner(System.in);
        String nombreCategoria = category.nextLine();

        System.out.print("Sueldo: ");
        Scanner dinero = new Scanner(System.in);
        double sueldo = dinero.nextDouble();

        System.out.print("Fecha de inicio en esta categoria: ");
        Scanner fechaini = new Scanner(System.in);
        String fechaInicial = fechaini.nextLine();

        CategoriaPersonal Categoria = new CategoriaPersonal(nombreCategoria, sueldo, fechaInicial);

        if (this.Categorias.containsKey(nombreCategoria)) {
            System.out.println("Esta Categoria ya existe");
        } else {
            this.Categorias.put(nombreCategoria, Categoria);
        }
    }

    public CategoriaPersonal CambiarProporcionDeCategoria(CategoriaPersonal a) {

        System.out.print("introduzca el nuevo Sueldo: ");
        Scanner dinero = new Scanner(System.in);
        double sueldo = dinero.nextDouble();

        a.setSueldo(sueldo);

        System.out.print("introduzca la fecha de inicio de esta categoria: ");
        Scanner fechaini = new Scanner(System.in);
        String FechaInicial = fechaini.nextLine();

        a.setFechaInicio(FechaInicial);

        return a;
    }

    public Personal CambiarCategoriaDeUnMiembro(Personal a) {
        System.out.print("Ingresar nueva categoria de este miembro");
        Scanner category = new Scanner(System.in);
        String nombreCategoria = category.nextLine();

        if (!this.Categorias.containsKey(nombreCategoria)) {
            System.out.print("Esta Categoria no existe");
        } else {
            System.out.print("Fecha de inicio de este miembro en esta categoria: ");
            Scanner fechaini = new Scanner(System.in);
            String fechaInicio = fechaini.nextLine();

            this.Categorias.get(nombreCategoria).setFechaInicio(fechaInicio);

            a.setCategoria(this.Categorias.get(nombreCategoria));
        }
        return a;
    }

    public double calcularGratificacionesDelPersonal() {
        double gratificacionTotal = 0;
        for (Personal value : this.Personal.values()) {
            for (Campaña campaña : value.getCampañasEnLasQueTrabaja().values()) {
                gratificacionTotal += campaña.getGratificacion();
            }
        }
        return gratificacionTotal;
    }

    public TreeMap<String, Personal> getPersonal() {
        return Personal;
    }

    public void setPersonal(TreeMap<String, Personal> Personal) {
        this.Personal = Personal;
    }

    public TreeMap<String, CategoriaPersonal> getCategorias() {
        return Categorias;
    }

    public void setCategorias(TreeMap<String, CategoriaPersonal> Categorias) {
        this.Categorias = Categorias;
    }

}
