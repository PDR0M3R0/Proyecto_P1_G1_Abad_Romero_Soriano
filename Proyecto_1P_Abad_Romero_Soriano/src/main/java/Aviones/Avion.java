package Aviones;
import java.util.ArrayList;
import java.util.Scanner;


public class Avion {
    //Variables de instancia:-------------------------------------------------
    public String codigoAvion;
    public int capacidad;
    public ArrayList<Asiento> asientos; //Una avion tiene 10 asientos
    
    //Constructor:------------------------------------------------------------- 
    public Avion(String codigoAvion,int capacidad){
        this.codigoAvion= codigoAvion;
        this.capacidad = capacidad;  
        this.asientos = new ArrayList<>();
    }
    
    //Metodos de clase:--------------------------------------------------------
    /**
     * Este meotod tiene la capacidad de poder agregar asientos dentro de la lista que tiene de atributo un avion
     */
    public void agrearAsiento(){
        Scanner sc = new Scanner(System.in);
        String continuar = "null";
        
        do{
        System.out.println("Desea obterner un asiento?: ");
        String continua = sc.next();
        continuar = continua; //validacion para el proceso de agregarAsiento
         
        System.out.println("Excelente, por favor siga los siguientes pasos: ");
        System.out.println("Ingrese el numero de su asiento (1 - 98): ");
        String codigoAsiento = sc.next();
        Asiento asientoAvion = new Asiento(codigoAsiento);
        
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
    
    /**
     * Este metodo permite visualizar al que asientos esa yaocupados
     */
    public void consultarAsientosOcupados(){
        System.out.println("Los siguientes asientos se encuentran ocupados: ");
        for(Asiento p: asientos){
            System.out.println(p);
        } 
    }
    
    /**
     * Este metodo permite generar un aciento sin que ya se encuente en un avion 
     * @return un objetod de la clase asiento
     */
    public Asiento generarAsiento(){
        double ale = (int)(Math.random()*100); //poner resecto capacidad
        int asientoAle = (int)ale;
        
        
        if(ale == 100){
            asientoAle -= 2;
            String codigoAsiento = String.valueOf(asientoAle);
            Asiento a = new Asiento(this.codigoAvion,codigoAsiento,Disponibilidad.NO);
            return a;
        }else{
            String codigoAsiento = String.valueOf(asientoAle);
            Asiento a = new Asiento(this.codigoAvion,codigoAsiento,Disponibilidad.NO);
            return a;
        }
    }
    
    @Override
    public String toString(){
        return codigoAvion + ", " + capacidad;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }
    
    
    
   
    
    
    
    
    
    
    
    
    
}
