package Aviones;
import java.util.ArrayList;


public class Asiento extends Avion{
    public Disponibilidad disponible;
    public ArrayList<String> alfabeto;
    
    public Asiento(Disponibilidad d){
        this.disponible = d; 
    }
    
    
    
    
    //Metodos de clase
    public void generarAlfabeto(){
        for(char c = 'a';c<'z';c++){
            String letra = String.valueOf(c); //se vuelve string el char para poder anadirlo en alfabeto
            alfabeto.add(letra);
        }
    }
    
    public void generarAsiento(){ 
        generarAlfabeto();
        
    } 
    
    
    
}
