package Reserva;
import Usuario.Cliente;
import java.util.ArrayList;

public class Reserva {
    
    protected String codigoVueloReserva;
    protected Cliente cliente;
    protected ArrayList<VueloReserva> productos = new ArrayList<VueloReserva>();    
    protected String fechaReserva;
    protected double valorPagar;    
    
    public Reserva(String codigoVueloReserva,Cliente cliente, String fechaReserva, double valorPagar){
        
    }
}
