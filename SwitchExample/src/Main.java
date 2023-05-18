import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter your Exam score");

        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        switch (score)
        {
            //Case statements
            case 90:
                System.out.println("your grade is 'A'");
                break;
            case 80:
                System.out.println("your grade is 'B'");
                break;
            case 70:
                System.out.println("your grade is 'C'");
                break;

            case 60:
                System.out.println("your grade is 'D'");
                break;

            case 50:
                System.out.println("your grade is 'E'");
                break;
            //Default case statement
            default:
                System.out.println("rewrite the exam");
        }

    }
}