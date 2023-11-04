import java.io.Console;

public class PrintWDay {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter any day, Say(0-6): ");
        int day = Integer.parseInt(con.readLine());
        
        String dayName = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid input";
        };

        System.out.println(dayName);
    }
}
