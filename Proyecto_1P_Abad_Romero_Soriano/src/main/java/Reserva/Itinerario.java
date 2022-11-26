package Reserva;


public class Itinerario {
    //Atributos:
  protected String codigoItinerario;
  protected String origen; //ciudad
  protected String destino; //ciudad
  protected String horaSalida; //Planeo que sea float o double wrapper??
  protected String horaLlegada;//De la misma manera double o float
  protected String duracion;//para que duracion se pueda hacer como la diferencia
    
  //Constructores:
  public Itinerario(String codigoItinerario, String origen, String destino, String horaSalida, String horaLlegada,String duracion){
    this.codigoItinerario=codigoItinerario;
    this.origen = origen;
    this.destino = destino;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.duracion = duracion;
  }
    
  //Metodos de la clase:
  public String getCodigoItinerario(){
      return codigoItinerario;
  }
  
  public String getOrigen(){
      return origen;
  }
  
  public String getDestino(){
      return destino;
  }
  
  public String getHoraSalida(){
      return horaSalida;
  }
  
  public String getHoraLlegada(){
      return horaLlegada;
  }
  
  public String getDuracion(){
      return duracion;
  }
  
  public void setCodigoItinerario(String cd){
      this.codigoItinerario = cd;
  }
  
  public void setOrigen(String o){
      this.origen = o;
  }
  
  public void setDestino(String d){
      this.destino = d;
  }
  
  public void setHoraSalida(String hs){
      this.horaSalida = hs;
  }
  
  public void setHoraLlegada(String hl){
      this.horaLlegada = hl;
  }
  
  public void setDuracion(String dr){
      this.duracion = dr;
  }
  
  
  
  
  
  
  
}
