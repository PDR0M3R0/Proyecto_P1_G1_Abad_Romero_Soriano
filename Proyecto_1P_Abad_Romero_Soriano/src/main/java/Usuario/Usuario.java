/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.util.Objects;

/**
 *
 * @author Johan
 */
public class Usuario {

    protected String cedula;
    protected String nombres;
    protected String apellidos;
    protected String edad;
    protected String correo;
    protected String usuario;
    protected String contraseña;
    protected Perfil perfil;

    public Usuario(String cedula, String nombres, String apellidos, String edad, String correo, String usuario, String contraseña, Perfil perfil) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.perfil = perfil;

    }

    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(String Edad) {
        this.edad = Edad;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return this.correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void consultarReserva() {

    }

}
