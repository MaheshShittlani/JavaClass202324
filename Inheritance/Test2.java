class A {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public void showX() {
        System.out.println("x = " + x);
    }
}

class B extends A {
    private int y;

    public void setXY(int x, int y) {
        //this.x = x; Error
        setX(x);
        this.y = y;
    }

    public void showXY() {
        showX();
        System.out.println("y = " + y);
    }
}


public class Test2 {
    public static void main(String[] args) {
        B b1 = new B(); // x, y 
        
        b1.setXY(10, 20);
        b1.showXY();
    }
}
