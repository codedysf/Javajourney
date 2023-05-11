import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // create scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variable in declarations
        int pass =0;
        int failure=0;
        int counter = 1;

        while (counter <= 10)// process 10 student using counter control
        {
            System.out.print("Enter exam result ( 1 = pass, 2 = failure ) :  ");
            int result = input.nextInt();// prompt

            // if...else is nested in the while loop
            if (result == 1)
                pass = pass + 1;
            else
                failure = failure + 1;

            counter = counter + 1;// increment counter

        }

        // print the value in pass and failure
        System.out.println("the number of pass " + pass);
        System.out.println("the number of failure " + failure);

        if (pass > 8)//determine whether more tha 8 student pass
            System.out.println("Bonus to the instructor!");



    }
}