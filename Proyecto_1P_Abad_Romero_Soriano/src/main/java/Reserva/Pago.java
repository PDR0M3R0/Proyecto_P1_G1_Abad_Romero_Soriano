package Reserva;
import java.util.Scanner;
import Usuario.Cliente;
import SistemaCompraTicketsAereos.SistemaCompraTicketsAereos;

public class Pago {
    //Atributos:
    protected Reserva reserva;
    protected double totalFinal;
    
    
    
    
    //Constructores:
    public Pago(Reserva reserva, double totalFinal){
        this.reserva = reserva;
        this.totalFinal = totalFinal;
    }

    //Metodos de la clase
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }
    
    public void metodoPago(){
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        if(opcion == 1){
            //Cliente clientePagar = (Cliente)usuarioa;
            //String numTarjeta = clientePagar.getTarjeta();
            //System.out.println(numTarjeta);
            System.out.println(SistemaCompraTicketsAereos.vueloa);
            System.out.println(); //se imprime el usuario
            
        }else if (opcion == 2){
            Cliente clientePagar = (Cliente)usuarioa.get(0);
            String numTarjeta = clientePagar.getTarjeta();
            System.out.println(numTarjeta);
            System.out.println("\nSeguro de pagar el vuelo(s/n):");
            String confirmacion = sc.next();
            
            if(confirmacion.equals("s")){
                System.out.println(vueloa);
                System.out.println(usuarioa);
                System.out.println("Has comprado tu vuelo. Tu codigo de reserva es: ");
            
            }
        }
    }
    
    public void consultarPago(){
        
    }
    
}
