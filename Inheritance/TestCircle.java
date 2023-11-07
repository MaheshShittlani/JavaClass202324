class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.displayInfo();

        c1.set(10);
        c1.displayInfo();


        FilledCircle c2 = new FilledCircle(4);
        c2.displayInfo();

        c2.set("Blue");
        c2.displayInfo();
    }    
}
