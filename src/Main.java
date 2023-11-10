import DataBase.CurrentTimeAndDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String currentDateTime = CurrentTimeAndDate.TimeAndDate();
        System.out.println(currentDateTime);
    }
}