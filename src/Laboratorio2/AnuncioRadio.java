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
public class AnuncioRadio extends AnuncioTvYRadio {

    private String Audio;

    public AnuncioRadio(String Audio, String Actores, String Alocuciones, String Musica, String fechaCreacion, String fechaPrevistaFinalizacion, String gradoDeProgreso) {
        super(Actores, Alocuciones, Musica, fechaCreacion, fechaPrevistaFinalizacion, gradoDeProgreso);
        this.Audio = Audio;
    }

    public String getAudio() {
        return Audio;
    }

    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    @Override
    public String toString() {
        return "AnuncioRadio{" + "Fecha de Creacion = " + super.getFechaCreacion() + "Fecha prevista de finalizacion = " + super.getFechaPrevistaFinalizacion() + "Grado de finalizacion = " + super.getGradoDeProgreso() + "Actores = " + super.getActores() + "Alocuciones = " + super.getAlocuciones() + "Musica = " + super.getMusica() + "Audio=" + Audio + '}';
    }

}
