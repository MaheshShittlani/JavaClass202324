package Switch;

import java.io.Console;

public class PrintWDay {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter any day, Say(0-6): ");
        int day = Integer.parseInt(con.readLine());

        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
