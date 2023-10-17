/**
 * 1    -1      1       -1              N time
 */
public class Series7 {
    
    public static void main(String[] args) {
        
        int n = 10;
        int i = 1;
    
        int term = 1;
        while(i <= n) {
            System.out.print(term+"\t");
            term = term * -1;
            i++;
        }
    }
}
