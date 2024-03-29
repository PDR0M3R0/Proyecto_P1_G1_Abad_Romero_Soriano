package Reserva;
import java.util.Scanner;
import Usuario.*;
import SistemaCompraTicketsAereos.ManejoArchivo;


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
    
    /**
     * Genera un codigo random para poder iniciarlizar el codigo Pago
     * @return String para poder inicializar en codigo Pago
     */
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
    
    /**
     * Este metodo permite registrar el objeto pago con una estrcuto toString en el
     */
    public void registrarPago(){
        ManejoArchivo mja = new ManejoArchivo();
        String linea = this.toString();
        mja.EscribirArchivo("pagos.txt",linea);  
    }
    
    @Override
    public String toString(){
        return  codigoPago + "," + reserva.codigoReserva + "," + totalPagar ;
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
