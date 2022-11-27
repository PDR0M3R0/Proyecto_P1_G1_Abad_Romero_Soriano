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
    

    public static void main(String[] args) {
        SistemaCompraTicketsAereos sistema = new SistemaCompraTicketsAereos();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                     BIENVENIDO AL SISTEMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        sistema.cargaUsuarios();
        sistema.cargarClientes();
        sistema.ingreso();
    }

    public void cargaUsuarios() {
        
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("usuarios.txt");
        for(String[] s:parametros){
            
            String[] arregloNombre = s[1].split(" ");
            
            
            if(s[6].equals("S")){
                Perfil p = Perfil.S;
                Usuario u = new Usuario(s[0],arregloNombre[0],arregloNombre[1],s[2],s[3],s[4],s[5],p);
                usuarios.add(u);
                
            }else if(s[6].equals("V")){
                Perfil p = Perfil.V;
                Usuario u = new Usuario(s[0],arregloNombre[0],arregloNombre[1],s[2],s[3],s[4],s[5],p);
                usuarios.add(u);
                
            }else if (s[6].equals("O")){
                Perfil p = Perfil.O;
                Usuario u = new Usuario(s[0],arregloNombre[0],arregloNombre[1],s[2],s[3],s[4],s[5],p);
                usuarios.add(u);
            }
       
        }    
        
        
    }
    
    
    public void cargarClientes(){
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("clientes.txt");
        for(String[] s: parametros){
            String cedula = s[0];
            String tarjeta = s[1];
            String tipoVIP = s[2];
            String millas = s[3];
            
            for(Usuario u:usuarios){
                if(s[0].equals(u.getCedula())){
                    Cliente c  = new Cliente(u.getCedula(),u.getNombres(),u.getApellidos(),u.getEdad(),u.getCorreo(),u.getUsuario(),u.getContraseña(),u.getPerfil(),tarjeta);
                    
                    if(tipoVIP.equals("GOLDEN PASS")){
                        TipoVIP tv = TipoVIP.GOLDPASS;
                        int m = Integer.valueOf(millas);
                        VIP vip = new VIP(c.getCedula(),c.getNombres(),c.getApellidos(),c.getEdad(),c.getCorreo(),c.getUsuario(),c.getContraseña(),c.getPerfil(),c.getTarjeta(),tv,m);
                        Cliente cc = (Cliente)vip;
                        clientes.add(cc);
                    
                    }else if(tipoVIP.equals("PLATINIUM PASS")){
                        TipoVIP tv = TipoVIP.PLATINUMPASS;
                        int m = Integer.valueOf(millas);
                        VIP vip = new VIP(c.getCedula(),c.getNombres(),c.getApellidos(),c.getEdad(),c.getCorreo(),c.getUsuario(),c.getContraseña(),c.getPerfil(),c.getTarjeta(),tv,m);
                        Cliente cc = (Cliente)vip;
                        clientes.add(cc);  
                    }
                    
                    clientes.add(c);
                }
            } 
        } 
    }
    
    public void cargarOPeradores(){
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("operadores.txt");
        for(String[] s: parametros){
            String cedula = s[0];
            double sueldo = Double.valueOf(s[1]);
            
            for(Usuario u: usuarios){
                if(u.getCedula().equals(cedula)){
                  Operador op = new Operador(u.getCedula(),u.getNombres(),u.getApellidos(),u.getEdad(),u.getCorreo(),u.getUsuario(),u.getContraseña(),u.getPerfil(),sueldo);
                  operadores.add(op);
                }
            } 
        } 
    }
    
    public void cargarItinerarios(){
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("itinerarios.txt");
        for(String[] s: parametros){
            String codigo = s[0];
            String origen = s[1];
            String destino = s[2];
            String horaSalida = s[3];
            String horaLlegada = s[4];
            String duracion = s[5];
            
            Itinerario i = new Itinerario(codigo,origen,destino,horaSalida,horaLlegada,duracion);
            itinerarios.add(i);
            
        }
        
    }
    
    public void cargarAviones(){
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("vuelos.txt");
        for(String[] s: parametros){
            String codigoAvion = s[0];
            int capacidad = Integer.valueOf(s[1]);
            
            Avion av = new Avion(codigoAvion,capacidad);
            aviones.add(av);           
        }        
    }
    
    
    public void cargarAsientos(){
        ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("vuelos.txt");
        for(String[] s: parametros){
            String codigoAvion = s[0];
            int numAsiento = Integer.valueOf(s[1]);
            String disponible = s[2];
            
            for(Avion a : aviones){
            if(codigoAvion.equals(a.getCodigoAvion())){
                if(disponible.equals("s"));
                Disponibilidad d = Disponibilidad.SI;
                Asiento as = new Asiento(a.getCodigoAvion(),numAsiento,d);
                a.getAsientos().add(as);
                }
            }
            
        }
    }
    
    public void cargarVuelos(){
       ArrayList<String[]> parametros = ManejoArchivo.LeeFichero("vuelos.txt");
       for(String[] s: parametros){
            String codigoVuelo = s[0];
            String codigoAvion = s[1];
            String fechaSalida = s[3];
            String fechaLlegada = s[4];
            String codigoItinerario = s[5];
            double precio = Double.valueOf(s[6]);
            double precioMillas = Double.valueOf(s[7]);
            
            for(Avion a: aviones){
                if(codigoAvion.equals(a.getCodigoAvion())){
                    for(Itinerario i: itinerarios){
                        if(codigoItinerario.equals(i.getCodigoItinerario())){
                            Vuelo v = new Vuelo(codigoVuelo,codigoAvion,fechaSalida,fechaLlegada,codigoItinerario,precio,precioMillas);
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
                        sistema.menuCliente();

                    }
                    if (elemento.getPerfil().equals(Perfil.O)) {
                        sistema.menuOperador();
                    }
                }
            }
        }

    }

    public void menuCliente() {

        System.out.println("\n1. Comprar tickets aéreos");

        //color do while para repetir este
        System.out.println("1. Comprar tickets aéreos");
        System.out.println("2. Consultar reservas");
        System.out.println("3. Salir");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su opcion: ");
        
        int x = sc.nextInt();
        sc.close();
        
        if(x == 1){
            //invocar el metodo de comrpar ticket
        }else if(x == 2){
            //invocar e metodo de consultar reser
        }
        

    }

    public void menuOperador() {
        System.out.println("\n1. Consultar usuarios");
        System.out.println("2. Consultar reservas");
        System.out.println("3. Salir");
        
        
        
        
    }
}
