public class Main {
    public static void main(String[] args)

    {
        A obj = new A("Yusuf");
    }

    static  class  A
    {
        // THE CONSTRUCTOR
        public A()
        {

        }
        public A(int a)
        {
            System.out.println("this is a");
        }
        public A(float a)
        {
            System.out.println("this is float");
        }
        public A(String a)
        {
            System.out.println("this is string");
        }
    }
}