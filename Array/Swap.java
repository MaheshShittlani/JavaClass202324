//Call by Value

public class Swap {
    // Form argument/ Parameter        
    public static void swap(int x, int y) {
        int t = x;
        x = y;
        y = t;
        System.out.println("x = " + x + ", y = "+y);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a , b); // actual argument / Arguments

        System.out.println("a = " + a + ", b = " + b);
    }
}
