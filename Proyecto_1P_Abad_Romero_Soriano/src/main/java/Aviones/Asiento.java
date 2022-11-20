package Aviones;
import java.util.ArrayList;
import Aviones.Disponibilidad;

//La clase Asinet es una clase de composicion o asignacion 

public class Asiento{
    //Variables de Instancia:------------------------- 
    public String codigoAvion;
    public Disponibilidad disponible; //clase enum
    public int numeroAsiento;

    //Constructor:------------------------------------
    
    public Asiento(String codigoAvion,int numeroAsiento, Disponibilidad disponible){
        this.codigoAvion = codigoAvion;
        this.disponible = disponible;   
        this.numeroAsiento = numeroAsiento;
    }
    
    public Asiento(int numeroAsiento){
        this.codigoAvion = "cualquiera";
        this.disponible = Disponibilidad.SI;
        this.numeroAsiento=numeroAsiento;
    }
      
    //metodos getters y setters:----------------------
    
    public void setDisponible(Disponibilidad disponible) {
        this.disponible = disponible;
    }
    
    public void setNumeroAsiento(int na){
        this.numeroAsiento = na;
    }
    
    public void setCodigoAvion(String ca){
        this.codigoAvion = ca;
    }
    
    public Disponibilidad getDisponibilidad(){
        return disponible;
    }
    
    public int getNumeroAsiento(){
        return numeroAsiento;
    }
  
    public String getCodigoAvion(){
        return codigoAvion;
    }
    
}
