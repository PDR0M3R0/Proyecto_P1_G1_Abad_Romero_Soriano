package SistemaCompraTicketsAereos;

import Aviones.*;
import Reserva.*;
import Usuario.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaCompraTicketsAereos {

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static ArrayList<Vuelo> vuelos = new ArrayList<>();
    static ArrayList<Itinerario> itinerarios = new ArrayList<>();
    

    public static void main(String[] args) {
        SistemaCompraTicketsAereos sistema = new SistemaCompraTicketsAereos();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                     BIENVENIDO AL SISTEMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n\n");
        sistema.cargaUsuarios();
        sistema.ingreso();
    }

    public void cargaUsuarios() {

        usuarios.add(new Usuario("0972327367", "Carolina", "Sabando", "23", "csabando@gmail.com", "csabando", "dkioeiw2", Perfil.S));
        usuarios.add(new Usuario("0923879161", "Armando", "Mancilla", "45", "armandoM@gmail.com", "amancilla", "qwrty", Perfil.S));
        usuarios.add(new Usuario("0927363768", "Ana", "Rosero", "38", "arosero@gmail.com", "arose", "ihsywy", Perfil.V));
        usuarios.add(new Usuario("1207392968", "Gerardo", "Campos", "56", "gcampos@gmail.com", "gcampos", "28374jshs", Perfil.O));
        usuarios.add(new Usuario("0926534836", "Ramiro", "Vasquez", "30", "rvasquz@gmail.com", "rvasquez", "RV1234", Perfil.V));
        usuarios.add(new Usuario("0932332834", "Arturo", "Valenzuela", "58", "artval@gmail.com", "artval", "uee2833", Perfil.O));
        usuarios.add(new Usuario("1203864463", "Vanessa", "Hurtado", "36", "vanhurtado@gmail,com", "vanhurtado", "uuu363", Perfil.O));
        usuarios.add(new Usuario("1203746855", "Luisa", "Martínez", "34", "luisamart@gmail.com", "luisamart", "lu2273ss", Perfil.O));

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
        System.out.println("1. Consultar usuarios");
        System.out.println("2. Consultar reservas");
        System.out.println("3. Salir");
        
        
        
        
    }
}
