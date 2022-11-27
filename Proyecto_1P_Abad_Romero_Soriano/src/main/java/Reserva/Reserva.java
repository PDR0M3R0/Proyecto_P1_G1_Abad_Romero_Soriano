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
        String[] lugares = {"QUITO", "GUAYAQUIL", "LIMA", "BUENOS AIRES", "SANTIAGO", "BOGOTÁ", "BRASILIA", "ASUNCIÓN", "MONTEVIDEO"};
        
        System.out.println("---ORIGEN---");
        
        System.out.println("1.Quito\n2.Guayaquil\n3.Lima\n4.Santiago\n5.Bogotá\n6.Brasilia\n7.Asunción\n8.Montevideo");
        System.out.print("Elija el punto de partida: ");
        int origen = sc.nextInt();
        sc.nextLine();
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
