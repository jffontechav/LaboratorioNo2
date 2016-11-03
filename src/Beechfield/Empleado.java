package Beechfield;


public class Empleado {
    
    String nombre;
    int nnumeroID;

    public Empleado(String nombre, int nnumeroID) {
        this.nombre = nombre;
        this.nnumeroID = nnumeroID;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", nnumeroID=" + nnumeroID + '}';
    }
    
    
    
}
