package DataBase;

import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentTimeAndDate {
    public static String TimeAndDate (){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(currentDate);

    }
}
