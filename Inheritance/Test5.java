// A <- B <- C
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

class B extends A {
    private int y;

    public B() {
        super(); // optional
        y = 1;
    }

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    public void set(int x,int y) {
        set(x);
        this.y = y;
    }

    public void show() {
        super.show();
        System.out.println("y = " + y);
    }
}

class C extends B {
    private int z;

    public C() {
        super();
        z = 1;
    }

    public C(int x, int y , int z) {
        super(x, y);
        this.z = z;
    }

    public void set(int x, int y, int z) {
        set(x, y);
        this.z = z;
    }

    public void show() {
        super.show();
        System.out.println("z = " + z);
    }
}
class Test5 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.show();

        c1.set(10, 20, 30);
        c1.show();

        C c2 = new C(5, 15, 25);
        c2.show();
    
    }
}
