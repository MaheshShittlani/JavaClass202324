class Rectangle {
    private int x, y;
    private int width, breadth;
    
    public void set(int x, int y, int width, int breadth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.breadth = breadth;
    }

    public void set(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.width = this.breadth = length;
    }

    public void show() {
        System.out.println("<"+x+", "+y+", "+width+", "+breadth+">");
    }

    public void show(String msg) {
        System.out.print(msg+" ");
        System.out.println("<"+x+", "+y+", "+width+", "+breadth+">");
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.set(0, 0, 10, 20);
        r1.show();

        r1.set(1, 1, 10);
        r1.show("After converting into square...");
    }
}
