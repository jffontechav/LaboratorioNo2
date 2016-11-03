package Beechfield;


import java.util.Scanner;


public class RegistroDia {
     
    
    
 byte linea;
 String supervisor;
 
 //cambiar por clase
 
 int trabajoNumero;

    
 String diaSemana;
 double inicioSerie;
 double finSerie;
 String firma;
 String verificado;
 private Fecha fecha;
 private Producto producto;
private Problema problem;

    public RegistroDia(byte linea, String supervisor, int trabajoNumero, String diaSemana, double inicioSerie, double finSerie, String firma, String verificado, Fecha fecha, Producto producto, Problema problem) {
        this.linea = linea;
        this.supervisor = supervisor;
        this.trabajoNumero = trabajoNumero;
        this.diaSemana = diaSemana;
        this.inicioSerie = inicioSerie;
        this.finSerie = finSerie;
        this.firma = firma;
        this.verificado = verificado;
        this.fecha = fecha;
        this.producto = producto;
        this.problem = problem;
    }

      


    

    
     
    

  

  
    

    
    public void ingresarLinea(byte newLinea){
        this.linea = newLinea;
    }
    
    public void insertarSupervisor(String newSupervisor) {
        java.util.Scanner Supervisor = new java.util.Scanner(System.in);
        newSupervisor = Supervisor.nextLine();
    }
    
 public Fecha getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }
    
    public void insertarTrabajoN(int newTrabajoN) {
        this.trabajoNumero= newTrabajoN;
              
    }
    
 
    public void insertarDia(String newDia){
        java.util.Scanner Dia = new java.util.Scanner(System.in);
        newDia = Dia.nextLine();
        
    } 
    
   public void inserarInicioS(int newInicioS ){
       this.inicioSerie= newInicioS;
   }
   
   public void insertarFinS(int newFinS){
       this.finSerie= newFinS;
   }

   public Problema getProblema(){
       return problem;
   }
    
   
   
     public void insertarFirma(String newFirma) {
        java.util.Scanner Firma = new java.util.Scanner(System.in);
        newFirma = Firma.nextLine();
    }
    
    
     
   
     
     public void insertarVerificado(String newVerificado) {
        java.util.Scanner Verificado = new java.util.Scanner(System.in);
        newVerificado = Verificado.nextLine();
    }

    @Override
    public String toString() {
        return "RegistroDia{" + "linea=" + linea + ", supervisor=" + supervisor + ", trabajoNumero=" + trabajoNumero + ", diaSemana=" + diaSemana + ", inicioSerie=" + inicioSerie + ", finSerie=" + finSerie + ", firma=" + firma + ", verificado=" + verificado + ", fecha=" + fecha + ", producto=" + producto + ", problem=" + problem + '}';
    }

     
    
  
    

    

    
    
}
