/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Johan
 */
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
