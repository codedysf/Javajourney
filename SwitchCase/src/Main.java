import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        System.out.println("Switch case");

        Scanner input = new Scanner(System.in);
        int days = input.nextInt();

        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case  3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("enter valid number" +
                        "");
        }
    }
}