package CajeroAutomatico_Setter_Getter;

//* Importamos la clase Scanner para pedir datos de consola
import java.util.Scanner;
/**
 *
 * @author Pablo
 */


public class Cliente {
    
    //Declaramos variables encapsuladas 
    private String Name;
    private int Balance = 0;
    private int Money_Deposited = 0, Money_Withdrawn = 0, Option;
    
    Scanner in = new Scanner(System.in);
    
    // This method shows the welcome
    public void Welcome(){
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("|| WELCOME "+ Name +", TO accounts GSI ||");
        System.out.println("______________________________");
        System.out.println("");
        System.out.println("""
                           You wish:
                           Deposit  : Option 1.
                           Withdraw : Option 2.
                           Show     : Option 3.
                           Exit     : Option 4.""");
        System.out.println("");
        Option = in.nextInt();
                
    }
    
    // This method asks for data from the person
    public void Account(){
        System.out.println("FILL IN THE DETAILS BELOW :");
        System.out.println("");
        System.out.println("Name : ");
        Name = in.nextLine();
        System.out.println("");
    }
 
    // This method asks for an amount of money to be deposited into the account
    public void Deposit(){
        System.out.println("How much do you want to deposit?");
        System.out.print("Deposit : ");
        Money_Deposited = in.nextInt();
        System.out.println("_________________________________");
    }
    
    // This method asks for an amount of money to be withdrawn into the account
    public void Withtdraw(){
        System.out.println("How much do you want to Withdraw?");
        System.out.print("Withdraw : ");
        Money_Withdrawn = in.nextInt();
        System.out.println("");
    }
    
    // This method displays the name and data of the user
        public void Show() {
        System.out.println("Hello " + Name + ", Welcome to your account : ");
        System.out.println("_");
        System.out.print("Balance : " + Balance);
            System.out.println("");
    }
    
        

    // Here are the Setters and getters methods
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    
    
    public int getWithdraw(){
        return Money_Withdrawn;
    }
    public void setWindraw(int Money_Withdrawn){
        this.Money_Withdrawn = Money_Withdrawn;
        
    }
    
    
    public int getDeposited(){
        return Money_Deposited;
    }
    public void setDeposited(int Money_Deposited){
        this.Money_Deposited = Money_Deposited;
        
    }
    
    public int getBalance(){
        return Balance;
    }
    public void setBalance(int Balance){
        this.Balance = Balance;
    }
    
    public int getOption(){
        return Option;
    }
    public void setOption(int Option){
        this.Option = Option;
    }
    
    
}
