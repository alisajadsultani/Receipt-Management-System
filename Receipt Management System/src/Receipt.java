import java.util.ArrayList;
import java.text.DecimalFormat;

public class Receipt {
    DecimalFormat df = new DecimalFormat("#.###");

    private static int counter = 1;
    private int id;
    private Customer customer;
    private Store store;
    private ArrayList<Item> items;
    private Payment payment;
    private double total;

    public Receipt() {
        this.id = counter++;
        this.items = new ArrayList<>();
    }

    public void setCustomer(Customer customer) {this.customer = customer;}
    public void setStore(Store store) {this.store = store;}
    public void addItem(Item item) {items.add(item);}
    public void setPayment(Payment payment) {this.payment = payment;}
    public double getTotal(){return this.total;}

    public void calculateTotal(double taxRate) {
        total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        total = payment.calculateTotalAmount(taxRate);
        total = Double.parseDouble(df.format(total));
    }

    public String showReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receipt ID: ").append(id).append("\n");
        sb.append("Store: ").append(store.getStoreName()).append("\n");
        sb.append("Customer: ").append(customer.getCustomerName()).append("\n");
        sb.append("Items:\n");
        for (Item item : items) {
            sb.append("- ").append(item.getName()).append(", $").append(item.getPrice())
                    .append(", Quantity: ").append(item.getQuantity()).append("\n");
        }
        sb.append("Payment Method: ").append(payment.type).append("\n");
        sb.append("Total: $").append(total).append("\n");
        return sb.toString();
    }
}
