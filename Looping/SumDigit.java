/**
 *                                         sum = 0;
 * n=123(n/10)        dig = n%10           sum = sum + dig;
 * --------------------------------------------------
 *              3                   3
 * 12           2                   5
 * 1            1                   6
 * 0
 */

import java.io.Console;

public class SumDigit {
    public static void main(String[] args) {
        Console con = System.console();
        
        System.out.print("Enter any number: ");
        int n = Integer.parseInt(con.readLine());

        int dig;
        int sum = 0;
        while(n != 0) {
            dig = n % 10;
            sum = sum + dig;
            n /= 10;
        }

        System.out.println("Sum of Digits: "+sum);
    }
}
