import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args)


    {
        Date currentTime = new Date();

        SimpleDateFormat timeFormate = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormate.format(currentTime));

        ArrayList fruitList = new ArrayList<>();
        fruitList.add("mango");
        fruitList.add("banana");
        fruitList.add("orange");

        System.out.println(fruitList + " Tha time of print is " + timeFormate.format(currentTime));

    }
}