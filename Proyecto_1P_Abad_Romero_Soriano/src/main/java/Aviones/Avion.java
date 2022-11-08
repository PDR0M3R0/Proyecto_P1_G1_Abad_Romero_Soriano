package Aviones;
import java.util.ArrayList;

public class Avion {
    public String codigoAvion;
    public int capacidad;
    public static ArrayList<Asiento> asientos; //Una avion tiene 10 asientos
    
    
    
    
    
    
    
    
    
    //Metodos de clase
    public void generarAsientos(){
        //Se recorre un arreglo de char donde se convertira con valueOf a String a cada uno.
        for(char c = 'a';c<'z';c++){
            String letra = String.valueOf(c); //se vuelve string el char para poder anadirlo en alfabeto
            
            //se adquiere un numero del 1 al 5 con su respectiva letra
            for(int ii = 0;ii<5;ii++){
                
            }
        }
        
        
    }
}
