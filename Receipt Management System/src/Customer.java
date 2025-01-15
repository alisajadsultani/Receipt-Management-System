import java.util.ArrayList;

public class Customer {
    public String name;
    private ArrayList<Receipt> receipts;

    public Customer(String name) {
        this.name = name;
        this.receipts = new ArrayList<>();
    }

    public String getCustomerName() {
        return name;
    }

    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    public void viewReceipts() {
        if (receipts.isEmpty()) {
            System.out.println("There are no receipts for customer: " + this.name);
            return;
        }
        System.out.println("Receipts for Customer: " + this.name);
        for (Receipt receipt : receipts) {
            System.out.println(receipt.showReceipt());
        }
    }
}
