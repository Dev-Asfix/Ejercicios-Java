package PalabraInvertida;

/**
 *
 * @author Pablo
 */
public class Main {

    private String palabra;

    public static void main(String args[]) {

        Operacion datos = new Operacion();
        datos.PedirDatos();
        datos.Operacion(); // Este se puede integrar en el metodo Imprimir() , asi lo llamamos desde alla y no en el main
        datos.Imprimir();

    }
}
