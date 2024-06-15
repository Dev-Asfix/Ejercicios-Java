package Polimorfismo_1;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public abstract class Operaciones_ClasePadre {
    
    protected int valor1 , valor2 , resultado;
    Scanner entrada = new Scanner(System.in);
    
    public void PedirDatos(){
        
        System.out.print("Dame el Primer Valor : ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el Segundo Valor : ");
        valor2 = entrada.nextInt();
        
    }
    
    public abstract void Operaciones();
    
    public void MostrarResultado(){
        
        System.out.print(resultado);
    }
    
}
