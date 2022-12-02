package Reserva;
import java.util.Scanner;
import Usuario.*;


public class Pago {
    //Atributos:
    protected String codigoPago;
    protected Reserva reserva;
    protected double totalPagar;
    protected Estado estado;
    
    //Constructores:
    public Pago(Reserva reserva, double totalPagar, Estado estado){
        this.codigoPago = generarCodigoAleatorio();
        this.reserva = reserva;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }
    
    

    //Metodos de la clase
    public void pagoTarjeta(){
        
            
            
    }

    public void pagoMillas(){
        
        
        
        
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
    
    
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(String codigoPago) {
        this.codigoPago = codigoPago;
    }
    
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalFinal(double totalPagar) {
        this.totalPagar = totalPagar;
    }
        
}
