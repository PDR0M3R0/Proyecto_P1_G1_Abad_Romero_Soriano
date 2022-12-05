package Reserva;

import SistemaCompraTicketsAereos.ManejoArchivo;

public class VueloReserva{
    //Atributos:
    protected String codigoVueloReserva;       //Codigo nuevo de reserva
    protected Vuelo vuelo ;                    //Sera el codigo de la clase vuelo
    protected TipoVuelo tipoVuelo;
    protected TipoTarifa tipoTarifa;
    
    
    //Constuctor: 
    public VueloReserva(Vuelo vuelo,TipoVuelo tipoVuelo,TipoTarifa tipoTarifa){
        this.codigoVueloReserva = generarCodigoAleatorio();
        this.vuelo = vuelo;
        this.tipoTarifa = tipoTarifa;
        this.tipoVuelo = tipoVuelo;
         
    }
    
    //Metodos de la clase: 
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

    public void registrarVueloReserva(){
        String linea = this.toString();
        ManejoArchivo mja = new ManejoArchivo();
        
        mja.EscribirArchivo("vueloReservas.txt",linea);
    }
    
    
    public String getCodigoVueloReserva() {
        return codigoVueloReserva;
    }

    public void setCodigoVueloReserva(String codigoVueloReserva) {
        this.codigoVueloReserva = codigoVueloReserva;
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
    
    @Override
    public String toString(){
        return codigoVueloReserva + "," + vuelo + "," + tipoVuelo +","+tipoTarifa ;
    }
    
    
    
    
    
    
    
            
}
