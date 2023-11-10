package DataBase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDateOfProduction {
    public static String getActualTime (){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String actualTimeAndDate = currentDateTime.format(formatter);
        return actualTimeAndDate;

    }
}
