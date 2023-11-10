package DataBase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvOperation {
    static String fileName = "ProductionDataBase.csv";

    public static void insert (Component component){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))){
        }catch (IOException e){
            System.out.println("File write error");
        }
    }
}
