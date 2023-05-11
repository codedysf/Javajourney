import java.util.Scanner;// program uses class scanner

public class Main {
    public static void main(String[] args)

    {
        //scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // initialization phase
       int total = 0;
       int gradecounter = 1;


        // processing phase uses counter controlled repetition
       while (gradecounter <= 10)// loop ten times

       {
           System.out.println("enter grade : ");//prompt
           int grade = input.nextInt();//input next grade
           total = total + grade; // add grade to total
           gradecounter = gradecounter + 1; // increment counter by 1

       }

       int average = total / 10 ; //

        // display total and average grade
       System.out.println("The class total is : " + total);
        System.out.println("The class average is : " + average);

    }
}