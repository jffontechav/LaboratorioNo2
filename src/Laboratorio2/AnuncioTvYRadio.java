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
public abstract class AnuncioTvYRadio extends Anuncio {

    private String Actores;
    private String Alocuciones;
    private String Musica;

    public AnuncioTvYRadio(String Actores, String Alocuciones, String Musica, String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        super(fechaCreacion, fechaPrevistaFinalizacion, gradoDeProgreso);
        this.Actores = Actores;
        this.Alocuciones = Alocuciones;
        this.Musica = Musica;
    }

    public String getActores() {
        return Actores;
    }

    public void setActores(String Actores) {
        this.Actores = Actores;
    }

    public String getAlocuciones() {
        return Alocuciones;
    }

    public void setAlocuciones(String Alocuciones) {
        this.Alocuciones = Alocuciones;
    }

    public String getMusica() {
        return Musica;
    }

    public void setMusica(String Musica) {
        this.Musica = Musica;
    }
    
    

}
