/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Johan
 */
public class Usuario {
    protected String cedula;
    protected String nombre;
    protected int edad;
    protected String correo;
    protected String usuario;
    protected String contraseña;
    protected String perfil;
    
    
    public void setCedula(String pCedula){
        this.cedula=pCedula;
    }
    public String getCedula(){
        return this.cedula;
    }
    
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(int pEdad){
        this.edad=pEdad;
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setCorreo(String pCorreo){
        this.correo=pCorreo;
    }
    public String getCorreo(){
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

    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    public void consultarReserva(){
        
    }
    
    
    
}
