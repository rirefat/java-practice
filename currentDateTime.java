import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class currentDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Current Date: "+currentDate);

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = time.format(formatter);
        System.out.println("Current Time: "+currentTime);

    }
}
