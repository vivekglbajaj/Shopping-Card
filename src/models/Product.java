package models;

public class Product {
    private String name;
    private String price;

    public Product(String name, int price){
        this.name = name;
        this.price = String.valueOf(price);
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }

 @Override
    public String toString() {
        return name + " - ₹" + price;
    }

}
