/**
 * 7|  ABCDEFGFEDCBA | 1-7 | 0 (7 - 7)
 * 6|  ABCDEF-FEDCBA | 1-6 | 1 (1 => 7 - 6)
 * 5|  ABCDE---EDCBA | 1-5 | 3 (2 => 7 - 5) 
 * 4|  ABCD-----DCBA | 1-4 | 5 (3 => 7 - 4)
 * 3|  ABC-------CBA | 1-3 | 7 (4 => 7 - 3)
 * 2|  AB---------BA | 1-2 | 9 (5 => 7 - 2)
 * 1|  A-----------A | 1-1 | 11 (6 => 7 - 1)
 * 2|
 * 3|
 * 4|
 * 5|                                   --------
 *                                    (n - i) => 2 * (n - i) - 1            
 */

 /**
  * ABCDEFG
  * ABCDEF
  * ABCDE
  * ABCD
  * ABC
  * AB
  * A
  */
public class Pattern13 {
    public static void main(String[] args) {
        int n = 10;

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(j + 64));
            }

            for(int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print(" ");
            }

            for(int l = i; l >= 1; l--) {
                if(l == n) {
                    l--;
                }
                System.out.print((char)(l + 64));
            }

            System.out.println();
        }
    }
}
