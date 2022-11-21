/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import Reserva.*;

public class Cliente extends Usuario {
    public String tarjeta;

    public Cliente(String cedula, String nombres, String apellidos, String edad, String correo, String usuario, String contraseña, Perfil perfil,String tarjeta) {
        super(cedula, nombres, apellidos, edad, correo, usuario, contraseña, perfil);
        this.tarjeta = tarjeta;
    }
    
    
    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
    
    public void pagarReserva(){
        
    }
    public void crearReserva(){
        
    }
    @Override
    public void consultarReserva(){
        
    }
    
}
