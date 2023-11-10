package DataBase;

import java.util.Scanner;

public class Terminal {
    public static void TerminalDataBaseMenu (){
        System.out.println("Parts Menagement");
        System.out.println("Choose option");
        System.out.println("1. Add new component");
        System.out.println("2. Get by ID");
        System.out.println("3. Delete by ID");
        System.out.println("4. Update by ID");

        Scanner scanner = new Scanner(System.in);
        int menuKey = scanner.nextInt();

        switch (menuKey){
            //case 1 -> add
        }
    }
}
