class A {
    private int x;

    public A() {
        x = 1;
    }

    public A(int x) {
        this.x = x;
    }

    public void set(int x) {
        this.x = x;
    }

    public void show() {
        System.out.println("x = " + x);
    }
}

class B extends A{
    private int y;

    public B() {
        // super(); by default, optional
        y = 1;
    }

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    public void set(int x, int y) {
        set(x);
        this.y = y;
    }

    public void show() {
        super.show();
        System.out.println("y = "+y);
    }
}

class Test4 {
    public static void main(String[] args) {
        B b1 = new B(); //x = 1, y = 1
        b1.show();

        b1.set(10, 20);
        b1.show();

        b1.set(5);
        b1.show();

        B b2 = new B(4, 40);
        b2.show();
    }   
}
 