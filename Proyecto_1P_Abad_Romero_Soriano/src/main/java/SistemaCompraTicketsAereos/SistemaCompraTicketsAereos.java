package SistemaCompraTicketsAereos;

import Aviones.*;
import Reserva.*;
import Usuario.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaCompraTicketsAereos {

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Operador> operadores = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static ArrayList<Vuelo> vuelos = new ArrayList<>();
    static ArrayList<Avion> aviones = new ArrayList<>();
    //static ArrayList<Asiento> asientos = new ArrayList<>();
    static ArrayList<Itinerario> itinerarios = new ArrayList<>();
    
    //Variable locales para los metodos:
    static ArrayList<Usuario> usuarioa = new ArrayList<>();
    static ArrayList<Vuelo> vueloa = new ArrayList<>();
    double[] valores = new double[6];
    int idaElec = 0;
    int retorElec = 0;
    

    public static void main(String[] args) {
        SistemaCompraTicketsAereos sistema = new SistemaCompraTicketsAereos();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                     BIENVENIDO AL SISTEMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        sistema.cargaUsuarios();
        sistema.cargarClientes();
        sistema.cargarOPeradores();
        sistema.cargarItinerarios();
        sistema.cargarAsientos();
        sistema.cargarAviones();
        sistema.cargarVuelos();
        
        sistema.ingreso();
        sistema.paso1();
        sistema.Paso2();
        sistema.paso3();
        sistema.paso4();
    }

    public void cargaUsuarios() {

        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("usuarios.txt");
        for (String[] s : parametros) {

            String[] arregloNombre = s[1].split(" ");

            if (s[6].equals("S")) {
                Perfil p = Perfil.S;
                Usuario u = new Usuario(s[0], arregloNombre[0], arregloNombre[1], s[2], s[3], s[4], s[5], p);
                usuarios.add(u);

            } else if (s[6].equals("V")) {
                Perfil p = Perfil.V;
                Usuario u = new Usuario(s[0], arregloNombre[0], arregloNombre[1], s[2], s[3], s[4], s[5], p);
                usuarios.add(u);

            } else if (s[6].equals("O")) {
                Perfil p = Perfil.O;
                Usuario u = new Usuario(s[0], arregloNombre[0], arregloNombre[1], s[2], s[3], s[4], s[5], p);
                usuarios.add(u);
            }

        }

    }

    public void cargarClientes() {
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("clientes.txt");
        for (String[] s : parametros) {
            String cedula = s[0];
            String tarjeta = s[1];
            String tipoVIP = s[2];
            String millas = s[3];

            for (Usuario u : usuarios) {
                if (s[0].equals(u.getCedula())) {
                    Cliente c = new Cliente(u.getCedula(), u.getNombres(), u.getApellidos(), u.getEdad(), u.getCorreo(), u.getUsuario(), u.getContraseña(), u.getPerfil(), tarjeta);

                    if (tipoVIP.equals("GOLDEN PASS")) {
                        TipoVIP tv = TipoVIP.GOLDPASS;
                        int m = Integer.valueOf(millas);
                        VIP vip = new VIP(c.getCedula(), c.getNombres(), c.getApellidos(), c.getEdad(), c.getCorreo(), c.getUsuario(), c.getContraseña(), c.getPerfil(), c.getTarjeta(), tv, m);
                        Cliente cc = (Cliente) vip;
                        clientes.add(cc);

                    } else if (tipoVIP.equals("PLATINIUM PASS")) {
                        TipoVIP tv = TipoVIP.PLATINUMPASS;
                        int m = Integer.valueOf(millas);
                        VIP vip = new VIP(c.getCedula(), c.getNombres(), c.getApellidos(), c.getEdad(), c.getCorreo(), c.getUsuario(), c.getContraseña(), c.getPerfil(), c.getTarjeta(), tv, m);
                        Cliente cc = (Cliente) vip;
                        clientes.add(cc);
                    }

                    clientes.add(c);
                }
            }
        }
    }

    public void cargarOPeradores() {
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("operadores.txt");
        for (String[] s : parametros) {
            String cedula = s[0];
            double sueldo = Double.valueOf(s[1]);

            for (Usuario u : usuarios) {
                if (u.getCedula().equals(cedula)) {
                    Operador op = new Operador(u.getCedula(), u.getNombres(), u.getApellidos(), u.getEdad(), u.getCorreo(), u.getUsuario(), u.getContraseña(), u.getPerfil(), sueldo);
                    operadores.add(op);
                }
            }
        }
    }

    public void cargarItinerarios() {
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("itinerarios.txt");
        for (String[] s : parametros) {
            String codigo = s[0];
            String origen = s[1];
            String destino = s[2];
            String horaSalida = s[3];
            String horaLlegada = s[4];
            String duracion = s[5];

            Itinerario i = new Itinerario(codigo, origen, destino, horaSalida, horaLlegada, duracion);
            itinerarios.add(i);

        }

    }

    public void cargarAviones() {
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("aviones.txt");
        for (String[] s : parametros) {
            String codigoAvion = s[0];
            int capacidad = Integer.parseInt(s[1]);

            Avion av = new Avion(codigoAvion, capacidad);
            aviones.add(av);
        }
    }

    public void cargarAsientos() {
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("asientos.txt");
        for (String[] s : parametros) {
            String codigoAvion = s[0];
            String numAsiento = s[1];
            String disponible = s[2];

            for (Avion a : aviones) {
                if (codigoAvion.equals(a.getCodigoAvion())) {
                    if (disponible.equals("s"));
                    Disponibilidad d = Disponibilidad.SI;
                    Asiento as = new Asiento(a.getCodigoAvion(), numAsiento, d);
                    a.getAsientos().add(as);
                }
            }

        }
    }

    public void cargarVuelos() {
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("vuelos.txt");
        for (String[] s : parametros) {
            String codigoVuelo = s[0];
            String codigoAvion = s[1];
            String fechaSalida = s[2];
            String fechaLlegada = s[3];
            String codigoItinerario = s[4];
            double precio = Double.parseDouble(s[5]);
            double precioMillas = Double.parseDouble(s[6]);

            for (Avion a : aviones) {
                if (codigoAvion.equals(a.getCodigoAvion())) {
                    for (Itinerario i : itinerarios) {
                        if (codigoItinerario.equals(i.getCodigoItinerario())) {
                            Vuelo v = new Vuelo(codigoVuelo, codigoAvion, fechaSalida, fechaLlegada, codigoItinerario, precio, precioMillas);
                            vuelos.add(v);
                        }
                    }
                }
            }

        }
    }

    public void ingreso() {
        SistemaCompraTicketsAereos sistema = new SistemaCompraTicketsAereos();
        Scanner sc = new Scanner(System.in);
        System.out.print("USUARIO: ");
        String usuarioi = sc.nextLine();
        System.out.print("CONTRASEÑA: ");
        String contraseñai = sc.nextLine();
        for (Usuario elemento : usuarios) {
            if (elemento.getUsuario().equals(usuarioi)) {
                if (elemento.getContraseña().equals(contraseñai)) {
                    if (elemento.getPerfil().equals(Perfil.S) || elemento.getPerfil().equals(Perfil.V)) {
                        Usuario u = new Usuario(elemento.getCedula(), elemento.getNombres(), elemento.getApellidos(), elemento.getEdad(), elemento.getCorreo(), elemento.getUsuario(), elemento.getContraseña(), elemento.getPerfil());
                        usuarioa.add(u);
                        sistema.menuCliente();

                    }
                    if (elemento.getPerfil().equals(Perfil.O)) {
                        Usuario u = new Usuario(elemento.getCedula(), elemento.getNombres(), elemento.getApellidos(), elemento.getEdad(), elemento.getCorreo(), elemento.getUsuario(), elemento.getContraseña(), elemento.getPerfil());
                        usuarioa.add(u);
                        sistema.menuOperador();

                    }
                }
            }

        }
    }

    public void menuCliente() {
        SistemaCompraTicketsAereos sistema = new SistemaCompraTicketsAereos();
        System.out.println("\n1. Comprar tickets aéreos");

        //color do while para repetir este
        System.out.println("2. Consultar reservas");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su opcion: ");

        int x = sc.nextInt();

        if (x == 1) {
            sistema.paso1();
            sistema.paso4();
            sistema.paso3();

        } else if (x == 2) {
            //invocar e metodo de consultar reser
        }
    }

    public void paso1() {

        System.out.println("Debe mostrarse una lista de todos los  itinerarios");
        String[] lugares = {"QUITO", "GUAYAQUIL", "LIMA", "BUENOS AIRES", "SANTIAGO", "BOGOTÁ", "BRASILIA", "ASUNCIÓN", "MONTEVIDEO"};

        System.out.println("---ORIGEN---");

        System.out.println("1.Quito\n2.Guayaquil\n3.Lima\n4.Santiago\n5.Bogotá\n6.Brasilia\n7.Asunción\n8.Montevideo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija el punto de partida: ");
        int origen = sc.nextInt();

        String origenC = lugares[origen - 1];
        System.out.println("---DESTINO---");
        System.out.println("1.Quito\n2.Guayaquil\n3.Lima\n4.Santiago\n5.Bogotá\n6.Brasilia\n7.Asunción\n8.Montevideo");
        System.out.print("Elija el punto de destino: ");
        int destino = sc.nextInt();
        sc.nextLine();
        String destinoC = lugares[destino - 1];
        System.out.print("Fecha de salida: ");
        String fecha_salida = sc.nextLine();
        System.out.print("Fecha de llegada: ");
        String fecha_retorno = sc.nextLine();

        System.out.println("*******************Paso1*********************");
        System.out.println("*********************************************\n");
        System.out.println("----------Vuelos disponibles IDA-------------\n");
        int num = 1;
        int veces = 0;

        for (Itinerario it : itinerarios) {

            if (it.getOrigen().equals(origenC)) {
                if (it.getDestino().equals(destinoC)) {
                    System.out.println("-----------------------" + num + "-----------------------");
                    System.out.println("CODIGO: " + it.getCodigoItinerario());
                    System.out.println("HORA SALIDA: " + it.getHoraSalida());
                    System.out.println("HORA LLEGADA: " + it.getHoraLlegada());
                    System.out.println("DURACIÓN: " + it.getDuracion());
                    System.out.println("AVION: " + vuelos.get(veces).getCodAvion());
                    System.out.println("PRECIO: " + vuelos.get(veces).getPrecio());
                    System.out.println("COSTO MILLAS: " + vuelos.get(veces).getPrecioMillas());
                    vueloa.add(vuelos.get(veces));
                    num++;
                }

            }
            veces++;
        }

        System.out.print("Elige el vuelo de ida: ");
        int elecIda = sc.nextInt();
        idaElec = elecIda;
        
        valores[0] = vueloa.get(elecIda - 1).getPrecio();
        valores[1] = vueloa.get(elecIda - 1).getPrecioMillas();
        sc.nextLine();
        int vueloasize = vueloa.size();
        System.out.println("TARIFAS:\n");
        System.out.println("A. Economy (+0)");
        System.out.println("B. Premium economy (+60)");
        System.out.println("C. Premium business (+90)");
        System.out.println("Elige la tarifa para tu vuelo: ");
        String tarifaIda = sc.nextLine();

        if (tarifaIda.toUpperCase().equals("A")) {
            valores[2] = 0;
        } else if (tarifaIda.toUpperCase().equals("B")) {
            valores[2] = 60;
        } else if (tarifaIda.toUpperCase().equals("C")) {
            valores[2] = 90;
        }

        System.out.println("\n----------Vuelos disponibles RETORNO-------------\n");
        num = 1;
        veces = 0;
        for (Itinerario it : itinerarios) {

            if (it.getOrigen().equals(destinoC)) {
                if (it.getDestino().equals(origenC)) {

                    System.out.println("-----------------------" + num + "-----------------------");
                    System.out.println("CODIGO: " + it.getCodigoItinerario());
                    System.out.println("HORA SALIDA: " + it.getHoraSalida());
                    System.out.println("HORA LLEGADA: " + it.getHoraLlegada());
                    System.out.println("DURACIÓN: " + it.getDuracion());
                    System.out.println("AVION: " + vuelos.get(veces).getCodAvion());
                    System.out.println("PRECIO: " + vuelos.get(veces).getPrecio());
                    System.out.println("COSTO MILLAS: " + vuelos.get(veces).getPrecioMillas());
                    vueloa.add(vuelos.get(veces));  //----------------------------------------------------vuelo se añade a vueloa
                    num++;
                }

            }
            veces++;
        }

        System.out.print("Elige el vuelo de ida: ");
        int elecRetorno = sc.nextInt();
        retorElec = elecRetorno;
        int elecRetor = vueloasize + elecRetorno;
        valores[3] = vueloa.get(elecRetor - 1).getPrecio();
        valores[4] = vueloa.get(elecRetor - 1).getPrecioMillas();
        sc.nextLine();

        System.out.println("TARIFAS:\n");
        System.out.println("A. Economy (+0)");
        System.out.println("B. Premium economy (+60)");
        System.out.println("C. Premium business (+90)");
        System.out.println("Elige la tarifa para tu vuelo: ");
        String tarifaRetorno = sc.nextLine();

        if (tarifaRetorno.toUpperCase().equals("A")) {
            valores[5] = 0;
        } else if (tarifaRetorno.toUpperCase().equals("B")) {
            valores[5] = 60;
        } else if (tarifaRetorno.toUpperCase().equals("C")) {
            valores[5] = 90;
        }
    }
    
    public void Paso2(){
        System.out.println("*******************Paso2*********************");
        System.out.println("*********************************************\n");
        
        for (Vuelo v : vueloa) {
            System.out.println(v);
        }

        for (Usuario u : usuarioa) {
            System.out.println(u);
        }

        String vIda = vueloa.get(idaElec - 1).getCodAvion();  //codigo de vuelo de Ida
        for (Avion a : aviones) {
            if (vIda.equals(a.getCodigoAvion())) {
                ArrayList<Asiento> asientos = a.getAsientos();
                Asiento asiento = a.generarAsiento();
                for (Asiento aa : asientos) {
                    System.out.println("Para tu vuelo de ida " + vIda + " se te ha asignado el asiento " + asiento.codigoAsiento);
                }
            }
        }

        String vRetor = vueloa.get(retorElec - 1).getCodAvion(); //codigo de vuelo de Retorno
        for (Avion a : aviones) {
            if (vRetor.equals(a.getCodigoAvion())) {
                ArrayList<Asiento> asientos = a.getAsientos();
                Asiento asiento = a.generarAsiento();
                for (Asiento aa : asientos) {
                    System.out.println("Para tu vuelo de ida " + vRetor + " se te ha asignado el asiento " + asiento.codigoAsiento);
                }
            }
        }
    }

    public void paso3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************Paso3*********************");
        System.out.println("*********************************************\n");
        System.out.println("--------------DATOS PASAJERO-----------------\n");
        System.out.println("Completa los datos del pasajero:");
        System.out.println("Nombres: " + usuarioa.get(0).getNombres());
        System.out.println("Apellidos: " + usuarios.get(0).getApellidos());
        System.out.println("Correo: " + usuarios.get(0).getCorreo());
        System.out.print("Fecha nacimiento: ");
        sc.nextLine();
        System.out.print("Género (1. Masculino - 2. Femenino ): ");
        sc.nextLine();
        System.out.print("Nacionalidad: ");
        sc.nextLine();
        System.out.print("Tipo de documento(1. Cédula - 2. Pasaporte): ");
        String doc = sc.nextLine();
        if (doc.equals("1")) {
            System.out.println("Número de documento: " + usuarios.get(0).getCedula());
        } else {
            System.out.print("Número de documento: ");
            sc.nextLine();
        }
        System.out.println("¿Desea guardar los datos del pasajero y continuar con el pago (s/n)? ");
        sc.nextLine();
        System.out.println("Ha completado el paso 3\n");
    }

    public void paso4() {
        System.out.println("*******************Paso4*********************");
        System.out.println("*********************************************\n");
        System.out.println("-----------------PAGO------------------\n");
        System.out.println("Descripción:\n");
        
        //Recursos:
        double subtotal = valores[0] + valores[1] + valores[3] + valores[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Subtotal: " + subtotal);
        double descuento = 0;

        if (usuarioa.get(0).getPerfil().equals(Perfil.V)) {

            for (Cliente cl : clientes) {
                
                System.out.println(usuarioa.get(0).getCedula());
                
                if (usuarioa.get(0).getCedula().equals(cl.getCedula())) {
                    
                    VIP vi = (VIP) cl;
                    
                    
                    
                    if (vi.getTipoVIP().equals(TipoVIP.GOLDPASS)) {
                        descuento = 0.2d;
                        System.out.println("Descuento: "+descuento);
                        
                        descuento = 0.2d;
                        double impuesto = 0.12d;
                        double subtotalIVA = (impuesto*subtotal);
                        subtotal += subtotalIVA;

                        System.out.println("TOTAL: "+subtotal);
                        System.out.println("IVA: "+subtotalIVA);
                        System.out.println("TOTAL A PAGAR: "+subtotal+"\n");  

                        System.out.println("Formas de pago:");
                        System.out.println("1. Tarjeta de credito");
                        System.out.println("2. Millas\n");
                    
                    }else if (vi.getTipoVIP().equals(TipoVIP.PLATINUMPASS)) {
                        descuento = 0.3d;
                        System.out.println("Descuento: "+descuento);
                        
                        double impuesto = 0.12d;
                        double subtotalIVA = (impuesto*subtotal);
                        subtotal += subtotalIVA;

                        System.out.println("TOTAL: "+subtotal);
                        System.out.println("IVA: "+subtotalIVA);
                        System.out.println("TOTAL A PAGAR: "+subtotal+"\n");  

                        System.out.println("Formas de pago:");
                        System.out.println("1. Tarjeta de credito");
                        System.out.println("2. Millas\n");
                    }
                }
                }
        }else {
            System.out.println("Descuento: No aplica (cliente STANDARD)"); 
            double impuesto = 0.12d;
            double subtotalIVA = (impuesto*subtotal);
            subtotal += subtotalIVA;
            System.out.println("TOTAL: "+subtotal);
            System.out.println("IVA: "+subtotalIVA);
            System.out.println("TOTAL A PAGAR: "+subtotal+"\n");  
            System.out.println("Formas de pago:");
            System.out.println("1. Tarjeta de credito");
            System.out.println("2. Millas\n");
        }
        
        System.out.println("Ejlite tu forma de pago: ");
        int opcion = sc.nextInt();
        
        if(opcion == 1){
            //Cliente clientePagar = (Cliente)usuarioa;
            //String numTarjeta = clientePagar.getTarjeta();
            //System.out.println(numTarjeta);
            System.out.println(vueloa);
            System.out.println(usuarioa);
            
        }else if (opcion == 2){
            Cliente clientePagar = (Cliente)usuarioa.get(0);
            String numTarjeta = clientePagar.getTarjeta();
            System.out.println(numTarjeta);
            System.out.println("\nSeguro de pagar el vuelo(s/n):");
            String confirmacion = sc.next();
            if(confirmacion.equals("s")){
                System.out.println(vueloa);
                System.out.println(usuarioa);
                System.out.println("Has comprado tu vuelo. Tu codigo de reserva es: ");
            
            }
        }
    }

    public void menuOperador() {
        System.out.println("\n1. Consultar usuarios");
        System.out.println("2. Consultar reservas");
        System.out.println("3. Salir");

    }
}
