package Beechfield;


class Problema {
        
    String descripcion;
    int registro ;
    double tiempo;

    public Problema(String descripcion, int registro, double tiempo) {
        this.descripcion = descripcion;
        this.registro = registro;
        this.tiempo = tiempo;
    
        
    
    }
 
    @Override
    
    public String toString() {
        return "Descripcion : " + descripcion+ " Registro: = " + registro + "  Teimpo = " + tiempo;
    }
}
