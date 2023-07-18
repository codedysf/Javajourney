public class Main {
    public static void main(String[] args)

    // methods overloading
    {
        abc morning = new abc();
        morning.greetings(5);


    }

    static class abc
    {
        public void greetings()
        {
            System.out.println("Good morning");
        }

        public void greetings(int a)
        {
            System.out.println("Today is good");
        }
    }
}