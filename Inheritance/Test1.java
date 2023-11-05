class A {
    public int x;
}

class B extends A {
    public int y;
}

class Test1 {
    public static void main(String[] args) {
        B b1  = new B(); // x, y

        b1.x = 10;
        b1.y = 20;

        System.out.println(b1.x + " " + b1.y);
    }
}
