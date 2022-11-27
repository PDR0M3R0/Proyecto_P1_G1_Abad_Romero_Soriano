package Reserva;
import Aviones.Avion;

public class Vuelo {
    //Atributos:
    protected String codigoVuelo;
    protected String codAvion; //de aqui se asocia el codigo del avion
    protected String fechaSalida; 
    protected String fechaLlegada;
    protected String codItine; //dea qui se asocia el codigo Itinerario
    protected double precio;
    protected double precioMillas;
    
    //Constructor: 
    public Vuelo(String codigo, String codAvion , String fechaSalida, String fechaLlegada, String itinerario, double precio, double precioMillas){
        this.codigoVuelo = codigo;
        this.codAvion = codAvion;
        this.fechaSalida = fechaSalida; 
        this.fechaLlegada = fechaLlegada;
        this.codItine = itinerario;
        this.precio = precio;
        this.precioMillas = precioMillas;
    }
    
    
    //Metodos de la clase: 
    public void setCodigoVuelo(String codigo) {
        this.codigoVuelo = codigo;
    }
    
    public void setCodigoAvion(String codAvion){
        this.codAvion = codAvion;
    }
    
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida = fechaSalida;
    }
            
    public void setFechaLlegada(String fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }  
            
    public void setItinerario(String codItine){
        this.codItine=codItine;
    }    
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setPrecioMillas(double precioMillas){
        this.precioMillas = precioMillas;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public String getCodItine() {
        return codItine;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioMillas() {
        return precioMillas;
    }
    
    
}
