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
public class Cliente {

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Persona contactoPrincipal;
    private TreeMap<String, Campaña> Campaña;
    private Personal contactoConMiembroDeLaPlantilla;

    public Cliente(String nombre, String direccion, String telefono, String email, Persona contactoPrincipal, Personal contactoConMiembroDeLaPlantilla) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contactoPrincipal = contactoPrincipal;
        this.Campaña = new TreeMap<>();
        this.contactoConMiembroDeLaPlantilla = contactoConMiembroDeLaPlantilla;
    }

    public void mostrarCampañas() {
        for (Campaña campaña : this.Campaña.values()) {
            System.out.println(campaña);
        }
    }

    public Campaña buscarCampaña(String titulo) {
        Campaña c = null;
        if (this.Campaña.containsKey(titulo)) {
            c = this.Campaña.get(titulo);
        } else {
            System.out.println("Esta campaña no existe");
        }
        return c;
    }

    public Persona mostrarContactoPrincipal() {
        return contactoPrincipal;
    }

    public void setContactoPrincipal(Persona contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TreeMap<String, Campaña> getCampaña() {
        return Campaña;
    }

    public void setCampaña(TreeMap<String, Campaña> Campaña) {
        this.Campaña = Campaña;
    }

    public Persona getContactoConMiembroDeLaPlantilla() {
        return contactoConMiembroDeLaPlantilla;
    }

    public void setContactoConMiembroDeLaPlantilla(Personal contactoConMiembroDeLaPlantilla) {
        this.contactoConMiembroDeLaPlantilla = contactoConMiembroDeLaPlantilla;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", contactoPrincipal=" + contactoPrincipal + ", Campa\u00f1a=" + Campaña + '}';
    }

}
