public class Main {
    public static void main(String[] args)


    {
        // boolean in java
        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passalldoors = false;

        int count = 0;

        if (passedDoor)
        {
            System.out.println("we pass the first door");
            count = count + 1;
        }

        if (passedDoor)
        {
            System.out.println("we miss the first door");
            count = count + 1;
        }

        if (passedDoor)
        {
            System.out.println("we pass the first door");
            count = count + 1;
        }



        if (count == 3) {
            passalldoors = true;
        }

        if (passalldoors){
            System.out.println("Congratulations you pass all " + count + " doors !");
        }






    }


}