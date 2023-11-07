class FilledCircle extends Circle {
    private String color;

    public FilledCircle(double radius) {
        super(radius);
        color = "White";
    }

    public FilledCircle(double radius, String color) {
        super(radius);
        this.color = color;
    }

    public void set(String color) {
        this.color = color;
    }

    public void set(double radius, String color) {
        set(radius);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}
