package Usuario;

public class VIP extends Cliente {

    public TipoVIP tipoVIP;
    public int millas = 1000;

    public VIP(String cedula, String nombres, String apellidos, String edad, String correo, String usuario, String contraseña, Perfil perfil, String tarjeta, TipoVIP tipoVIP, int millas) {
        super(cedula, nombres, apellidos, edad, correo, usuario, contraseña, perfil, tarjeta);
        this.tipoVIP = tipoVIP;
        this.millas = millas;
    }

    public TipoVIP getTipoVIP() {
        return tipoVIP;
    }

    public void setTipoVIP(TipoVIP tipoVIP) {
        this.tipoVIP = tipoVIP;
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public void adquirirDescuento() {

    }

    public void pagarReserva(String tarjeta) {

    }

    public void pagarReserva(int millas) {

    }
}
