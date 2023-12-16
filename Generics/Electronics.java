public class Electronics implements Priceditems {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    
    
    /**
     * @return double return the price
     */
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
