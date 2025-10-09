// Product.java: Represents a single product and its information
public class Product {
    private String upc;
    private String name;
    private double price;

    //Constructor
    public Product(String upc, String name, double price) {
        this.upc = upc;
        this.name = name;
        this.price = price;
    }

    public String getUpc() {
        return upc;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
