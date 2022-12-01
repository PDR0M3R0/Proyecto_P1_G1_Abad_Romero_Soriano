package Reserva;

public class VueloReserva{
    //Atributos:
    protected Reserva reserva;    //Codigo nuevo de reserva
    protected Vuelo vueloIda;   //Sera el codigo de la clase vuelo
    protected Vuelo vueloRetorno;  //vuelo de retorno
    protected TipoVuelo tipoVuelo;
    protected TipoTarifa tipoTarifa;
    
    
    //Constuctor: 
    public VueloReserva(Reserva reserva,Vuelo vueloIda,Vuelo vueloRetorno,TipoVuelo tipoVuelo,TipoTarifa tipoTarifa){
        this.reserva = reserva;
        this.vueloIda = vueloIda;
        this.vueloRetorno  = vueloRetorno;
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

    public Vuelo getVueloIda() {
        return vueloIda;
    }

    public void setVueloIda(Vuelo vuelo) {
        this.vueloIda = vuelo;
    }

    public void setVueloRetorno(Vuelo vuelo){
        this.vueloRetorno =vuelo;
    }
    public Vuelo getVueloRetorno(){
        return vueloRetorno;
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
