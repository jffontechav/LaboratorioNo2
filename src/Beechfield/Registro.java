package Beechfield;


import Beechfield.RegistroDia;
import Beechfield.Tabla;


public class Registro {
    
  private RegistroDia registroD;
 private HojaSemana registroS;
 
 //variables calculos
 private double jornalOp;
 private double remuneracion;
    private double nomina;
    private double rentabilidad;
    private double costoProduccion;
    private double costoVenta;
 
     public void crearRegistoD() {
         
        System.out.print("Linea #1,2 o 3: ");
        java.util.Scanner Linea = new java.util.Scanner(System.in);
        double linea = Linea.nextByte(); 
        
        System.out.print("Nombre del  Supervisor: ");
        java.util.Scanner supervissor = new java.util.Scanner(System.in);
        String supervisor = supervissor.nextLine();
        
        System.out.println("fecha de Registro:");
        System.out.print("Dia: ");
        java.util.Scanner dia = new java.util.Scanner(System.in);
        int diaIngreso = dia.nextInt();
        System.out.print("Mes: ");
        java.util.Scanner mes = new java.util.Scanner(System.in);
        int mesIngreso = mes.nextInt();
        System.out.print("Año: ");         
        java.util.Scanner año = new java.util.Scanner(System.in);
        int añoIngreso = año.nextInt();
        
        
          System.out.print("informar problema: ");
         System.out.print("descripcion: ");     
        java.util.Scanner Descripcion = new java.util.Scanner(System.in);
        String descripcion =Descripcion.nextLine();
         System.out.print("Numero registro: ");     
         java.util.Scanner Registro = new java.util.Scanner(System.in);
        int registro = Registro.nextInt();
        System.out.print("Tiempo: ");     
         java.util.Scanner Tiempo = new java.util.Scanner(System.in);
        int tiempo = Tiempo.nextInt();
        
        
        
        System.out.print("Producto: ");
        System.out.print("Nombre del Producto: ");
        java.util.Scanner Nombre =new java.util.Scanner(System.in);
        String nombre= Nombre.nextLine();
         System.out.print("Cantidad: ");
              java.util.Scanner Cantidad = new java.util.Scanner(System.in);
        int cantidad = Cantidad.nextInt();
             System.out.print("Costo: ");
              java.util.Scanner Costo= new java.util.Scanner(System.in);
        int costo = Costo.nextInt();
        
               
         System.out.print("Trabajo N°: ");
        java.util.Scanner numero = new java.util.Scanner(System.in);
        int trabajoNumero = numero.nextInt();
        
        System.out.print("Dia de la semana{L,M,X,J,V,S,D}: ");
        java.util.Scanner Dia = new java.util.Scanner(System.in);
        String diaSemana = Dia.nextLine();
        
        
         System.out.print("Hora Inicio Serie: ");
        java.util.Scanner Inicio = new java.util.Scanner(System.in);
        double inicioSerie = Inicio.nextInt();
        
         System.out.print("Hora Fin Serie: ");
        java.util.Scanner Fin = new java.util.Scanner(System.in);
        double finSerie = Fin.nextInt();
      
        
      
         System.out.print("Firma(supervisor): ");
        java.util.Scanner Firma = new java.util.Scanner(System.in);
        String firma = Firma.nextLine();
         
             System.out.print(" Verificado Por: ");
        java.util.Scanner Verificado = new java.util.Scanner(System.in);
        String verificado = Verificado.nextLine();
        


        Fecha fecha = new Fecha(diaIngreso, mesIngreso, añoIngreso);
         Problema problem=new Problema(descripcion,  registro,  tiempo); 
         Producto producto=new Producto( nombre, cantidad,  costo);
        this.registroD = new RegistroDia((byte) linea, supervisor, trabajoNumero,  diaSemana, inicioSerie,  finSerie, firma, verificado,  fecha,  producto,problem);
        this.rentabilidad= (costoVenta/costo)*100;
       this.costoVenta= (costoProduccion+ costo);
        
    }

 
      public void crearRegistoS() {
          
         System.out.print("Nombre del  Supervisor: ");
        java.util.Scanner supervissor = new java.util.Scanner(System.in);
        String name = supervissor.nextLine();
           
              System.out.println("W/E:");
        System.out.print("Dia: ");
        java.util.Scanner dia = new java.util.Scanner(System.in);
        int diaIngreso = dia.nextInt();
        System.out.print("Mes: ");
        java.util.Scanner mes = new java.util.Scanner(System.in);
        int mesIngreso = mes.nextInt();
        System.out.print("Año: ");         
        java.util.Scanner año = new java.util.Scanner(System.in);
        int añoIngreso = año.nextInt();
          
        
               System.out.print(" Fabrica: ");
        java.util.Scanner Fabrica = new java.util.Scanner(System.in);
        String fabrica = Fabrica.nextLine();
        
            System.out.print("Numero de nomina: ");
        java.util.Scanner Nomina = new java.util.Scanner(System.in);
        int numeroNomina = Nomina.nextInt();
   
         
        
              System.out.print("Tabla: ");
         System.out.print("Fecha: ");     
        java.util.Scanner FechaT = new java.util.Scanner(System.in);
       String fechaT =FechaT.nextLine();
       
         System.out.print("Linea #1,2 o 3: ");
        java.util.Scanner Linea = new java.util.Scanner(System.in);
        double linea = Linea.nextByte(); 
        

        
       
         System.out.print("Numero Trabajo: ");     
         java.util.Scanner Trabajo = new java.util.Scanner(System.in);
        int numTrabajo = Trabajo.nextInt();
        
        
         System.out.print("Horas Productivas: ");     
         java.util.Scanner Productivas = new java.util.Scanner(System.in);
        double horasProductivas = Productivas.nextInt();
        
         
        System.out.print("Tiempo inactivida: ");     
         java.util.Scanner Inactividad = new java.util.Scanner(System.in);
        double tiempoInactividad = Inactividad.nextInt();
        
          System.out.print("Other: ");     
         java.util.Scanner Other = new java.util.Scanner(System.in);
        double other = Other.nextInt();
        
        
        
         System.out.print("code: ");     
         java.util.Scanner Code = new java.util.Scanner(System.in);
        int code = Code.nextInt();
        
        
       
           System.out.print("Firmado(supervisor): ");     
        java.util.Scanner Supervisor = new java.util.Scanner(System.in);
       String supervisor =Supervisor.nextLine();
       
         System.out.print("Autor(director): ");     
        java.util.Scanner Autor= new java.util.Scanner(System.in);
       String autor =Autor.nextLine();
       
       System.out.print("Hora total: ");     
         java.util.Scanner HTotal= new java.util.Scanner(System.in);
        double horaTotal = HTotal.nextInt();
        
       System.out.print("Tarifa: ");     
         java.util.Scanner Tarifa= new java.util.Scanner(System.in);
        double tarifa = Tarifa.nextInt();
        
       
       
        Fecha fecha = new Fecha(diaIngreso, mesIngreso, añoIngreso);
        Tabla tabla=new Tabla( numTrabajo, horasProductivas,  tiempoInactividad,  other,  code,  fecha, fechaT);    
       this.registroS= new HojaSemana( name,fecha, numeroNomina, supervisor, autor,  horaTotal,  tarifa);
       this.jornalOp = (horaTotal* this.registroS.categoria(2000)*tarifa* this.registroD.getProducto().cantidad + remuneracion);
    this.remuneracion=(tiempoInactividad* tarifa);   
    this.nomina=jornalOp*horaTotal;
    this.costoProduccion= jornalOp*horaTotal;
      
      }
     
      
    public void infRentabilidad() {
        System.out.println(this.rentabilidad);
    }

    public void infcostoVenta() {
        System.out.println(this.costoVenta);
    }

    public void infRemuneracion() {
        System.out.println(this.remuneracion);
    }

    public void infoNomina() {
        System.out.println(this.nomina);       
    }
    
    public void infoCostProduccion(){
        System.out.println(this.costoProduccion);
    }
        
      
     
     
    }
    

