/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

/**
 *
 * @author Pablo
 */
public class Suma extends Operaciones{
    
    @Override
    public void Operar(){
        System.out.print("Suma : ");
        NumeroSuma = in.nextInt();
        
        
        Resultado = Numero + NumeroSuma ;
        Numero = Resultado;
        System.out.println("El resultado es : " +  Resultado);
    }
    
}
