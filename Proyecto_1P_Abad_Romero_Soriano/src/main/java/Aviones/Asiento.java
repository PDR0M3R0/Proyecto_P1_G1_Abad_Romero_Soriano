package Aviones;
import java.util.ArrayList;


public class Asiento extends Avion{
    //Variables de instancia:
    public Disponibilidad disponible; //clase enum
    public int columna; //Del 1 al 4
    public String fila; // donde coloco el alfabeto
    
        
    //Constructor:
    public Asiento(Disponibilidad d,int columna,String fila){
        this.disponible = d; 
        this.columna = columna;
        this.fila = fila;
    }
      
    //metodos getters y setters:

    public void setDisponible(Disponibilidad disponible) {
        this.disponible = disponible;
    }
    
    public void setFila(String f){
        this.fila = f;
    }
    
    public void setColumna(int c){
        this.columna = c;
    }
    
    public Disponibilidad getDiponibilidad(){
        return disponible;
    }
    
    public String getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;
    }
    
    
    
    
}
