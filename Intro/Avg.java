import java.io.Console;
public class Avg {
    public static void main(String[] args) {
        int a, b, c;

        Console con = System.console();
        System.out.print("Enter any 3 numbers: ");
        a = Integer.parseInt(con.readLine());
        b = Integer.parseInt(con.readLine());
        c = Integer.parseInt(con.readLine());

        float avg = (a + b + c) / 3.0f;

        System.out.println("Average: "+avg);
    }
}
