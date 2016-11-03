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
public class notaConcepto {

    private String titulo;
    private Personal creadorDeNota;
    private String fechaDeCreacion;
    private String HoraDeCreacion;
    private String ideas;
    private String conceptos;
    private String temas;

    public notaConcepto(String titulo, Personal creadorDeNota, String fechaDeCreacion, String HoraDeCreacion, String ideas, String conceptos, String temas) {
        this.titulo = titulo;
        this.creadorDeNota = creadorDeNota;
        this.fechaDeCreacion = fechaDeCreacion;
        this.HoraDeCreacion = HoraDeCreacion;
        this.ideas = ideas;
        this.conceptos = conceptos;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getCreadorDeNota() {
        return creadorDeNota;
    }

    public void setCreadorDeNota(Personal creadorDeNota) {
        this.creadorDeNota = creadorDeNota;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getHoraDeCreacion() {
        return HoraDeCreacion;
    }

    public void setHoraDeCreacion(String HoraDeCreacion) {
        this.HoraDeCreacion = HoraDeCreacion;
    }

    public String getIdeas() {
        return ideas;
    }

    public void setIdeas(String ideas) {
        this.ideas = ideas;
    }

    public String getConceptos() {
        return conceptos;
    }

    public void setConceptos(String conceptos) {
        this.conceptos = conceptos;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Nota de Concepto{" + "Titulo = " + titulo + ", Creador De Nota = " + creadorDeNota + ", Fecha De Creacion = " + fechaDeCreacion + ", Hora De Creacion = " + HoraDeCreacion + ", Ideas = " + ideas + ", Conceptos = " + conceptos + ", Temas = " + temas + '}';
    }

}
