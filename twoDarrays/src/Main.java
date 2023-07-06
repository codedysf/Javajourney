public class Main {
    public static void main(String[] args)
    {
        //2D Arrays

        int lotteryCard1 [][] ={ {20,30,40},
                                {29,37,42},
                                {10,60,60}
        };


        System.out.println(lotteryCard1[0][0]);

        System.out.println("--------------------------------------------");

        for (int list = 0; list < lotteryCard1.length; list++)
            System.out.println(lotteryCard1[list][list]);

        System.out.println("--------------------------------------------");

        for (int i = 0; i < lotteryCard1.length; i++ )
            for (int j = 0; j < lotteryCard1.length; j++)
                System.out.println(lotteryCard1[i][j]);
    }
}