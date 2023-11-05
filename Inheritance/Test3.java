class A {
    private int x;

    public void set(int x) {
        this.x = x;
    }

    public void show() {
        System.out.println("x = " + x);
    }
}

class B extends A {
    private int y;

    public void set(int x, int y) {
        //this.x = x; Error
        set(x);
        this.y = y;
    }

    public void show() {
        super.show();
        System.out.println("y = " + y);
    }
}


public class Test3 {
    public static void main(String[] args) {
        B b1 = new B(); // x, y 
        
        b1.set(10, 20);
        b1.show();

        b1.set(5);
        b1.show();

        A a1 = new A();
        a1.set(15);
        a1.show();
        b1.show();
    }
}
