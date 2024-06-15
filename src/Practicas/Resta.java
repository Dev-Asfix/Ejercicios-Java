/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

/**
 *
 * @author Pablo
 */
public class Resta extends Operaciones{
    
    @Override
    public void Operar(){
        System.out.print("Resta : ");
        NumeroResta = in.nextInt();
        
        
        Resultado = Numero - NumeroResta ;
        Numero = Resultado;
        System.out.println("El resultado es : " +  Resultado);
    }
    
}
