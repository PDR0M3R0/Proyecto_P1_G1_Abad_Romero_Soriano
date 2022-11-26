package Reserva;
import Usuario.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    //Atributos:
    protected String codigoVueloReserva;
    protected ArrayList<VueloReserva> vuelosReservas = new ArrayList<>();  
    protected Cliente cliente;
    protected String fechaReserva;
    protected double valorPagar;    
    
    //Constructor: 
    public Reserva(String codigoVueloReserva,Cliente cliente, String fechaReserva, double valorPagar){
        this.codigoVueloReserva = codigoVueloReserva;
        this.cliente = cliente;
        this.fechaReserva = fechaReserva;
        this.valorPagar = valorPagar;
    }
    
    
    //Metodos de la clase:
    public void EleccionVuelos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Debe mostrarse una lista de todos los  itinerarios");
        
        System.out.println("Elija el origen: ");
        String origenCliente = sc.next();
        
        System.out.println("Elija su destino: ");
        String destinoCliente = sc.next();
        
        System.out.println("ingrese la fecha de Salida: ");
        String fechaSalida = sc.next();
        
        System.out.println("Ingrese la fecha de Llegada: ");
        String fechaLlegada = sc.next();
        
        //Hay que acceder por un for a la lista de cuelo para comparar y elegirlo 
        //de lo contrario no existe y se le pide de nuevo
        //hya que sobrecargar los constructor de itinerario, vuelo
    }
    
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
