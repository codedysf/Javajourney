import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // create a scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //create an object of the class Account and assign it to myAccount
        Account myAccount  = new Account();

        // to display initial value of name ( null )
        System.out.println(myAccount.getName());

        //prompt for user to enter name
        System.out.println("Enter your name : ");
        String theName = input.nextLine();// read a line of text
        myAccount.setName(theName);//put theName in myAccount

        // to print the name save in myAccount
        System.out.printf("my name is : %n%s" ,myAccount.getName());

    }
}