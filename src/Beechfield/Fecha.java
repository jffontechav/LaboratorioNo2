package Beechfield;


public class Fecha {
    
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        return "Dia = " + dia + " Mes = " + mes + " Ano = " + año;
    }
    
    
            
   
}
