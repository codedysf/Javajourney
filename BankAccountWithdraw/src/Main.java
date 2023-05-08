import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //to display the initial balance
        Account account1 = new Account("Babatunde", 50.00);
        Account account2 = new Account("yusuf", -40.00);

        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());
        System.out.println();

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your withdraw Amount1 : ");// prompt
        double withdrawAmount = input.nextDouble();// obtain user input

        account1.withdraw(withdrawAmount);// add to account1’s balance

        // display balances
        System.out.printf("%s balance is : $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance is : $%.2f%n",account2.getName(), account2.getBalance());


        System.out.print("Enter your withdraw Amount2 : ");// prompt
        withdrawAmount = input.nextDouble();// obtain user input

        account2.withdraw(withdrawAmount);// add to account1’s balance

        //display balance
        System.out.printf("%s balance is : $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance is : $%.2f%n",account2.getName(), account2.getBalance());



    }
}