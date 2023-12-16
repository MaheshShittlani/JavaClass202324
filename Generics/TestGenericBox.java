public class TestGenericBox {
    public static void main(String[] args) {
        GenericBox<Integer> b1 = new GenericBox<Integer>();
        b1.setValue(10);
        //b1.setValue("Gopal");

        GenericBox<String> b2 = new GenericBox<String>();
        b2.setValue("Gopal");

        int i = b1.getValue(); // Auto unboxing
        System.out.println("Box<b1>: " + i );
        
        String s = b2.getValue();
        System.out.println("Box<b2>: " + s);

    }
}
