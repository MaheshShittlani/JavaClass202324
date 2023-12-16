public class TestShoppingCart {
    public static void main(String[] args) {
        ShoppintCart<Electronics> electronicsCart = new ShoppintCart<>();
        electronicsCart.addItem(new Electronics("TV", 75000));
        electronicsCart.addItem(new Electronics("Saregapa Carvaan", 3500));

        ShoppintCart<Clothing> clothingCart = new ShoppintCart<>();
        clothingCart.addItem(new Clothing("Shirt", 750));
        clothingCart.addItem(new Clothing("Jeans", 2000));

        electronicsCart.displayItems();
        System.out.println("Electronics total: " + electronicsCart.getTotalPrice());
        System.out.println("-------------------------------------");
        clothingCart.displayItems();
        System.out.println("Clothing total: " + clothingCart.getTotalPrice());
    
        // ShoppintCart<Book> bookCart = new ShoppintCart<>();
    }
}
