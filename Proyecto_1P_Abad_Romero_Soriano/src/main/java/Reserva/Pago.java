package Reserva;
import SistemaCompraTicketsAereos.*;

public class Pago {
    //Atributos:
    protected Reserva reserva;
    protected double totalFinal;
    
    //Constructores:
    public Pago(Reserva reserva, double totalFinal){
        this.reserva = reserva;
        this.totalFinal = totalFinal;
    }

    //Metodos de la clase
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }
    
    
}
