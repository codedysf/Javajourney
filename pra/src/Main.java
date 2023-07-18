import java.util.Scanner;

public class Main {
    public static void main(String[] args)


    {
        Scanner input = new Scanner(System.in);


        try {
            int num = input.nextInt();
            System.out.println(num);
        }catch (Exception e)
        {
            System.out.println("enter an integer no String");
        }
    }
}