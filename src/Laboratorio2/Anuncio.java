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
public abstract class Anuncio {

    private String fechaCreacion;
    private String fechaPrevistaFinalizacion;
    private String gradoDeProgreso;

    public Anuncio(String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        this.fechaCreacion = fechaCreacion;
        this.fechaPrevistaFinalizacion = fechaPrevistaFinalizacion;
        this.gradoDeProgreso = gradoDeProgreso;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaPrevistaFinalizacion() {
        return fechaPrevistaFinalizacion;
    }

    public void setFechaPrevistaFinalizacion(String fechaPrevistaFinalizacion) {
        this.fechaPrevistaFinalizacion = fechaPrevistaFinalizacion;
    }

    public String getGradoDeProgreso() {
        return gradoDeProgreso;
    }

    public void setGradoDeProgreso(String gradoDeProgreso) {
        this.gradoDeProgreso = gradoDeProgreso;
    }

}
