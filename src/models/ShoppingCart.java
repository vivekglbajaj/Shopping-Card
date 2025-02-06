package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;  // Encapsulation: Private list of products

    // Constructor initializes empty list
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    // Adds a product to the cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    // Removes a product from the cart
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println(product.getName() + " not found in cart.");
        }
    }

    // Calculates total price
    public String calculateTotal() {
        String total = String.valueOf(0);
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display the cart items
    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total: ₹" + calculateTotal());
    }
}
