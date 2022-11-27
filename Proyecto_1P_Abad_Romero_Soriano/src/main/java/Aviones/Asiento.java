package Aviones;
import java.util.ArrayList;
import Aviones.Disponibilidad;

//La clase Asinet es una clase de composicion o asignacion 

public class Asiento{
    //Variables de Instancia:------------------------- 
    public String codigoAvion;
    public Disponibilidad disponible; //clase enum
    public String codigoAsiento;

    //Constructor:------------------------------------
    
    public Asiento(String codigoAvion,String codAsiento, Disponibilidad disponible){
        this.codigoAvion = codigoAvion;
        this.disponible = disponible;   
        this.codigoAsiento = codAsiento;
    }
    
    public Asiento(String codigoAsiento){
        this.codigoAvion = "cualquiera";
        this.disponible = Disponibilidad.SI;
        this.codigoAsiento=codigoAsiento;
    }
      
    //metodos getters y setters:----------------------
    
    public void setDisponible(Disponibilidad disponible) {
        this.disponible = disponible;
    }
        
    public void setCodigoAvion(String ca){
        this.codigoAvion = ca;
    }
    
    public Disponibilidad getDisponibilidad(){
        return disponible;
    }
  
    public String getCodigoAvion(){
        return codigoAvion;
    }

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }
    
    
    
}
