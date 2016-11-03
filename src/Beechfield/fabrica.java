package Beechfield;


public class fabrica {

    
    public static void main(String[] args) {
     
        Registro registroD=new Registro();
        Registro  registroS=new Registro();      
          boolean terminar = false;
        
    
        
              
        while (terminar == false) {

            System.out.println("----------------------FoodCo----------------------------");
            System.out.println(".....................Beechfield.........................");
            System.out.println("Acciones ");
            
            

    
            System.out.println("1) LLenar hojas de registro Diaria");
            System.out.println("2) Llenar hoja de registro semanal");
            System.out.println("3) Informe de rentabilidad");
            System.out.println("4) Informe costo Venta");
            System.out.println("5) Informe Remuneracion ");
            System.out.println("6) Informe Nomina");
            System.out.println("7) Informe costo de procucion");
            
            java.util.Scanner menu1 = new java.util.Scanner(System.in);
            int menuPrincipal = menu1.nextInt();
        
             switch (menuPrincipal) {
                case 1:
                    registroD.crearRegistoD();
                    break;
                case 2:
                    registroS.crearRegistoS();
                    break;
                case 3:
                    registroD.infRentabilidad();
                    break;
                case 4:
                    registroS.infcostoVenta();
                case 5:
                    registroS.infRemuneracion();
                case 6:
                    registroS.infoNomina();
                case 7:
                    registroD.infoCostProduccion();
                
                
                case 8 :
                    
                    System.out.println("*********************FoodCo***************");
                    
                    terminar = true;
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
    
}
