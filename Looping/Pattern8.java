/**                         
 *      ----1    |  1-1     |   4 (5-1)      
 *      ---12    |  1-2     |   3 (5-2)     
 *      --123    |  1-3     |   2 (5-3)  
 *      -1234    |  1-4     |   1 (5-4)  
 *      12345    |  1-5     |   0 (5-5)
 *      --------------------------------
 *                  1-i     |      n-i 
 */
public class Pattern8 {
    public static void main(String[] args) {
        int  n = 5;
        for(int i = 1; i <= n; i++) {

            /*Space */
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            /*Number */
            for(int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
