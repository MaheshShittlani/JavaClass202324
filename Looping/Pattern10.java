/**
 *      ----1       |   1-1
 *      ---123      |   1-3
 *      --12345     |   1-5
 *      -1234567    |   1-7    
 *      123456789   |   1-9
 * -----------------------------
 *                      1-2*i-1
 */

public class Pattern10 {
    public static void main(String[] args) {
        int  n = 5;
        for(int i = 1; i <= n; i++) {

            /*Space */
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            /*Number */
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
