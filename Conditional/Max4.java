public class Max4 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        int d = (int)(Math.random() * 10);

        int max = a;

        if(b > max) {
            max = b;
        }

        if(c > max) {
            max = c;
        }

        if(d > max) {
            max = d;
        }

        System.out.println(a + ", "+b + ", "+ c + ", "+d);
        System.out.println("Max: "+max);
    }
}
 