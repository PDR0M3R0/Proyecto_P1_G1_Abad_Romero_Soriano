package Reserva;
import Usuario.Cliente;
import Usuario.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    //Atributos:
    protected String codigoVueloReserva;
    protected ArrayList<VueloReserva> vuelosReservas = new ArrayList<>();  
    protected Usuario usuario;
    protected String fechaReserva;
    protected double valorPagar;    
    
    //Constructor: 
    public Reserva(String codigoVueloReserva,Usuario usuario, String fechaReserva, double valorPagar){
        this.codigoVueloReserva = codigoVueloReserva;
        this.usuario = usuario;
        this.fechaReserva = fechaReserva;
        this.valorPagar = valorPagar;
    }
    
    
    //Metodos de la clase:
    public void AsignacionAsientos(){
        
    }
    
    public void DatosPasajero(){
        
    }
    
    public void Pago(){
        
    }
    
    public String getCodigoVueloReserva() {
        return codigoVueloReserva;
    }

    public void setCodigoVueloReserva(String codigoVueloReserva) {
        this.codigoVueloReserva = codigoVueloReserva;
    }

    public ArrayList<VueloReserva> getVueloReservas() {
        return vuelosReservas;
    }

    public void setVuelosReservas(ArrayList<VueloReserva> vuelosReservas) {
        this.vuelosReservas = vuelosReservas;
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
    
}
