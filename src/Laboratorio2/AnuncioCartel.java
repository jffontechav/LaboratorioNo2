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
public class AnuncioCartel extends AnunciosEscritos {

    private String Actores;

    public AnuncioCartel(String Actores, String textoEscrito, String graficos, String fotografias, String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        super(textoEscrito, graficos, fotografias, fechaCreacion, fechaPrevistaFinalizacion, gradoDeProgreso);
        this.Actores = Actores;
    }

    public String getActores() {
        return Actores;
    }

    public void setActores(String Actores) {
        this.Actores = Actores;
    }

    @Override
    public String toString() {
        return "AnuncioCartel{" + "Fecha de Creacion = " + super.getFechaCreacion() + "Fecha prevista de finalizacion = " + super.getFechaPrevistaFinalizacion() + "Grado de finalizacion = " + super.getGradoDeProgreso() + "Texto escrito = " + super.getTextoEscrito() + "Graficos = " + super.getGraficos() + "Fotografias = " + super.getFotografias() + "Actores=" + Actores + '}';
    }

}
