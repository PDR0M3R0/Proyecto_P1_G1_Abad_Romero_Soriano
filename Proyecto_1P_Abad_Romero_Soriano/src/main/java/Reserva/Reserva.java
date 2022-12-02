package Reserva;
import Usuario.Cliente;
import Usuario.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    //Atributos:
    
    protected String codigoReserva;
    protected String codigoVueloReserva;
    protected ArrayList<VueloReserva> vuelosElegidos = new ArrayList<>();  
    protected Usuario usuario;
    protected String fechaReserva;
    protected double valorPagar;    
    
    //Constructor: 
    public Reserva(String codigoVueloReserva,Usuario usuario, String fechaReserva, double valorPagar){
        this.codigoReserva = generarCodigoAleatorio();
        this.codigoVueloReserva = codigoVueloReserva;
        this.usuario = usuario;
        this.fechaReserva = fechaReserva;
        this.valorPagar = valorPagar;
    }
    
    
    //Metodos de la clase:
    public Pago Pago(){
        //Aqui  crear un objeto pago
        Pago pg = new Pago(this,valorPagar,Estado.PENDIENTE);
        return pg;
    }

    public String generarCodigoAleatorio(){
        int longitud = 3;
        String cadena = "abcdefgahijkmnolpqrstuvwxyzABCDEFGHIJKMNLOPQRSTUVWXYZ1234567890";
        String codigoAleatorio = "";
        
        for(int i=0;i<longitud;i++){
            int indiceAleatorio = (int)(Math.random()*10);
            char caracterAleatorio = cadena.charAt(indiceAleatorio);
            codigoAleatorio += caracterAleatorio;
        }
        return codigoAleatorio;
    }
    
    public void registrarReservas(){
        String linea = this.toString();
    }
    
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    
    public String getCodigoVueloReserva() {
        return codigoVueloReserva;
    }

    public void setCodigoVueloReserva(String codigoVueloReserva) {
        this.codigoVueloReserva = codigoVueloReserva;
    }

    public ArrayList<VueloReserva> getVuelosElegidos() {
        return vuelosElegidos;
    }

    public void setVuelosReservas(ArrayList<VueloReserva> vuelosReservas) {
        this.vuelosElegidos = vuelosReservas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    @Override
    public String toString(){
     return codigoReserva + "," + vuelosElegidos.get(0).getVuelo().getCodigoVuelo() + "," + usuario.getNombres() + "," + fechaReserva + "," + valorPagar;   
        
    }
}
