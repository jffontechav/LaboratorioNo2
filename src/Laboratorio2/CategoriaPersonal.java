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
public class CategoriaPersonal  {

    private String nombreDeCategoria;
    private double sueldo;
    private String fechaInicio;

    public CategoriaPersonal(String nombreDeCategoria, double sueldo, String fechaInicio) {
        this.nombreDeCategoria = nombreDeCategoria;
        this.sueldo = sueldo;
        this.fechaInicio = fechaInicio;
    }

    public String getNombreDeCategoria() {
        return nombreDeCategoria;
    }

    public void setNombreDeCategoria(String nombreDeCategoria) {
        this.nombreDeCategoria = nombreDeCategoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nombre De Categoria = " + nombreDeCategoria + ", sueldo = " + sueldo + ", fechaInicio = " + fechaInicio + '}';
    }

}
