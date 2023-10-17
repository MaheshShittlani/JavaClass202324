/**
 * n = n / 10           n > 0       digCount = 0
 * -----------------------------
 * 123                                  1
 * 12                                   2
 * 1                                    3
 * 0           
 */

import java.io.Console;

public class CountDigit {
    public static void main(String[] args) {
        Console con = System.console();
        
        System.out.print("Enter any number: ");
        int n = Integer.parseInt(con.readLine());

        int digCount = 0;
        while(n != 0) {
            digCount++;
            n = n / 10;
        }

        System.out.println("Number of digits: "+digCount);
    }
}