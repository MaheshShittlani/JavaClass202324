public class Max43 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        int d = (int)(Math.random() * 10);
        int max;

        
        if(a > b && a > c && a > d) {
            max = a;
        } else if(b > c && b > d) {
            max = b;
        } else if(c > d) {
            max = c;
        } else {
            max = d;
        }

        System.out.println(a + ", "+b + ", "+ c + ", "+d);
        System.out.println("Max: "+max);
    }
}
