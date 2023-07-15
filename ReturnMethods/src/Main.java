public class Main {
    public static void main(String[] args)

    {
        printAMessage();
        int sum = add(5,4);
        System.out.println(sum);
// another example
        String shouting = cap("why are you shouting ? ");
        System.out.println(shouting);
// another example
        int[] arraylist = num(3,6,9);
        System.out.println(arraylist[0]);
        System.out.println(arraylist[1]);
        System.out.println(arraylist[2]);

    }

    public static void printAMessage()
    {
        System.out.println("i love java");
    }

    public static int add(int a, int b)
    {
       return a+b;
    }
    public  static String cap(String s)
    {
        return s.toUpperCase();
    }

    public static int[] num(int a,int b, int c)
    {
        int[] array = new int [3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}