package Reserva;
import Usuario.Cliente;
import Usuario.Usuario;
import java.util.ArrayList;
import java.util.Scanner;
import SistemaCompraTicketsAereos.ManejoArchivo;

public class Reserva {
    //Atributos:
    
    protected String codigoReserva;
    protected VueloReserva vueloReserva;  
    protected Usuario usuario;
    protected String fechaReserva;
    protected double valorPagar;    
    
    //Constructor: 
    public Reserva(VueloReserva vueloReserva,Usuario usuario, String fechaReserva, double valorPagar){
        this.codigoReserva = generarCodigoAleatorio();
        this.vueloReserva = vueloReserva;
        this.usuario = usuario;
        this.fechaReserva = fechaReserva;
        this.valorPagar = valorPagar;
    }
    
    
    //Metodos de la clase:
    
    /**
     * public void registrarPago(): registra el pago y lo escribe en un archivo txt
     * @return regresa un objeto de la clase Pago el cual le pertenece respectivamente a la reserva que ha sido registrada y comprada por el usuario independeientme t
     * de la forma de pago elegida
     */
    public Pago Pago(){
        //Aqui  crear un objeto pago
        Pago pg = new Pago(this,valorPagar,Estado.PENDIENTE);
        return pg;
    }

    /**
     * Este es un metodo que genera un codigo de string aleatorio y permite inicializar la variable de codigo Reserva
     * @return un string 
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
     * Este metodo permite registrar las reservvas tal como se muetra en el metodo to string en el archivo de texto que se encuentr en el proyecto
     */
    public void registrarReservas(){
        String linea = this.toString();
        ManejoArchivo mja = new ManejoArchivo();
        
        mja.EscribirArchivo("reservas.txt",linea);
    }
    
    
    
    
    
    
    
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public VueloReserva getVueloReserva() {
        return vueloReserva;
    }

    public void setVueloReserva(VueloReserva vueloReserva) {
        this.vueloReserva = vueloReserva;
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
     return codigoReserva + "," + vueloReserva + "," + usuario.getNombres() + "," + fechaReserva + "," + valorPagar;   
        
    }
}
