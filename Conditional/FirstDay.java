import java.io.Console;

/**
 * 1/1/1            -           Monday
 * 
 * 7
 * 8/1/1            -           Monday
 * 
 * 
 * 14
 * 15/1/1           -           Monday
 * 
 * 21
 * 22/1/1           -           Monday
 * 
 * 
 * 28
 * 29/1/1           -           Monday
 * 
 * 
 * y = 2001
 *      year passed = 2000
 */

 

public class FirstDay {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.println("Enter any year: ");
        int y = Integer.parseInt(con.readLine()); // 2001

        int skipDays = (y - 1) * 365 + 1;
        int leapDays = (y - 1) / 4 - (y - 1)/100 + (y - 1) / 400;
        int totalSkipDays = skipDays + leapDays;

        switch (totalSkipDays % 7) {
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
        }
    }
}
