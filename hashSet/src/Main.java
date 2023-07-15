import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<String> num = new HashSet<String>();
        num.add("banana");
        num.add("dog");
        num.add("pig");

        num.remove("dog");
        System.out.println(num + "\n" + num.size());



    }
}