package salableProduct;

public class SalableProduct implements Comparable<SalableProduct> {
    private String name;
    private String description;
    private double price;
    private int quantity;

    // Constructor, getters, setters
    public SalableProduct(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public int compareTo(SalableProduct otherProduct) {
        // Compare based on the name, ignoring case
        return this.name.compareToIgnoreCase(otherProduct.getName());
    }
}



