class A {
    private int x;
    private static int y;
    
    public A() {
        x = ++y;
    }

    public void show() {
        System.out.println("x = "+ x +", y = " + y);
    }
}

class TestA {
    public static void main(String[] args) {
        // y = 3;
        A a1 = new A(); // x = 1
        A a2 = new A(); // x = 2
        A a3 = new A(); // x = 3

        a1.show(); // x = 1, y = 3
        a2.show(); // x = 2, y = 3
        a3.show(); // x = 3, y = 3
    }
}