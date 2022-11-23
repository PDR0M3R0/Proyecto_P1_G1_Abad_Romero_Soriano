package Reserva;
import Aviones.Avion;

public class Vuelo {
    //Atributos:
    protected String codigo;
    protected Avion avion; //de aqui se asocia el codigo del avion
    protected String fechaSalida; 
    protected String fechaLlegada;
    protected Itinerario itinerario; //dea qui se asocia el codigo Itinerario
    protected double precio;
    protected double precioMillas;
    
    //Constructor: 
    public Vuelo(String codigo, Avion avion , String fechaSalida, String fechaLlegada, Itinerario itinerario, double precio, int precioMillas){
        this.codigo = codigo;
        this.avion = avion;
        this.fechaSalida = fechaSalida; 
        this.fechaLlegada = fechaLlegada;
        this.itinerario = itinerario;
        this.precio = precio;
        this.precioMillas = precioMillas;
    }
    
    
    //Metodos de la clase: 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setCodigoAvion(Avion avion){
        this.avion = avion;
    }
    
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida = fechaSalida;
    }
            
    public void setFechaLlegada(String fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }  
            
    public void setItinerario(Itinerario itinerario){
        this.itinerario=itinerario;
    }    
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setPrecioMillas(double precioMillas){
        this.precioMillas = precioMillas;
    }

    public String getCodigo() {
        return codigo;
    }

    public Avion getAvion() {
        return avion;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioMillas() {
        return precioMillas;
    }
    
    
}
