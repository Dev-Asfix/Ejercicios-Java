package Suma_POO;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Fibonacci {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cuantos numeros quieres que sea la sucesion: ");
        int numero = in.nextInt();
        
        Operacion mensajero = new Operacion(numero);
        mensajero.setNumero(15);
        mensajero.OperacionF();
    }
}

//a
//b
//c