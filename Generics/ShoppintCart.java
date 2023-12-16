import java.util.ArrayList;
import java.util.List;

public class ShoppintCart <T extends Priceditems> {
    List<T> cart;

    public ShoppintCart() {
        cart = new ArrayList<>();
    }

    public void addItem(T item) {
        cart.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for(T item: cart) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayItems() {
        for(T item: cart) {
            System.out.println(item.toString());
        }
    }
}
