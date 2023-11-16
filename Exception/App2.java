public class App2 {
    public static void main(String[] args) {
        

        int a = 0, b = 0, c = 0;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index ");
        } catch(NumberFormatException e) {
            System.out.println("Invalid number");
        }


        int result = 0;
        try {
            result = a / (b - c);
        } catch (ArithmeticException e) {
            System.out.println("Invalid expersssion ");
        }

        System.out.println("Result = " +  result);
    } 
}
