class Main {

    public static void main(String [] args)
    {
        car c = new car();
        c.display();
    }


}



class vehicle{
    int maxSpeed = 120;
}
 class car extends vehicle
{
    int maxSpeed = 100;

    public void display()
    {
        System.out.println(super.maxSpeed);
    }

        }
