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
public class AnuncioTv extends AnuncioTvYRadio {

    private String Videos;
    private String Peliculas;

    public AnuncioTv(String Videos, String Peliculas, String Actores, String Alocuciones, String Musica, String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        super(Actores, Alocuciones, Musica, fechaCreacion, fechaPrevistaFinalizacion, gradoDeProgreso);
        this.Videos = Videos;
        this.Peliculas = Peliculas;
    }

    public String getVideos() {
        return Videos;
    }

    public void setVideos(String Videos) {
        this.Videos = Videos;
    }

    public String getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(String Peliculas) {
        this.Peliculas = Peliculas;
    }

    @Override
    public String toString() {
        return "AnuncioTv{" + "Fecha de Creacion = " + super.getFechaCreacion() + "Fecha prevista de finalizacion = " + super.getFechaPrevistaFinalizacion() + "Grado de finalizacion = " + super.getGradoDeProgreso() + "Actores = " + super.getActores() + "Alocuciones = " + super.getAlocuciones() + "Musica = " + super.getMusica() + "Videos=" + Videos + ", Peliculas=" + Peliculas + '}';
    }
    
    
}
