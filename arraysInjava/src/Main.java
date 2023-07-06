import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        System.out.println("WELCOME TO OUR ZOMBIE KILLER PROGRAM");

        String backup [] = {"shotgun", "assault rifle","sniper"};
        String zombies [] = {"close range","mid range","long range"};

        System.out.println("ENTER GUN OF CHOICE : ");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        if (choose == 1) {
            System.out.println("You choose \n" + backup[0] + " \"for\" " + zombies[0]);
        } else if (choose == 2) {
            System.out.println("You choose \n" + backup[1] + " \"for\" " + zombies[1]);
        }else if (choose == 3)
            System.out.println("You choose \n" + backup[2] + " \"for\" " + zombies[2]);
        else
            System.out.println("invalid choice !!");

        //for (int list =0; list <= backup.length; list++)
          //  System.out.println(backup[list]);
    }
}