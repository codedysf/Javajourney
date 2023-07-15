public class Main {
    public static void main(String[] args)

    {
       /* int i = 0;
        while (i < 3)
        {
            System.out.println("hi");
            i++;
            break;
        }

        System.out.println("-------------------");

        int numbers [] ={ 10,20,30,40,50};
        for (i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 40)
            {
                break;
            }
            System.out.println(i + " " + numbers[i]);
        } */

        System.out.println("-------------------");

        for (int i=0; i< 5; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(i + " " + j);
                break;
            }
        }



    }
}