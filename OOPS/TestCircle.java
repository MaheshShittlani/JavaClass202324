class TestCircle {
    public static void main(String ...args) {
        // Creating object.
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        // Assign value to radius
        c1.radius = 10;
        c2.radius = 12;

        // Find the area
        double area1 = c1.computeArea(); // 314
        double area2 = c2.computeArea();

        // Find the perimeter
        double peri1 = c1.computePerimeter();
        double peri2 = c2.computePerimeter();

        System.out.println("Area of Circle-1: "+area1);
        System.out.println("Area of Circle-2: "+area2);

        System.out.println("Perimeter of Circle-1: "+peri1);
        System.out.println("Perimeter of Circle-2: "+peri2);    

    }    
}
