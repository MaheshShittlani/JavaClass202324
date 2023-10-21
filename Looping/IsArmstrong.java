/*
 *  n = 153 / 15 / 1 / 0
 */

import java.io.Console;

public class IsArmstrong {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.print("Enter any number: ");
        int n = Integer.parseInt(con.readLine()); // 471
        int count = 0;
        int old = n;
        while(n != 0) {
            count++;
            n = n / 10;
        }

        n = old;
        int arm = 0;
        while(n != 0) {
            int dig = n % 10;
            arm += (int)Math.pow(dig, count);
            n = n / 10;
        }

        if(arm == old) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
