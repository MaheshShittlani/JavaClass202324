/**
 * n = 5
 * 5! = 5 * 4 * 3 * 2 * 1
 * fact = 5
 * fact = 20
 * fact = 60
 * fact = 120
 * fact = 120
 */
import java.io.Console;

public class Factorial {
    public static void main(String[] args) {
        Console con = System.console();
        
        System.out.print("Enter any number: ");
        int n = Integer.parseInt(con.readLine()); // 5

        int i = n;
        int fact = 1;
        while(i >= 1) {
            fact = fact * i;
            i--;    
        }
    }
}
