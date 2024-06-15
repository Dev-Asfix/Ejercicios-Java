package Suma_POO;

/**
 *
 * @author Pablo
 */
public class Operacion {
    
    private int numero;
    
    
    public Operacion(int numero){
        this.numero = numero;
    }
    
    public void OperacionF(){
        int a = 0;
        int b= 1;
        int c = 0;
        for(int i = 0;i <= numero ; i++){
            
                System.out.print(b+ " ");
                c = a + b;
                
                a = b ;
                b = c;
                        
                
                   
                
        }
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    
    
}


