package Reserva;


public class Vuelo {
    protected String codigo;
    protected String codigoAvion;
    protected String fechaSalida; 
    protected String fechaLlegada;
    protected String codigoItinerario;
    protected double precio;
    protected int precioMillas;
    
    
    public Vuelo(String codigo, String codigoAvion , String fechaSalida, String fechaLlegada, String codigoItinerario, double precio, int precioMillas){
        this.codigo = codigo;
        this.codigoAvion = codigoAvion;
        this.fechaSalida = fechaSalida; 
        this.fechaLlegada = fechaLlegada;
        this.codigoItinerario = codigoItinerario;
        this.precio = precio;
        this.precioMillas = precioMillas;
}
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setCodigoAvion(String codigoAvion){
        this.codigoAvion = codigoAvion;
    }
    
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida = fechaSalida;
    }
            
    public void setFechaLlegada(String fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }  
            
    public void setCodigoItinerario(String codigoItinerario){
        this.codigoItinerario=codigoItinerario;
    }    
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
