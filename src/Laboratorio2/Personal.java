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
public class Personal extends Persona {

    private CategoriaPersonal Categoria;
    private int numeroDePersonal;
    private TreeMap<String, Campaña> campañasEnLasQueTrabaja;

    public Personal(CategoriaPersonal Categoria, int numeroDePersonal, String nombre, String cc, String telefono, String email) {
        super(nombre, cc, telefono, email);
        this.Categoria = Categoria;
        this.numeroDePersonal = numeroDePersonal;
        this.campañasEnLasQueTrabaja = new TreeMap<>();
    }

    public notaConcepto buscarNotaConcepto(Cliente c) {
        notaConcepto note = null;
        System.out.print("Nombre de la campaña: ");
        Scanner Campaña = new Scanner(System.in);
        String nombreCampaña = Campaña.nextLine();

        if (c.getCampaña().containsKey(nombreCampaña)) {

            for (notaConcepto notaDeCampaña : c.getCampaña().get(nombreCampaña).getNotasDeConcepto().values()) {
                System.out.println("Titulo de la nota = " + notaDeCampaña.getTitulo());
            }
            System.out.println("Escriba el titulo de la nota que esta buscando");
            Scanner titlenota = new Scanner(System.in);
            String titulo = titlenota.nextLine();

            if (c.getCampaña().get(nombreCampaña).getNotasDeConcepto().containsKey(titulo)) {
                note = c.getCampaña().get(nombreCampaña).getNotasDeConcepto().get(titulo);
            } else {
                System.out.println("Ninguna nota esta asociada a ese titulo.");
            }

        } else {
            System.out.println("Esta Campaña no existe");
        }
        return note;
    }

    public void listarCampañas() {

        System.out.println("Campañas en las que trabaja este miembro del personal");

        for (Campaña value : this.campañasEnLasQueTrabaja.values()) {
            System.out.println("\t" + value);
        }
    }

    public CategoriaPersonal getCategoria() {
        return Categoria;
    }

    public void setCategoria(CategoriaPersonal Categoria) {
        this.Categoria = Categoria;
    }

    public int getNumeroDePersonal() {
        return numeroDePersonal;
    }

    public void setNumeroDePersonal(int numeroDePersonal) {
        this.numeroDePersonal = numeroDePersonal;
    }

    public TreeMap<String, Campaña> getCampañasEnLasQueTrabaja() {
        return campañasEnLasQueTrabaja;
    }

    public void setCampañasEnLasQueTrabaja(TreeMap<String, Campaña> campañasEnLasQueTrabaja) {
        this.campañasEnLasQueTrabaja = campañasEnLasQueTrabaja;
    }

    @Override
    public String toString() {
        return "Nombre = " + super.getNombre() + "Cedula = " + super.getCc() + "Telefono " + super.getTelefono() + "Email" + super.getEmail() + "Categoria=" + Categoria + ", numeroDePersonal=" + numeroDePersonal + ", campañas En Las Que Trabaja = " + campañasEnLasQueTrabaja + '}';
    }

}
