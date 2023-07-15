public class Main {
    public static void main(String[] args)
    {
       for (int i = 0; i <= 10; i ++)
       {
           System.out.println("my student are brilliant");
       }

        System.out.println("--------------------------------------------------");

       String color [] = {"red", "pink", "blue"};

       for (int list= 0; list < color.length; list ++)
       {
           System.out.println(list + " " + color[list]);
       }

        System.out.println("--------------------------------------------------");

       String fancyColors [][]= { {"red", "pink", "blue"},
                                  {"green", "yellow", "black"}};

       for (int i = 0; i < 2; i++)
           for (int j = 0; j < 3; j++)
               System.out.println(fancyColors[i][j]);

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 5; i ++)
            for (int j = 0; j < 5; j ++)
                System.out.println(i + " " + j);
    }
}