package Aviones;
import java.util.ArrayList;
import java.util.Scanner;


public class Avion {
    //Variables de instancia:-------------------------------------------------
    public String codigoAvion;
    public int capacidad;
    public static ArrayList<Asiento> asientos; //Una avion tiene 10 asientos
    
    //Constructor:------------------------------------------------------------- 
    public Avion(String codigoAvion,int capacidad,ArrayList<Asiento> asientos){
        this.codigoAvion= codigoAvion;
        this.capacidad = capacidad;
        this.asientos = asientos;
    }
    
    public Avion(String codigoAvion,int capacidad){
        this.codigoAvion = codigoAvion;
        this.capacidad = capacidad;
        this.asientos = new ArrayList<Asiento>(); //lista vacia de tipo Asiento
    }
    
    //Metodos de clase:--------------------------------------------------------
    public void agrearAsiento(){
        Scanner sc = new Scanner(System.in);
        String continuar = "null";
        
        do{
        System.out.println("Desea obterner un asiento?: ");
        String continua = sc.next();
        continuar = continua; //validacion para el proceso de agregarAsiento
         
        System.out.println("Excelente, por favor siga los siguientes pasos: ");
        System.out.println("Ingrese el numero de su asiento (1 - 98): ");
        int numero = sc.nextInt();
        Asiento asientoAvion = new Asiento(numero);
        
        for(Asiento a: asientos){
            if (asientoAvion.getDisponibilidad() == Disponibilidad.SI){
                asientoAvion.setDisponible(Disponibilidad.NO);
                asientos.add(asientoAvion);
            }else{
                System.out.println("El asiento seleccionado se encuentra ocupado, ingrese otr por favor");
            }
        }
        
    }while(continuar == "si");
        System.out.println("Adios, tenga un buen día!");
    }
    
    public void consultarAsientosOcupados(){
        System.out.println("Los siguientes asientos se encuentran ocupados: ");
        for(Asiento p: asientos){
            System.out.println(p);
        } 
    }
    
    public int generarAsiento(){
        double ale = (int)(Math.random()*100);
        int asientoAle = (int)ale;
        if(ale == 100){
            asientoAle -= 2;
            return asientoAle;
        }else{
            return asientoAle;
        }
    }
    
    @Override
    public String toString(){
        return codigoAvion + ", " + capacidad;
    }
    
    public void setCodigoAvion(String cod){
        this.codigoAvion = cod;
    }
    
    public void setCapacidad(int i){
        this.capacidad = i;
    }

    public String getCodigoAvion(){
        return codigoAvion;
    }
    
    public int getCapacaidad(){
        return capacidad;
    }
    
    
    
    
    
    
    
}
