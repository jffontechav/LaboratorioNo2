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
public class AnunciosEscritos extends Anuncio {

    private String textoEscrito;
    private String graficos;
    private String fotografias;

    public AnunciosEscritos(String textoEscrito, String graficos, String fotografias, String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        super(fechaCreacion, fechaPrevistaFinalizacion, gradoDeProgreso);
        this.textoEscrito = textoEscrito;
        this.graficos = graficos;
        this.fotografias = fotografias;
    }

    public String getTextoEscrito() {
        return textoEscrito;
    }

    public void setTextoEscrito(String textoEscrito) {
        this.textoEscrito = textoEscrito;
    }

    public String getGraficos() {
        return graficos;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }

    public String getFotografias() {
        return fotografias;
    }

    public void setFotografias(String fotografias) {
        this.fotografias = fotografias;
    }

    @Override
    public String toString() {
        return "Anuncios Escritos{" + "Fecha de Creacion = " + super.getFechaCreacion() + "Fecha prevista de finalizacion = " + super.getFechaPrevistaFinalizacion() + "Grado de finalizacion = " + super.getGradoDeProgreso() + "textoEscrito=" + textoEscrito + ", graficos=" + graficos + ", fotografias=" + fotografias + '}';
    }
    
    

}
