public class App1 {
    public static void main(String[] args) {
        int a, b, c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        int result = a / (b - c);

        System.out.println("Result = " +  result);
    }    
}
