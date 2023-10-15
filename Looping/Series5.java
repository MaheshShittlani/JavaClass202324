// Fibonicci Series
//  1  1  2  3  5  8  
/**
 * 0    1   1   2   3   5
 * f    s   sum
 *      f   s   sum
 *          f   s   sum 
 *              f   s   sum
 *                  f   s
 */

public class Series5 {
    public static void main(String[] args) {
        int n = 10;
        int f = 0, s = 1;
        int sum, i = 1;

        while(i <= n) {
            System.out.print(s+" ");
            sum = f + s;
            f = s;
            s = sum;
            i++;
        }
    }   
}
