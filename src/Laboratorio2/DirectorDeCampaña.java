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
public class DirectorDeCampaña extends Personal {

    private TreeMap<String, Cliente> Clientes;

    public DirectorDeCampaña(CategoriaPersonal Categoria, int numeroDePersonal, String nombre, String cc, String telefono, String email) {
        super(Categoria, numeroDePersonal, nombre, cc, telefono, email);
        this.Clientes = new TreeMap<>();
    }

    public void añadirUnNuevoCliente(Contable c) {

        // INFORMACION MIEMBRO DEL PERSONAL ASIGNADO A ESTE CLIENTE
        System.out.println("cedula del contacto perteneciente al personal que se asignara a este cliente: ");
        Scanner cccontactPersonal = new Scanner(System.in);
        String ccPersonal = cccontactPersonal.nextLine();
        if (c.getPersonal().containsKey(ccPersonal)) {
            System.out.print("Nombre del cliente: ");
            Scanner name = new Scanner(System.in);
            String nombre = name.nextLine();

            System.out.print("Direccion: ");
            Scanner Direccion = new Scanner(System.in);
            String direccion = Direccion.nextLine();

            System.out.print("Telefono: ");
            Scanner phone = new Scanner(System.in);
            String telefono = phone.nextLine();

            System.out.print("Email: ");
            Scanner mail = new Scanner(System.in);
            String email = mail.nextLine();
            //INFORMACION DEL CONTACTO PRINCIPAL
            System.out.print("Nombre del contacto Principal: ");
            Scanner namecontact = new Scanner(System.in);
            String nombreContacto = namecontact.nextLine();

            System.out.print("Cedula del contacto Principal: ");
            Scanner ccContact = new Scanner(System.in);
            String ccContacto = ccContact.nextLine();

            System.out.print("Telefono del contacto Principal: ");
            Scanner phoneContact = new Scanner(System.in);
            String telefonoContacto = phoneContact.nextLine();

            System.out.print("Email del Contacto Principal: ");
            Scanner mailContact = new Scanner(System.in);
            String emailContacto = mailContact.nextLine();

            Persona contacto = new Persona(nombreContacto, ccContacto, emailContacto, telefonoContacto);

            Personal contactoPersonal = c.getPersonal().get(ccPersonal);

            Cliente cliente = new Cliente(nombre, direccion, telefono, email, contacto, contactoPersonal);

            this.Clientes.put(nombre, cliente);
        } else {
            System.out.println("Esta cedula no esta asociada a ningun miembro del personal");
        }
    }

    public void asignarMiembroPersonalACampaña(Contable c, Cliente a) {

        System.out.print("introduzca la cedula del miembro del personal: ");    
        Scanner cc = new Scanner(System.in);
        String cedula = cc.nextLine();
        if (c.getPersonal().containsKey(cedula)) {
            a.mostrarCampañas();
            System.out.print("Introduzca la campaña a la que asignará un miembro del personal: ");
            Scanner campaña = new Scanner(System.in);
            String tituloCampaña = campaña.nextLine();

            if (!a.getCampaña().containsKey(tituloCampaña)) {
                System.out.println("Esta Campaña no existe");
            } else {
                c.getPersonal().get(cedula).getCampañasEnLasQueTrabaja().put(tituloCampaña, a.getCampaña().get(tituloCampaña));
                a.getCampaña().get(tituloCampaña).getPersonal().put(cedula, c.getPersonal().get(cedula));
                System.out.println("Miembro añadido con exito");
            }
        } else {
            System.out.println("No hay ningun miembro asociado a esta cedula");
        }
    }

    public void añadirAnuncioACampaña(Campaña a) {

        System.out.print("Fecha de Creacion: ");
        Scanner fechaCrea = new Scanner(System.in);
        String fechaCreacion = fechaCrea.nextLine();

        System.out.print("Fecha estimada de finalizacion: ");
        Scanner fechaf = new Scanner(System.in);
        String fechaFin = fechaf.nextLine();

        System.out.print("Grado de progreso: ");
        Scanner progress = new Scanner(System.in);
        String progreso = progress.nextLine();

        System.out.println("escoja el tipo de anuncio que desea: ");
        System.out.println("1. Anuncio en periodico.");
        System.out.println("2. Anuncio en revista.");
        System.out.println("3. Anuncio en internet.");
        System.out.println("4. Anuncio en tv.");
        System.out.println("5. Anuncio en radio.");
        System.out.println("6. Anuncio en Carteles.");
        System.out.println("7. Folletos.");

        Scanner menuAnuncio = new Scanner(System.in);
        int menu = menuAnuncio.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Texto escrito del anuncio: ");
                Scanner textoEscritoPeriodico = new Scanner(System.in);
                String textoPeriodico = textoEscritoPeriodico.nextLine();

                System.out.print("Especifique los graficos a utilizar, separados por comas: ");
                Scanner graphicsPeriodico = new Scanner(System.in);
                String graficasPeriodico = graphicsPeriodico.nextLine();

                System.out.print("Especifique las fotografias a utilizar, separadas por comas: ");
                Scanner picsPeriodico = new Scanner(System.in);
                String fotografiasPeriodico = picsPeriodico.nextLine();

                AnunciosEscritos anuncioPeriodico = new AnunciosEscritos(textoPeriodico, graficasPeriodico, fotografiasPeriodico, fechaCreacion, fechaFin, progreso);

                a.getAnuncios().add(anuncioPeriodico);
                break;
            case 2:
                System.out.print("Texto escrito del anuncio: ");
                Scanner textoEscritoRevista = new Scanner(System.in);
                String textoRevista = textoEscritoRevista.nextLine();

                System.out.print("Especifique los graficos a utilizar, separados por comas: ");
                Scanner graphicsRevista = new Scanner(System.in);
                String graficasRevista = graphicsRevista.nextLine();

                System.out.print("Especifique las fotografias a utilizar, separadas por comas: ");
                Scanner picsRevista = new Scanner(System.in);
                String fotografiasRevista = picsRevista.nextLine();

                AnunciosEscritos anuncioRevista = new AnunciosEscritos(textoRevista, graficasRevista, fotografiasRevista, fechaCreacion, fechaFin, progreso);

                a.getAnuncios().add(anuncioRevista);
                break;
            case 3:
                System.out.print("Texto escrito del anuncio: ");
                Scanner textoEscritoInternet = new Scanner(System.in);
                String textoInternet = textoEscritoInternet.nextLine();

                System.out.print("Especifique los graficos a utilizar, separados por comas: ");
                Scanner graphicsInternet = new Scanner(System.in);
                String graficasInternet = graphicsInternet.nextLine();

                System.out.print("Especifique las fotografias a utilizar, separadas por comas: ");
                Scanner picsInternet = new Scanner(System.in);
                String fotografiasInternet = picsInternet.nextLine();

                System.out.print("Especifique las animaciones a utilizar, separadas por comas: ");
                Scanner animationsInternet = new Scanner(System.in);
                String animacionesInternet = animationsInternet.nextLine();

                AnuncioInternet anuncioInternet = new AnuncioInternet(animacionesInternet, textoInternet, graficasInternet, fotografiasInternet, fechaCreacion, fechaCreacion, progreso);

                a.getAnuncios().add(anuncioInternet);
                break;
            case 4:
                System.out.print("Videos que se van a emplear, separados por comas: ");
                Scanner videosTv = new Scanner(System.in);
                String videoTv = videosTv.nextLine();

                System.out.print("Especifique las peliculas a utilizar, separados por comas: ");
                Scanner moviesTv = new Scanner(System.in);
                String PeliculasTv = moviesTv.nextLine();

                System.out.print("Actores que trabajaran en este anuncio: ");
                Scanner actorsTv = new Scanner(System.in);
                String actoresTv = actorsTv.nextLine();

                System.out.print("Alocuciones a emplear, separadas por comas: ");
                Scanner aloTv = new Scanner(System.in);
                String AlocucionesTv = aloTv.nextLine();

                System.out.print("Musica a emplear: ");
                Scanner musicTv = new Scanner(System.in);
                String MusicaTv = musicTv.nextLine();

                AnuncioTv anuncioTv = new AnuncioTv(videoTv, PeliculasTv, actoresTv, AlocucionesTv, MusicaTv, fechaCreacion, fechaCreacion, progreso);

                a.getAnuncios().add(anuncioTv);
                break;
            case 5:
                System.out.print("Audios que se van a emplear, separados por comas: ");
                Scanner soundsRadio = new Scanner(System.in);
                String audiosRadio = soundsRadio.nextLine();

                System.out.print("Actores que trabajaran en este anuncio: ");
                Scanner actorsRadio = new Scanner(System.in);
                String actoresRadio = actorsRadio.nextLine();

                System.out.print("Alocuciones a emplear, separadas por comas: ");
                Scanner aloRadio = new Scanner(System.in);
                String AlocucionesRadio = aloRadio.nextLine();

                System.out.print("Musica a emplear: ");
                Scanner musicRadio = new Scanner(System.in);
                String MusicaRadio = musicRadio.nextLine();

                AnuncioRadio anuncioRadio = new AnuncioRadio(audiosRadio, actoresRadio, AlocucionesRadio, MusicaRadio, fechaCreacion, fechaCreacion, progreso);
                a.getAnuncios().add(anuncioRadio);
                break;
            case 6:

                System.out.print("Texto escrito del anuncio: ");
                Scanner textoEscritoCartel = new Scanner(System.in);
                String textoCartel = textoEscritoCartel.nextLine();

                System.out.print("Especifique los graficos a utilizar, separados por comas: ");
                Scanner graphicsCartel = new Scanner(System.in);
                String graficasCartel = graphicsCartel.nextLine();

                System.out.print("Especifique las fotografias a utilizar, separadas por comas: ");
                Scanner picsCartel = new Scanner(System.in);
                String fotografiasCartel = picsCartel.nextLine();

                System.out.print("Actores que trabajaran en este anuncio: ");
                Scanner actorsCartel = new Scanner(System.in);
                String actoresCartel = actorsCartel.nextLine();

                AnuncioCartel anuncioCartel = new AnuncioCartel(actoresCartel, textoCartel, graficasCartel, fotografiasCartel, fechaCreacion, fechaCreacion, progreso);

                a.getAnuncios().add(anuncioCartel);
                break;
            case 7:
                System.out.print("Texto escrito del anuncio: ");
                Scanner textoEscritoFolleto = new Scanner(System.in);
                String textoFolleto = textoEscritoFolleto.nextLine();

                System.out.print("Especifique los graficos a utilizar, separados por comas: ");
                Scanner graphicsFolleto = new Scanner(System.in);
                String graficasFolleto = graphicsFolleto.nextLine();

                System.out.print("Especifique las fotografias a utilizar, separadas por comas: ");
                Scanner picsFolleto = new Scanner(System.in);
                String fotografiasFolleto = picsFolleto.nextLine();

                AnunciosEscritos anuncioFolleto = new AnunciosEscritos(textoFolleto, graficasFolleto, fotografiasFolleto, fechaCreacion, fechaFin, progreso);

                a.getAnuncios().add(anuncioFolleto);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

    public void cambiarContactoDeCliente(Cliente c) {
        System.out.println("Contacto asignado a este cliente: " + c.mostrarContactoPrincipal());

        System.out.print("Nombre del contacto Principal nuevo: ");
        Scanner namecontact = new Scanner(System.in);
        String nombreContacto = namecontact.nextLine();

        System.out.print("Cedula del contacto Principal nuevo: ");
        Scanner ccContact = new Scanner(System.in);
        String ccContacto = ccContact.nextLine();

        System.out.print("Telefono del contacto Principal nuevo: ");
        Scanner phoneContact = new Scanner(System.in);
        String telefonoContacto = phoneContact.nextLine();

        System.out.print("Email del Contacto Principal nuevo: ");
        Scanner mailContact = new Scanner(System.in);
        String emailContacto = mailContact.nextLine();

        Persona nuevoContacto = new Persona(nombreContacto, ccContacto, telefonoContacto, emailContacto);
        c.setContactoPrincipal(nuevoContacto);
        System.out.println("Nuevo contacto principal de este cliente: " + c.mostrarContactoPrincipal());

    }

    public void registrarFinDeAnuncio(Cliente c) {
       
            System.out.print("Nombre de la campaña: ");
            Scanner Campaña = new Scanner(System.in);
            String nombreCampaña = Campaña.nextLine();

            if (c.getCampaña().containsKey(nombreCampaña)) {

                for (int i = 0; i < c.getCampaña().get(nombreCampaña).getAnuncios().size(); i++) {
                    System.out.println(i + "\t" + c.getCampaña().get(nombreCampaña).getAnuncios().get(i));
                }

                System.out.print("Numero del Anuncio en el que quiere registrar la fecha de fin");
                Scanner Anuncio = new Scanner(System.in);
                int numAnuncio = Anuncio.nextInt();

                if (c.getCampaña().get(nombreCampaña).getAnuncios().get(numAnuncio) == null) {
                    System.out.println("Numero de anuncio no valido");
                } else {

                    System.out.print("Ingrese la fecha de finalizacion de este anuncio");
                    Scanner fechaFin = new Scanner(System.in);
                    String fechaFinalizacion = fechaFin.nextLine();

                    c.getCampaña().get(nombreCampaña).getAnuncios().get(numAnuncio).setFechaPrevistaFinalizacion(fechaFinalizacion);
                }
            } else {
                System.out.println("Esta Campaña no existe");
            }
        
    }

    public void añadirUnaNuevaCampaña(Cliente c) {
        System.out.print("Titulo de la Campaña: ");
        Scanner campaign = new Scanner(System.in);
        String titulo = campaign.nextLine();

        //INFORMACION DEL DIRECTOR DE CAMPAÑA
        System.out.print("Nombre del director de campaña: ");
        Scanner namecontact = new Scanner(System.in);
        String nombreContacto = namecontact.nextLine();

        System.out.print("Cedula del director de campaña: ");
        Scanner ccContact = new Scanner(System.in);
        String ccContacto = ccContact.nextLine();

        System.out.print("Telefono del director de campaña: ");
        Scanner phoneContact = new Scanner(System.in);
        String telefonoContacto = phoneContact.nextLine();

        System.out.print("Email del director de campaña: ");
        Scanner mailContact = new Scanner(System.in);
        String emailContacto = mailContact.nextLine();

        Persona director = new Persona(nombreContacto, emailContacto, telefonoContacto, emailContacto);
        //FIN INFORMACION DIRECTOR

        System.out.print("Fecha de inicio de la Campaña: ");
        Scanner fechaini = new Scanner(System.in);
        String fechaInicio = fechaini.nextLine();

        System.out.print("Fecha de finalizacion de la Campaña: ");
        Scanner fechafin = new Scanner(System.in);
        String fechaFin = fechafin.nextLine();

        System.out.print("Coste Estimado: ");
        Scanner dineroEstimado = new Scanner(System.in);
        double costeEstimado = dineroEstimado.nextDouble();

        System.out.print("Presupuesto: ");
        Scanner budget = new Scanner(System.in);
        double presupuesto = budget.nextDouble();

        System.out.print("Coste Real: ");
        Scanner dineroReal = new Scanner(System.in);
        double costeReal = dineroReal.nextDouble();

        System.out.print("Grado de finalizacion: ");
        Scanner gradofin = new Scanner(System.in);
        String gradoDeFinalizacion = gradofin.nextLine();

        System.out.print("Gratificacion por esta campaña: ");
        Scanner gratifica = new Scanner(System.in);
        double gratificacion = gratifica.nextDouble();

        Campaña campaña = new Campaña(titulo, this, fechaInicio, fechaFin, costeEstimado, presupuesto, costeReal, gradoDeFinalizacion, gratificacion);

        if (!c.getCampaña().containsKey(titulo)) {
            c.getCampaña().put(titulo, campaña);
        } else {
            System.out.println("Esta nombre de campaña ya existe");
        }
    }

    public void registrarFinDeCampaña(Cliente c) {
        
            System.out.print("Nombre de la campaña: ");
            Scanner Campaña = new Scanner(System.in);
            String nombreCampaña = Campaña.nextLine();

            if (c.getCampaña().containsKey(nombreCampaña)) {
                System.out.print("Escriba la fecha de finalizacion de esta campaña");
                Scanner fechaFin = new Scanner(System.in);
                String fechaFinalizacion = fechaFin.nextLine();

                c.getCampaña().get(nombreCampaña).setFechaFin(fechaFinalizacion);
            } else {
                System.out.println("Esta campaña no existe ");
            }
        
    }

    public void AsignarContactoDePersonal(Cliente clie, Contable c) {
        System.out.println("Contacto de personal ya asignado a este cliente: " + clie.getContactoConMiembroDeLaPlantilla());
        System.out.println("1.Asignar un nuevo contacto a este cliente");
        System.out.println("2.Salir.");
        Scanner asignar = new Scanner(System.in);
        int menuAsignar = asignar.nextInt();

        switch (menuAsignar) {
            case 1:
                System.out.print("Cedula del contacto perteneciente al personal que se asignara a este cliente: ");
                Scanner cccontactPersonal = new Scanner(System.in);
                String ccPersonal = cccontactPersonal.nextLine();
                if (c.getPersonal().containsKey(ccPersonal)) {
                    clie.setContactoConMiembroDeLaPlantilla(c.getPersonal().get(ccPersonal));
                } else {
                    System.out.println("Esta cedula no esta asociada a ningun miembro del personal");
                }
                break;
            case 2:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void registrarPago(Cliente c) {
        System.out.print("Escriba el nombre de la campaña que va a pagar");
        Scanner campaña = new Scanner(System.in);
        String nombreCampaña = campaña.nextLine();

        if (c.getCampaña().containsKey(nombreCampaña)) {
            System.out.print("Cuanto dinero va a pagar?");
            Scanner dinero = new Scanner(System.in);
            double pago = dinero.nextDouble();
            double pagoRealizado = c.getCampaña().get(nombreCampaña).getCosteReal() - pago;
            if (pagoRealizado == 0) {
                System.out.print("Ingrese la fecha para registarla como fecha final de pago");
                Scanner fechaFin = new Scanner(System.in);
                String fechaPago = fechaFin.nextLine();

                c.getCampaña().get(nombreCampaña).setFechaFin(fechaPago);
                c.getCampaña().get(nombreCampaña).setGradoDeFinalizacion("PAGADA");
                System.out.println("Ha pagado el total de esta campaña");
            } else if (pagoRealizado > 0) {
                c.getCampaña().get(nombreCampaña).setGradoDeFinalizacion("Aun se deben: $" + pagoRealizado);
                System.out.println("Aun debe: $" + pagoRealizado + " de esta campaña");
            } else {
                System.out.print("Ingrese la fecha para registarla como fecha final de pago");
                Scanner fechaFin = new Scanner(System.in);
                String fechaPago = fechaFin.nextLine();

                c.getCampaña().get(nombreCampaña).setFechaFin(fechaPago);
                c.getCampaña().get(nombreCampaña).setGradoDeFinalizacion("PAGADA");
                System.out.println("Ha pagado el total de esta campaña, le han sobrado: $" + (0 - pagoRealizado));
            }
        } else {
            System.out.println("Esta campaña no pertenece a este cliente.");
        }

    }

    public void comprobarPresupuestoDeCampaña(Campaña camp) {
        if (camp.getPresupuesto() > camp.getCosteReal()) {
            System.out.println("El coste de esta campaña esta dentro del presupuesto");
        } else {
            System.out.println("El coste real de la campaña sobrepasa el presupuesto");
        }
    }

    public TreeMap<String, Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(TreeMap<String, Cliente> Clientes) {
        this.Clientes = Clientes;
    }

}
