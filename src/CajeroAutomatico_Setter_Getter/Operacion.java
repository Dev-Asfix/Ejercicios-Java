package CajeroAutomatico_Setter_Getter;

/**
 *
 * @author Pablo
 */
public class Operacion {

    // Here the object is created with the Client class
    Cliente cliente1 = new Cliente();



    // In this method lies the programming logic
    public void Operation() {

        //These variables are for restricting  loops
        int c1 = 0, c2 = 0;

        //Loops
        do {
            cliente1.Account();
            c1 = 0;
            if (cliente1.getName() != "") {
                do {
                    cliente1.Welcome();

                    if (cliente1.getOption() == 1) {
                        cliente1.Deposit();
                        cliente1.setBalance(cliente1.getBalance() + cliente1.getDeposited());
                        c2 =0;
                    } else if (cliente1.getOption() == 2) {
                        cliente1.Withtdraw();
                        cliente1.setBalance(cliente1.getBalance() - cliente1.getWithdraw());
                        c2 = 0;
                    }else if(cliente1.getOption() == 3){
                        cliente1.Show();
                        c2 = 0;
                        
                    }else if(cliente1.getOption() == 4){
                        c2 = 1;
                        
                    } else {
                        System.out.println("Please enter a valid option");
                    }

                } while (c2 == 0);
                c1 = 1;

            }
            
        } while (c1 == 0);
        System.out.println("Thanks");

    }

}
