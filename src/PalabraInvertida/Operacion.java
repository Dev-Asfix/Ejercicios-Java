package PalabraInvertida;

//Importamos la clase para poder pedir datos
import java.util.Scanner;

public class Operacion {
    
    //Declaramos las variables que usaremos en la clase 
    private String palabra;
    private int length;
    private String palabra_invertida =""; // se Debe inicializar parap poder funcionar
    
    //Se creo un objeto de la clase Scanner
    Scanner in = new Scanner(System.in);
    
    //Método para pedir datos 
    public void PedirDatos(){
        System.out.println(":: INVERTIR PALABRAS ::");
        System.out.println("Palabra : ");
        palabra = in.nextLine();
    }
    
    //En este metodo va la lógica
    public void Operacion(){
       
        length = palabra.length(); // Se cuenta cuantos numero tiene la palabra
        
        // se iguala la variable i con la longitud , recuerda que la ultima siempre termina desde 0, hasta 1, y disminiye de 1 en 1 
        for(int i = length;i>0;i--){
            
            //Inicia desde , hasta 
            palabra_invertida += palabra.substring(i-1,i);
        }
        
        //Esto es con while 
        /*
        while(length != 0){
            palabra_invertida += palabra.substring(length -1 , length);
            length --;
        }
            System.out.println(palabra_invertida);
        */
    }
    
    //Metodo para pedir datos
    public void Imprimir(){
        
        System.out.println("Palabra Invertida: " + palabra_invertida);
        
        //Limpiamos la variable y luego iniciamos de nuevo todo un bucle
        palabra_invertida ="";
        PedirDatos();
        Operacion();
        Imprimir();
    }
}
