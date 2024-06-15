package Practicas;

/**
 *
 * @author Pablo
 */
public class Condicional {

    Operaciones mensajero = new Operaciones();
    Suma sumar = new Suma();
    Resta restar = new Resta();

    public void Opera() {

        do {
            mensajero.Elegir();

            switch (mensajero.getOpcion()) {
                case 1:
                    sumar.Operar();
                    break;
                case 2:
                    restar.Operar();
                    break;
                case 3:
                    System.out.println("El Numero actual es : " + mensajero.getNumero());
                    break;
                case 4:
                    System.out.println("Saliendo del Programa:");
                    break;
                default:
                    System.out.println("Opcion NO valida , Elije una Opcion Valida");

            }
        } while (mensajero.getOpcion() != 4);

    }

}
