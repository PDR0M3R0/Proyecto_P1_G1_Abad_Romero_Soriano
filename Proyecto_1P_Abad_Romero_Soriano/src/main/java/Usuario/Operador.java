package Usuario;


public class Operador extends Usuario {

    private double sueldo;

    public Operador(String cedula, String nombres, String apellidos, String edad, String correo, String usuario, String contraseña, Perfil perfil, double sueldo) {
        super(cedula, nombres, apellidos, edad, correo, usuario, contraseña, perfil);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void consultarReserva() {

    }
}
