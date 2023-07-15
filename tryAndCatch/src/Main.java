import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /// try and catch

      /*  Scanner input = new Scanner(System.in);
        System.out.println("enter your favorite number : ");

        try {
            int num = input.nextInt();
            System.out.println(num);
        }catch (Exception e)
        {
            System.out.println("Please enter a number");
        } */


        try {
            int a [] = {1,5};
            System.out.println(a[6]);
        } catch (NullPointerException e)
        {
            System.out.println("Your array is null");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Your index is out of bound");
        }catch (Exception e)
        {
            System.out.println("something else went wrong");
        }





    }
}