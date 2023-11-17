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
            System.out.println(e);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
