import java.io.Console;

/**
 * Input any number and print the table in the given format
 *      2 x 1 = 2
 *      2 x 2 = 4
 *      2 x 3 = 6
 *      2 x 4 = 8
 * 
 *      2 x 10 = 20    
 */
public class PrintTable {
    public static void main(String[] args) {
        int n;
        
        Console con = System.console();
        System.out.print("Enter any number: ");
        n = Integer.parseInt(con.readLine());

        int  i = 1;
        while(i <= 10) {
            System.out.println(n + " x "+ i +" = " + (n * i));
            i++;
        }
    }
}
