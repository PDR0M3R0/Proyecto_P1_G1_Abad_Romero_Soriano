/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reserva;
import Usuario.Cliente;
import java.util.ArrayList;

public class Reserva {
    
String codigoVueloReserva;
Cliente cliente;
ArrayList<VueloReserva> productos = new ArrayList<VueloReserva>();    
String fecha_reserva;
double Valor_a_pagar;    
    
    public Reserva(){
        
    }
}
