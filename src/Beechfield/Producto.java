package Beechfield;


class Producto {
    String nombre;
      int cantidad;
double costo;

    public Producto(String nombre, int cantidad, double costo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }

  

}
