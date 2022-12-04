package Usuario;
import Reserva.*;

public class Cliente extends Usuario {
    //Atributos
    public String tarjeta;
    //Constructor
    public Cliente(String cedula, String nombres, String apellidos, String edad, String correo, String usuario, String contraseña, Perfil perfil,String tarjeta) {
        super(cedula, nombres, apellidos, edad, correo, usuario, contraseña, perfil);
        this.tarjeta = tarjeta;
    }
    
    //Metodos de la clase
    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}
