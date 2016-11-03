/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import java.util.*;

/**
 *
 * @author UDSS-ALIANZA
 */
public class main {

    public static void main(String[] args) {
        System.out.println("--------------------------BIENVENIDO A AGATE--------------------------");
        System.out.println("");
        System.out.println("Cree el director de campaña");
        System.out.println("");
        System.out.println("Nombre: ");
        Scanner nameDirec = new Scanner(System.in);
        String nombreDirec = nameDirec.nextLine();
        System.out.println("Cedula: ");
        Scanner ccDirec = new Scanner(System.in);
        String cedulaDirec = ccDirec.nextLine();
        System.out.println("Telefono: ");
        Scanner phoneDirec = new Scanner(System.in);
        String telefonoDirec = phoneDirec.nextLine();
        System.out.println("Email: ");
        Scanner emailDirec = new Scanner(System.in);
        String correoDirector = emailDirec.nextLine();
        //INFORMACION DE CATEGORIA PERSONAL//
        String nombreCategoriaDirector = "Director de Campaña";

        System.out.println("Sueldo: ");
        Scanner dineroDirec = new Scanner(System.in);
        double sueldoDirector = dineroDirec.nextDouble();

        System.out.println("Fecha de inicio en la compañia: ");
        Scanner fechaIniDirec = new Scanner(System.in);
        String fechaInicialDirector = fechaIniDirec.nextLine();

        CategoriaPersonal directorCampaña = new CategoriaPersonal(nombreCategoriaDirector, sueldoDirector, fechaInicialDirector);

        System.out.println("Numero de identificacion asignado a esta persona como miembro de agate");
        Scanner idDirec = new Scanner(System.in);
        int identificacionDirec = idDirec.nextInt();

        DirectorDeCampaña Direc1 = new DirectorDeCampaña(directorCampaña, identificacionDirec, nombreDirec, cedulaDirec, telefonoDirec, correoDirector);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Cree el Contable de la empresa");
        System.out.println("");
        System.out.println("Nombre: ");
        Scanner nameCont = new Scanner(System.in);
        String nombreCont = nameCont.nextLine();
        System.out.println("Cedula: ");
        Scanner ccCont = new Scanner(System.in);
        String cedulaCont = ccCont.nextLine();
        System.out.println("Telefono: ");
        Scanner phoneCont = new Scanner(System.in);
        String telefonoCont = phoneCont.nextLine();
        System.out.println("Email: ");
        Scanner emailCont = new Scanner(System.in);
        String correoCont = emailCont.nextLine();
        //INFORMACION DE CATEGORIA PERSONAL//
        String nombreCategoriaCont = "Contable";

        System.out.println("Sueldo: ");
        Scanner dineroCont = new Scanner(System.in);
        double sueldoCont = dineroCont.nextDouble();

        System.out.println("Fecha de inicio en la compañia: ");
        Scanner fechaIniCont = new Scanner(System.in);
        String fechaInicialCont = fechaIniCont.nextLine();

        CategoriaPersonal Contable = new CategoriaPersonal(nombreCategoriaCont, sueldoCont, fechaInicialCont);

        System.out.println("Numero de identificacion asignado a esta persona como miembro de agate");
        Scanner idCont = new Scanner(System.in);
        int identificacionCont = idCont.nextInt();

        Contable Cont1 = new Contable(Contable, identificacionCont, nombreCont, cedulaCont, telefonoCont, correoCont);
        System.out.println("-----------------------------------------------------------------------");
        boolean Ejecucion = true;
        while (Ejecucion == true) {

            System.out.println("Escoja una opcion: ");
            System.out.println("");
            System.out.println("1. Menu Contable");
            System.out.println("2. Menu Director ");
            System.out.println("3. Terminar programa");
            Scanner Principal = new Scanner(System.in);
            int menuPrincipal = Principal.nextInt();

            switch (menuPrincipal) {
                case 1:
                    System.out.println("Menu de acciones del contable");
                    System.out.println("");
                    System.out.println("1. Añadir nuevo miembro de personal");
                    System.out.println("2. Añadir nueva categoria personal");
                    System.out.println("3. Cambiar sueldo de una categoria");
                    System.out.println("4. Cambiar la categoria de un miembro del personal");
                    System.out.println("5. Calcular las gratificaciones de todo el personal");
                    System.out.println("6. Terminar programa");
                    Scanner menuCont = new Scanner(System.in);
                    int menuContable = menuCont.nextInt();

                    switch (menuContable) {
                        case 1:
                            Cont1.añadirNuevoMiembroDePersonal();
                            break;
                        case 2:
                            Cont1.añadirCategoriaPersonal();
                            break;
                        case 3:
                            System.out.print("Ingrese el nombre de la categoria de personal al cual va a cambiar el sueldo: ");
                            Scanner category = new Scanner(System.in);
                            String categoria = category.nextLine();
                            if (Cont1.getCategorias().containsKey(categoria)) {
                                Cont1.CambiarProporcionDeCategoria(Cont1.getCategorias().get(categoria));
                            } else {
                                System.out.println("Ninguna categoria está asociada a ese nombre");
                            }
                            break;
                        case 4:
                            System.out.print("Ingrese la cedula del miembro de personal al cual va a cambiar de categoria: ");
                            Scanner cc2 = new Scanner(System.in);
                            String cedula2 = cc2.nextLine();
                            if (Cont1.getPersonal().containsKey(cedula2)) {
                                Cont1.CambiarCategoriaDeUnMiembro(Cont1.getPersonal().get(cedula2));
                            } else {
                                System.out.println("Ningun miembro está asociado a esta cedula");
                            }
                            break;
                        case 5:
                            System.out.println(Cont1.calcularGratificacionesDelPersonal());
                            break;
                        case 6:
                            Ejecucion = false;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Menu de acciones del Director de Campaña");
                    System.out.println("");
                    System.out.println("1. Añadir nuevo Cliente");
                    System.out.println("2. Cambiar un contacto de un cliente");
                    System.out.println("3. Asignar un contacto del personal a un cliente");
                    System.out.println("4. Registrar pago de un cliente");
                    System.out.println("5. Mostrar campañas de un cliente.");
                    System.out.println("6. Ingresar al menu de Campañas");
                    System.out.println("7. Ingresar al menu de personal");
                    System.out.println("8. Terminar programa");
                    Scanner menuDirec = new Scanner(System.in);
                    int menuDirector = menuDirec.nextInt();
                    switch (menuDirector) {
                        case 1:
                            Direc1.añadirUnNuevoCliente(Cont1);
                            break;

                        case 2:
                            System.out.print("Ingrese el nombre del cliente al que cambiara el ccontacto existente: ");
                            Scanner cliente3 = new Scanner(System.in);
                            String Cliente3 = cliente3.nextLine();
                            if (Direc1.getClientes().containsKey(Cliente3)) {
                                Direc1.cambiarContactoDeCliente(Direc1.getClientes().get(Cliente3));
                            } else {
                                System.out.println("Ningun cliente está asociado a este nombre");
                            }
                            break;

                        case 3:
                            System.out.print("Ingrese el nombre del cliente al que asignara un contacto del personal: ");
                            Scanner cliente5 = new Scanner(System.in);
                            String Cliente5 = cliente5.nextLine();
                            if (Direc1.getClientes().containsKey(Cliente5)) {
                                Direc1.AsignarContactoDePersonal(Direc1.getClientes().get(Cliente5), Cont1);
                            } else {
                                System.out.println("Ningun cliente está asociado a este nombre");
                            }
                            break;
                        case 4:
                            System.out.print("Ingrese el nombre del cliente que realizara el pago: ");
                            Scanner cliente6 = new Scanner(System.in);
                            String Cliente6 = cliente6.nextLine();
                            if (Direc1.getClientes().containsKey(Cliente6)) {
                                Direc1.registrarPago(Direc1.getClientes().get(Cliente6));
                            } else {
                                System.out.println("Ningun cliente está asociado a este nombre");
                            }
                            break;

                        case 5:
                            System.out.print("Ingrese el nombre del cliente para mostrar las campañas asociadas este: ");
                            Scanner cliente8 = new Scanner(System.in);
                            String Cliente8 = cliente8.nextLine();
                            if (Direc1.getClientes().containsKey(Cliente8)) {
                                Direc1.getClientes().get(Cliente8).mostrarCampañas();
                            } else {
                                System.out.println("Ningun cliente está asociado a este nombre");
                            }
                            break;
                        case 6:
                            System.out.println("Menu de Campañas");
                            System.out.println("");
                            System.out.print("Ingrese el nombre del cliente para ingresar al menu de Campañas: ");
                            Scanner cliente1 = new Scanner(System.in);
                            String Cliente1 = cliente1.nextLine();
                            if (Direc1.getClientes().containsKey(Cliente1)) {
                                System.out.println("");
                                System.out.println("1. Asignar personal para trabajar en una campaña");
                                System.out.println("2. Añadir nuevo anuncio a una campaña");
                                System.out.println("3. Registrar la finalizacion de un anuncio");
                                System.out.println("4. Añadir una nueva campaña");
                                System.out.println("5. Registrar la finalizacion de una campaña");
                                System.out.println("6. Comprobar el presupuesto de Campaña");
                                System.out.println("7. Listar miembros del personal que trabajan una campaña");
                                System.out.println("8. Crear nota de concepto en una campaña");
                                System.out.println("9. Listar notas de concepto de una campaña");
                                System.out.println("10. Generar factura de una campaña");

                                Scanner menuCamp = new Scanner(System.in);
                                int menuCampañas = menuCamp.nextInt();

                                switch (menuCampañas) {
                                    case 1:
                                        Direc1.asignarMiembroPersonalACampaña(Cont1, Direc1.getClientes().get(Cliente1));
                                        break;
                                    case 2:
                                        System.out.print("Introduzca la campaña en la que añadira un nuevo anuncio: ");
                                        Scanner campaña = new Scanner(System.in);
                                        String tituloCampaña = campaña.nextLine();

                                        if (Direc1.getClientes().get(Cliente1).getCampaña().containsKey(tituloCampaña)) {
                                            Direc1.añadirAnuncioACampaña(Direc1.getClientes().get(Cliente1).getCampaña().get(tituloCampaña));
                                        } else {
                                            System.out.println("Ninguna campaña está asociada a ese titulo");
                                        }
                                        break;
                                    case 3:
                                        Direc1.registrarFinDeAnuncio(Direc1.getClientes().get(Cliente1));
                                        break;
                                    case 4:
                                        Direc1.añadirUnaNuevaCampaña(Direc1.getClientes().get(Cliente1));
                                        break;
                                    case 5:
                                        Direc1.registrarFinDeCampaña(Direc1.getClientes().get(Cliente1));
                                        break;
                                    case 6:
                                        System.out.print("Introduzca la campaña de la que quiere comprobar el presupuesto: ");
                                        Scanner campaña1 = new Scanner(System.in);
                                        String tituloCampaña1 = campaña1.nextLine();

                                        if (Direc1.getClientes().get(Cliente1).getCampaña().containsKey(tituloCampaña1)) {
                                            Direc1.comprobarPresupuestoDeCampaña(Direc1.getClientes().get(Cliente1).getCampaña().get(tituloCampaña1));
                                        } else {
                                            System.out.println("Ninguna campaña está asociada a ese titulo");
                                        }
                                        break;
                                    case 7:
                                        System.out.print("Introduzca el titulo de la campaña de la cual quiere listar los miembros: ");
                                        Scanner campaña2 = new Scanner(System.in);
                                        String tituloCampaña2 = campaña2.nextLine();

                                        if (Direc1.getClientes().get(Cliente1).getCampaña().containsKey(tituloCampaña2)) {
                                            Direc1.getClientes().get(Cliente1).getCampaña().get(tituloCampaña2).listarMiembrosDelPersonal();
                                        } else {
                                            System.out.println("Ninguna campaña está asociada a ese titulo");
                                        }
                                    case 8:
                                        System.out.print("Introduzca el titulo de la campaña en la cual quiere crear una nota de concepto: ");
                                        Scanner campaña3 = new Scanner(System.in);
                                        String tituloCampaña3 = campaña3.nextLine();

                                        if (Direc1.getClientes().get(Cliente1).getCampaña().containsKey(tituloCampaña3)) {
                                            Direc1.getClientes().get(Cliente1).getCampaña().get(tituloCampaña3).crearNotaDeConcepto();
                                        } else {
                                            System.out.println("Ninguna campaña está asociada a ese titulo");
                                        }
                                    case 9:
                                        System.out.print("Introduzca el titulo de la campaña de la cual quiere listar las notas de concepto: ");
                                        Scanner campaña4 = new Scanner(System.in);
                                        String tituloCampaña4 = campaña4.nextLine();

                                        if (Direc1.getClientes().get(Cliente1).getCampaña().containsKey(tituloCampaña4)) {
                                            Direc1.getClientes().get(Cliente1).getCampaña().get(tituloCampaña4).listarNotas();
                                        } else {
                                            System.out.println("Ninguna campaña está asociada a ese titulo");
                                        }
                                    case 10:
                                        System.out.print("Introduzca el titulo de la campaña de la cual quiere generar la factura: ");
                                        Scanner campaña5 = new Scanner(System.in);
                                        String tituloCampaña5 = campaña5.nextLine();

                                        if (Direc1.getClientes().get(Cliente1).getCampaña().containsKey(tituloCampaña5)) {
                                            Direc1.getClientes().get(Cliente1).getCampaña().get(tituloCampaña5).generarFactura();
                                        } else {
                                            System.out.println("Ninguna campaña está asociada a ese titulo");
                                        }
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            } else {
                                System.out.println("Ningun cliente está asociado a este nombre");
                            }
                            break;
                        case 7:
                            System.out.println("Menu de acciones del Personal");
                            System.out.println("");
                            System.out.println("1. Buscar nota de concepto");
                            System.out.println("2. Ver las campañas en las que trabaja un miembro del personal");

                            Scanner menuPers = new Scanner(System.in);
                            int menuPersonal = menuPers.nextInt();
                            switch (menuPersonal) {
                                case 1:
                                    System.out.println("Ingrese su cedula: ");
                                    Scanner cc = new Scanner(System.in);
                                    String numCedula = cc.nextLine();

                                    if (Cont1.getPersonal().containsKey(numCedula)) {
                                        System.out.print("Ingrese el nombre del cliente: ");
                                        Scanner cliente = new Scanner(System.in);
                                        String Cliente = cliente.nextLine();
                                        if (Direc1.getClientes().containsKey(Cliente)) {
                                            Cont1.getPersonal().get(numCedula).buscarNotaConcepto(Direc1.getClientes().get(Cliente));
                                        } else {
                                            System.out.println("Ningun cliente está asociado a este nombre");
                                        }
                                    } else {
                                        System.out.println("Ninguna miembro está registrado con este numero de cedula");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Ingrese su cedula: ");
                                    Scanner cc1 = new Scanner(System.in);
                                    String numCedula1 = cc1.nextLine();

                                    if (Cont1.getPersonal().containsKey(numCedula1)) {
                                        Cont1.getPersonal().get(numCedula1).listarCampañas();
                                    } else {
                                        System.out.println("Ninguna miembro está registrado con este numero de cedula");
                                    }
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                            break;
                        case 8:
                            Ejecucion = false;
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 3:
                    Ejecucion = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
