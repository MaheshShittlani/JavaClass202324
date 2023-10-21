/**
 *  ABCDEFGFEDCBA
 *  ABCDEF-FEDCBA
 *  ABCDE---EDCBA
 *  ABCD-----DCBA
 *  ABC-------CBA
 *  AB---------BA
 *  A-----------A
 *  AB---------BA
 *  ABC-------CBA
 *  ABCD-----DCBA
 *  ABCDE---EDCBA
 *  ABCDEF-FEDCBA
 *  ABCDEFGFEDCBA
 */
public class Pattern14 {
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

        for(int i = 2; i <= n; i++) {
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

