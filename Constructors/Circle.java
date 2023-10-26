class Circle {
    private int radius;
    
    // No Parameter Constructor
    public Circle() {
        radius = 1;
    }

    // Parameterize constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Copy Constructor
    public Circle(Circle c) {
        this.radius = c.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area of Circle <Radius: 1>: " + c1.computeArea());
        System.out.println("Perimeter of Circle <Radius: 1>: " + c1.computePerimeter());

        c1.setRadius(5);

        System.out.println("Area of Circle <Radius: 5>: " + c1.computeArea());
        System.out.println("Perimeter of Circle <Radius: 5>: " + c1.computePerimeter());

        Circle c2 = new Circle(10);
        System.out.println("Area of Circle <Radius: 10>: " + c2.computeArea());
        System.out.println("Perimeter of Circle <Radius: 10>: " + c2.computePerimeter());


        // Circle c3 = new Circle(5.5); Error
        
        Circle c3 = new Circle();
        c3.setRadius(c2.getRadius());
        System.out.println("Area of Circle <Radius: <c2>>: " + c2.computeArea());
        System.out.println("Perimeter of Circle <Radius: <c2>>: " + c2.computePerimeter());

        Circle c4 = new Circle(c1);
        System.out.println("Area of Circle <Radius: <c1>>: " + c4.computeArea());
        System.out.println("Perimeter of Circle <Radius: <c1>>: " + c4.computePerimeter());
        
    }
}
