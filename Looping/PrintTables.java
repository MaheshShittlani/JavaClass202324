/**
 * --1--2--3
 * -11-12-13
 */
public class PrintTables {
    public static void main(String[] args) {
        for(int number = 1; number <= 10; number++) {
            for(int i = 1; i <= 10; i++) {
                System.out.format("%5d ", number * i);
            }
            System.out.println();
        }
    }
}