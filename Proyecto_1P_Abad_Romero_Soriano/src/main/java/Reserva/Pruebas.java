package Reserva;
import Usuario.*;


public class Pruebas {
    public static void main(String[] args){
        Usuario u = new Usuario("cedula","nombres","apellidos","edad","corre","usuario","contrasena",Perfil.S);
        Usuario u2 = new Usuario("cedula","nombres","apellidos","edad","corre","usuario","contrasena",Perfil.S);
        Vuelo v = new Vuelo("codigoVuelo","codigoAvion","fechaIDA","fechaREGRESO","codigoItinerario",25.0,2500);
        VueloReserva vr = new VueloReserva(v,TipoVuelo.IDA,TipoTarifa.E);
        Reserva rs = new Reserva(vr,u,"fechareserva",25.0);
        Pago pg = rs.Pago();
//        
//        
//        
//        System.out.println(vr.getCodigoVueloReserva());
//        System.out.println(rs.getCodigoReserva());
//        System.out.println(pg.getCodigoPago());    
          
        System.out.println(u);
        System.out.println(u2);
        
        
       
            if(u.equals(u2)){
                System.out.println("Si son iguales");
            }else{
                System.out.println("no son iguales");
            }
        
    
}
}