import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        AtmOperationInterf op = new AtmOperationImpl();

        int atmnumber=12345;
        int atmpin = 123;

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ATM MACHINE");
        System.out.print("Enter ATM number : ");
        int atmNumber = input.nextInt();
        System.out.println("Enter Pin: ");
        int pin = input.nextInt();

        if ((atmnumber == atmNumber) && (atmpin==pin))
        {
           while (true)
           {
               System.out.println("1. View Available Balance\n 2. Withdraw Amount \n 3. Deposit Amount \n 4. View MiniStatement\n 5. Exit");
               System.out.print("Enter Choice: ");

               int choice = input.nextInt();

               if (choice==1)
               {
                   op.viewBalance();

               } else if (choice==2) {
                   // Withdraw Amount
                   System.out.print("Enter withdraw Amount: ");
                   double withdrawAmt = input.nextDouble();
                   op.withdrawAmount(withdrawAmt);

               } else if (choice==3) {
                   //Deposit Amount
                   System.out.print("Enter Deposit Amount: ");
                   double depositAmt = input.nextDouble();
                   op.depositAmount(depositAmt);


               } else if (choice==4) {
                   //View MiniStatement
               } else if (choice==5) {
                   System.out.println("Please collect your card \n Thank you for using the ATM ");
                   System.exit(0);
               }else
               {
                   System.out.print("please enter correct choice");
               }
           }
        }else
        {
            System.out.println("Incorrect ATM number or Pin");
            System.exit(0);
        }
    }
}