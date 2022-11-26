package Reserva;

public class VueloReserva{
    //Atributos:
    protected Reserva reserva;    //Codigo nuevo de reserva
    protected Vuelo vuelo;   //Sera el codigo de la clase vuelo
    protected TipoVuelo tipoVuelo;
    protected TipoTarifa tipoTarifa;
    
    
    //Constuctor: 
    public VueloReserva(Reserva reserva,Vuelo vuelo,TipoVuelo tipoVuelo,TipoTarifa tipoTarifa){
        this.reserva = reserva;
        this.vuelo = vuelo;
        this.tipoTarifa = tipoTarifa;
        this.tipoVuelo = tipoVuelo;
         
    }
    
    //Metodos de la clase: 

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }
    
    
    
    
    
    
    
    
            
}
