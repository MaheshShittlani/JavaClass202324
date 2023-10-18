/**
 *      5 4 3 2 1       | 5-1
 *      4 3 2 1         | 4-1
 *      3 2 1           | 3-1
 *      2 1             | 2-1
 *      1               | 1-1
 */    
public class Pattern7 {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
         
    }
}
