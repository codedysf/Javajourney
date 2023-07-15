import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        ArrayList <String> list = new ArrayList<String>();

        list.add("mango");
        list.add("orange");

        System.out.println(list.get(0) +"\n"+ list.get(1));
    }
}