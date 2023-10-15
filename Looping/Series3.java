// 1 3 5 7 9....10 terms

// n        2n-1
    // 1       1
    // 2       3
    // 3       5
public class Series3 {
    public static void main(String[] args) {
        int i = 1; int n = 10;
        
        // Logic - 1
        // int term = 1;
        // while(i <= n) {
        //     System.out.print(term+" ");
        //     i++;
        //     term += 2;
        // }
    
        // Logic - 2
        
        // while(i <= n) {
        //     System.out.print((2 * i - 1) + " ");
        //     i++;
        // }

        // Logic - 3
        while(i <= (2 * n - 1)) {
            System.out.print(i +" ");
            i += 2;
        }
    }    
}
