package Beechfield;


import Beechfield.Tabla;


public class HojaSemana {
byte linea;
String name;
private Fecha fecha;
String nameFabrica="B" ;
int numeroNomina;
String supervisor;
String autor;
double horaTotal;
double tarifa;

private Tabla tabla;

    public HojaSemana(String name, Fecha fecha, int numeroNomina, String supervisor, String autor, double horaTotal, double tarifa) {
        this.name = name;
        this.fecha = fecha;
        this.numeroNomina = numeroNomina;
        this.supervisor = supervisor;
        this.autor = autor;
        this.horaTotal = horaTotal;
        this.tarifa = tarifa;
    }




 public void insertarNombre(String newNombre) {
        java.util.Scanner Nombre= new java.util.Scanner(System.in);
        newNombre = Nombre.nextLine();
 }
    public Fecha getFecha() {
        return fecha;
    }
    
    public void fabrica(String B ){
      this.nameFabrica=B;
   }
   public void insertarNomina(int newNomina){
      this.numeroNomina= newNomina;
   }

   
   public Tabla getTabla(){
       return tabla;
       
   }
  
    public void insertarSupervisor(String newSupervisor) {
        java.util.Scanner Supervisorr= new java.util.Scanner(System.in);
        newSupervisor = Supervisorr.nextLine();
 }
     
     public void insertarAutor(String newAutor) {
        java.util.Scanner Autor= new java.util.Scanner(System.in);
        newAutor = Autor.nextLine();
        
    
     }
       public void insertarHoras(double newHoras){
           
      this.horaTotal=newHoras;
       
       }
       
          public void insertarTarifa(double newTarifa){
      this.tarifa= newTarifa;
   }
          
          
          public void  categoria() {
       int categoria1=2000;   
         int categoria2=3000;
             int categoria3=4000;
        
    }

    double categoria(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
 }
      
   
   

