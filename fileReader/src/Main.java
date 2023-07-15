import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("How to read file in java");

        File file = new File("\\Users\\user\\Documents\\Newfolder\\subtile.srt");
        Scanner scan = new Scanner(file);

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }

    }
}