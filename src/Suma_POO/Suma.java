package Suma_POO;

/**
 *
 * @author Pablo
 */
public class Suma {
    
    private int V1 , V2, Resultado;
        
    public Suma(int Valor1, int Valor2){
        this.V1 = Valor1 ;
        this.V2 = Valor2;
    }
    
    public void Operacion(){
        Resultado = V1 + V2;
    }
    public void Imprimir(){
        System.out.println("El Resultado de la Suma : " + Resultado);
    }
}
