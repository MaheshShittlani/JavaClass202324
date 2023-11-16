public class App3 {
    public static void main(String[] args) {
        

        int a, b, c;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);

            int result = a / (b - c);

            System.out.println("Result = " +  result);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index ");
        } catch(NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (ArithmeticException e) {
            System.out.println("Invalid expersssion ");
        }
        
    }
}
