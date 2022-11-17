/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reserva;
import Aviones.Avion;

/**
 *
 * @author axsl3
 */
public class Vuelo {
    public String codigo;
    public Avion avion;
    public String fecha_salida; 
    public String fecha_llegada;
    public Itinerarios itinerario;
    public double precio;
    public int precioMillas;
    
    
    public Vuelo(String codigo, Avion avion , String fecha_salida, String fecha_llegada, Itinerarios itinerario, double precio, int precioMillas){
    this.codigo = codigo;
    this.avion = avion;
    this.fecha_salida = fecha_salida; 
    this.fecha_llegada = fecha_llegada;
    this.itinerario = itinerario;
    this.precio = precio;
    this.precioMillas = precioMillas;
}
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
