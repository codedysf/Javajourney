public class Main {
    public static void main(String[] args)

    {
        Robin b = new Robin();
        b.sing();
    }
}



class Bird{
    public  void  sing (){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird {
    public  void  sing (String song){
        System.out.println("twiddledeeedee");
    }

}

class Pelican extends Bird
{
    public  void  sing (){
        System.out.println("tweet tweet tweet");
    }

}

