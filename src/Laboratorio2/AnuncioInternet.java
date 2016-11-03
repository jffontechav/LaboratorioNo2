/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author UDSS-ALIANZA
 */
public class AnuncioInternet extends AnunciosEscritos {

    private String Animaciones;

    public AnuncioInternet(String Animaciones, String textoEscrito, String graficos, String fotografias, String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        super(textoEscrito, graficos, fotografias, fechaCreacion, fechaPrevistaFinalizacion, gradoDeProgreso);
        this.Animaciones = Animaciones;
    }

    public String getAnimaciones() {
        return Animaciones;
    }

    public void setAnimaciones(String Animaciones) {
        this.Animaciones = Animaciones;
    }

    @Override
    public String toString() {
        return "AnuncioInternet{" + "Fecha de Creacion = " + super.getFechaCreacion() + "Fecha prevista de finalizacion = " + super.getFechaPrevistaFinalizacion() + "Grado de finalizacion = " + super.getGradoDeProgreso() + "Texto escrito = " + super.getTextoEscrito() + "Graficos = " + super.getGraficos() + "Fotografias = " + super.getFotografias() + "Animaciones=" + Animaciones + '}';
    }

}
