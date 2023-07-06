import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter grade : ");
        int grade = input.nextInt();
        System.out.println(grade);

        if (grade >=90 && grade <=100)
        {
            System.out.println("you got \"A\"");
        } else if (grade >=80 && grade <=89)
        {
            System.out.println("you got \"B\"");
        }else if (grade >=70 && grade <=79)
        {
            System.out.println("you got \"C\"");
        }else if (grade >=60 && grade <=69)
        {
            System.out.println("you got \"D\"");
        }else if (grade >=30 && grade <=59)
        {
            System.out.println("you got \"E\"");
        }else
            System.out.println("Enter valid number");
    }
}