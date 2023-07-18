public class Main {
    public static void main(String[] args)

    {
        B obj = new B();
        obj.show();
    }

    static  class A
    {
        public void show()
        {
            System.out.println("this is me ");
        }
    }

    static class B extends A
    {
        public void show()
        {
            System.out.println("this is B");
        }
    }
}