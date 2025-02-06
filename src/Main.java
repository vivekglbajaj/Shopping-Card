import models.Product;
import models.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Smartphone", 20000);
        Product p3 = new Product("Headphones", 2000);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct(p2);
        cart.displayCart();

    }
}