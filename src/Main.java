import DataBase.CreateIdNumber;
import DataBase.TimeAndDateOfProduction;

public class Main {
    public static void main(String[] args) {
        System.out.println(CreateIdNumber.idNumber() + ";"+ TimeAndDateOfProduction.getActualTime().toString());
    }
}