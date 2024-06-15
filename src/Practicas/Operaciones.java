
package Practicas;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Operaciones {
    
    Scanner in = new Scanner(System.in);
    protected  int Resultado,Numero , NumeroSuma , NumeroResta , Opcion;
    
    
    public void Operar(){
        
        
    }
    
    
    public void Elegir(){
        System.out.println(""
                + "\nOpcion 1 = Suma ."
                + "\nOpcion 2 = Resta ."
                + "\nOpcion 3 = Mostrar Numero Actual"
                + "\nOpcion 4 = Salir" );
        System.out.print("Elije una Opcion:");
        Opcion = in.nextInt();
    }
    
    public int getOpcion(){
        return Opcion;
    }
    public void setopcion(int Opcion){
        this.Opcion = Opcion;
    }
    
    public int getNumero(){
        return Numero;
    }
    public void setNumero(int Numero){
        this.Numero = Numero;
    }

    
}
