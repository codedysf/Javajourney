import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)

    {
        System.out.println("Date in java");

        Date currentDate = new Date();
        System.out.println(currentDate);

      SimpleDateFormat timeFormate = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormate.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat daysOftheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(daysOftheWeekFormat.format(currentDate) + "   " + dateFormat.format(currentDate));


    }
}