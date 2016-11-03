package Beechfield;


public class Tabla {

byte linea;
int numTrabajo;
double horasProductivas;
double tiempoInactividad;
double other;
int code;
String fechaT;
 private Fecha fecha;

    public Tabla(int numTrabajo, double horasProductivas, double tiempoInactividad, double other, int code, Fecha fecha,String fechaT) {
        this.numTrabajo = numTrabajo;
        this.horasProductivas = horasProductivas;
        this.tiempoInactividad = tiempoInactividad;
        this.other = other;
        this.code = code;
        this.fecha = fecha;
        this.fechaT =fechaT;
    }

    
   public Fecha getFecha() {
        return fecha;
    }
   
   public void ingresarLinea(byte newLinea){
        this.linea = newLinea;
    }
   
   public void ingresarLinea(double newHrsProductivas){
        this.horasProductivas = newHrsProductivas;
    }
   
   public void ingresarTiempoInactivo(double newTiempoInactivo){
        this.tiempoInactividad = newTiempoInactivo;
    }
   
   public void ingresarOther(double newOther){
        this.other = newOther;
    }
   public void ingresarCode(int newCode){
        this.code = newCode;
   }    
      public void ingresarFechaT(String newFechaT){
        this.fechaT = newFechaT;
             
    }

     
      
      
      
    @Override
    public String toString() {
        return "Tabla{" + "linea=" + linea + ", numTrabajo=" + numTrabajo + ", horasProductivas=" + horasProductivas + ", tiempoInactividad=" + tiempoInactividad + ", other=" + other + ", code=" + code + ", fechaT=" + fechaT + ", fecha=" + fecha + '}';
    }
    
 
           
       }         
       
        
   
   






   


   
