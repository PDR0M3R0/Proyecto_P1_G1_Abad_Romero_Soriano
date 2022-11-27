package SistemaCompraTicketsAereos;


import Aviones.*;
import Reserva.*;
import Usuario.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaCompraTicketsAereos {

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static ArrayList<Vuelo> vuelos = new ArrayList<>();
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
