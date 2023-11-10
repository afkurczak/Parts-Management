package DataBase;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CreateIdNumber {

    public static String idNumber(){
        String idNumber = GetDateAndTime() + NextNumber();
        return idNumber;
    }
    private static String GetDateAndTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
        String date = currentDateTime.format(formatter);
        return date;
    }

    private static String NextNumber() {
        String nextNumber = "1";
        return nextNumber;
    }
}
