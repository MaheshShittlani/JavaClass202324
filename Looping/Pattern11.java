/**
 *              Space       Number(up)     Number(down)
 *  ----1       4           1-1     
 *  ---121      3           1-2             1-1
 *  --12321     2           1-3             2-1
 *  -1234321    1           1-4             3-1 
 *  123454321   0           1-5             4-1
 */
public class Pattern11 {
    public static void main(String[] args) {
        int  n = 5;
        for(int i = 1; i <= n; i++) {

            /*Space */
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            /*Number Up*/
            for(int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }

            /*Number Down */
            for(int l = i - 1; l >= 1; l--) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
