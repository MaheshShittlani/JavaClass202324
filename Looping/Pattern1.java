/**
 * 
 *          i = 1  2  3  4  5
 * ----------------------------------
 *       j    1   1  2  3  4  5
 *            2   1  2  3  4  5
 *            3   1  2  3  4  5
 *            4   1  2  3  4  5
 */

public class Pattern1 {
    public static void main(String[] args) {
        int i,j;

        for(j = 1; j <= 4; j++) {
            for(i = 1; i <= 5; i++) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
