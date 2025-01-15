public class Item {
    private String name;
    private double price;
    private int quantity;
    private String type;

    public Item(String name, double price, int quantity, String type) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity must not be below zero.");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public String getName() {return name;}
    public String getType() {return type;}

    public double calculateTaxedPrice(double taxRate) {
        return price * (1 + taxRate);
    }
}
