package Switch;

import java.io.Console;

public class PrintMonthDays {
    public static void main(String[] args) {
        
        Console con =  System.console();
        System.out.print("Enter any month, say(1-12): ");
        int month = Integer.parseInt(con.readLine());

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            case 2:
                System.out.print("Enter the year: ");
                int y = Integer.parseInt(con.readLine());

                if(y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 Days");
                }
                break;
            default:
                break;
        }
    }
}
