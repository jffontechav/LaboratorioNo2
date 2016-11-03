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
public class Campaña {

    private String titulo;
    private DirectorDeCampaña director;
    private String fechaInicio;
    private String fechaFin;
    private double costeEstimado;
    private double presupuesto;
    private double costeReal;
    private String gradoDeFinalizacion;
    private double gratificacion;
    private ArrayList<Anuncio> Anuncios;
    private TreeMap<String, Personal> PersonalDeCampaña;
    private TreeMap<String, notaConcepto> notasDeConcepto;

    public Campaña(String titulo, DirectorDeCampaña director, String fechaInicio, String fechaFin, double costeEstimado, double presupuesto, double costeReal, String gradoDeFinalizacion, double gratificacion) {
        this.titulo = titulo;
        this.director = director;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costeEstimado = costeEstimado;
        this.presupuesto = presupuesto;
        this.costeReal = costeReal;
        this.gradoDeFinalizacion = gradoDeFinalizacion;
        this.gratificacion = gratificacion;
        this.Anuncios = new ArrayList<>();
        this.PersonalDeCampaña = new TreeMap<>();
    }

    public void crearNotaDeConcepto() {
        System.out.print("introduzca la cedula del miembro del personal que va a crear esta nota: ");
        Scanner cc = new Scanner(System.in);
        String cedula = cc.nextLine();
        if (this.PersonalDeCampaña.containsKey(cedula)) {
            Personal creadorNota = this.PersonalDeCampaña.get(cedula);
            System.out.print("Titulo de la nota: ");
            Scanner title = new Scanner(System.in);
            String tituloNota = title.nextLine();
            if (this.notasDeConcepto.containsKey(tituloNota)) {
                System.out.println("Este titulo de nota ya está en uso, use otro.");
            } else {
                System.out.print("Fecha de creacion de la nota: ");
                Scanner date = new Scanner(System.in);
                String fechaCreacionNota = date.nextLine();

                System.out.print("Hora de creacion de la nota: ");
                Scanner time = new Scanner(System.in);
                String horaCreacionNota = time.nextLine();

                System.out.print("Ideas para la campaña: ");
                Scanner ideas = new Scanner(System.in);
                String ideasNota = ideas.nextLine();

                System.out.print("Conceptos para la campaña: ");
                Scanner concepts = new Scanner(System.in);
                String conceptoNota = concepts.nextLine();

                System.out.print("Temas de la campaña: ");
                Scanner topics = new Scanner(System.in);
                String temasNota = topics.nextLine();

                notaConcepto a = new notaConcepto(tituloNota, creadorNota, fechaCreacionNota, horaCreacionNota, ideasNota, conceptoNota, temasNota);

                this.notasDeConcepto.put(tituloNota, a);
            }
        } else {
            System.out.println("No hay ningun miembro de esta campaña asociado a esta cedula");
        }
    }

    public void listarNotas() {

        System.out.println("Notas registradas por el personal en esta campaña");

        for (notaConcepto value : this.notasDeConcepto.values()) {
            System.out.println("\t" + value);
        }
    }

    public void listarMiembrosDelPersonal() {

        System.out.println("Director de Campaña: " + this.director);
        System.out.println("Personal de la Campaña");

        for (Personal value : this.PersonalDeCampaña.values()) {
            System.out.println("\t" + value);
        }
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCosteReal() {
        return costeReal;
    }

    public void setCosteReal(double costeReal) {
        this.costeReal = costeReal;
    }

    public void setGradoDeFinalizacion(String gradoDeFinalizacion) {
        this.gradoDeFinalizacion = gradoDeFinalizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DirectorDeCampaña getDirector() {
        return director;
    }

    public void setDirector(DirectorDeCampaña director) {
        this.director = director;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getCosteEstimado() {
        return costeEstimado;
    }

    public void setCosteEstimado(double costeEstimado) {
        this.costeEstimado = costeEstimado;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getGratificacion() {
        return gratificacion;
    }

    public void setGratificacion(double gratificacion) {
        this.gratificacion = gratificacion;
    }

    public ArrayList<Anuncio> getAnuncios() {
        return Anuncios;
    }

    public void setAnuncios(ArrayList<Anuncio> Anuncios) {
        this.Anuncios = Anuncios;
    }

    public TreeMap<String, Personal> getPersonal() {
        return PersonalDeCampaña;
    }

    public void setPersonal(TreeMap<String, Personal> Personal) {
        this.PersonalDeCampaña = Personal;
    }

    public TreeMap<String, notaConcepto> getNotasDeConcepto() {
        return notasDeConcepto;
    }

    public void setNotasDeConcepto(TreeMap<String, notaConcepto> notasDeConcepto) {
        this.notasDeConcepto = notasDeConcepto;
    }

    @Override
    public String toString() {
        return "Campania{" + "titulo=" + titulo + ", director=" + director + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", costeEstimado=" + costeEstimado + ", presupuesto=" + presupuesto + ", costeReal=" + costeReal + ", gradoDeFinalizacion=" + gradoDeFinalizacion + ", gratificacion=" + gratificacion + '}';
    }

    public String generarFactura() {
        return "Campania{" + "titulo=" + titulo + ", director=" + director + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", costeEstimado=" + costeEstimado + ", presupuesto=" + presupuesto + ", costeReal=" + costeReal + ", gradoDeFinalizacion=" + gradoDeFinalizacion + '}';
    }

}
