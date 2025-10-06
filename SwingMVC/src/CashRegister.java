// CashRegister.java: Handles loading products, tracking scanned items, and calculating subtotal

import java.io.*;
import java.util.*;

public class CashRegister {
    private Map<String, Product> productMap; // Store products by UPC for a quick lookup
    private List<Product> scannedItems;      // List of items scanned so far

    // Initializes and loads products from file
    public CashRegister(String filename) {
        productMap = new HashMap<>();
        scannedItems = new ArrayList<>();
        loadProducts(filename);
    }

    // Read product info from file and store in productMap
    private void loadProducts(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {  //not EOF
                String[] parts = line.split(",");  //splits by ',' from the products.txt file
                if (parts.length == 3) {  //ensuring that we have the UPC code, Product Name and the price to work with
                    String upc = parts[0].trim();
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim()); // Convert price from text to a number 
                    productMap.put(upc, new Product(upc, name, price)); // Store product in map by UPC
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading products: " + e.getMessage());
        }
    }

    // returns product object by UPC code
    public Product getProduct(String upc) {
        return productMap.get(upc);
    }

    // Add a scanned product to the list if not null
    public void addProduct(String upc) {
        Product p = productMap.get(upc);
        if (p != null) {
            scannedItems.add(p);
        }
    }

    // Return list of all scanned items
    public List<Product> getScannedItems() {
        return scannedItems;
    }

    // Calculate total price of all scanned items
    public double getSubtotal() {
        double total = 0;
        for (Product p : scannedItems) {
            total += p.getPrice();  // Add each product's price to sub total
        }
        return total;
    }

    // Return list of all UPCs which useful for random scanning
    public List<String> getAllUPCs() {
        List<String> upcs = new ArrayList<>();
        for (String upc : productMap.keySet()) {
            upcs.add(upc);
        }
        return upcs;
    }
}
