package Aviones;
import java.util.ArrayList;
import Aviones.Disponibilidad;

//La clase Asinet es una clase de composicion o asignacion 

public class Asiento{
    //Variables de Instancia:------------------------- 
    
    public Disponibilidad disponible; //clase enum
    public int numeroAsiento;

    //Constructor:------------------------------------
    
    public Asiento(Disponibilidad disponible,int numeroAsiento){
        this.disponible = disponible;   
        this.numeroAsiento = numeroAsiento;
    }
    
    public Asiento(int numeroAsiento){
        this.disponible = Disponibilidad.LIBRE;
        this.numeroAsiento=numeroAsiento;
    }
      
    //metodos getters y setters:----------------------
    
    public void setDisponible(Disponibilidad disponible) {
        this.disponible = disponible;
    }
    
    public void setNumeroAsiento(int na){
        this.numeroAsiento = na;
    }
    
    public Disponibilidad getDisponibilidad(){
        return disponible;
    }
    
    public int getNumeroAsiento(){
        return numeroAsiento;
    }
  
}
