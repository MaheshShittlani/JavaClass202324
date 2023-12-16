public class TestBox {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setValue(10); // new Integer(10) - Auto Boxing


        Box b2 = new Box();
        b2.setValue("Gopal"); // new String("Gopal")

        int i = (int)b1.getValue(); // Auto unboxing

        String s = (String)b2.getValue();

        System.out.println("Box<b1>: " + i);
        System.out.println("Box<b2>: " + s);

        i = (int)b2.getValue();

        System.out.println("Box<b2>: " + i);
    }
}
