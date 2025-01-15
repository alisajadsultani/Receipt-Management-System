import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Receipt> receipts;

    public Store(String name) {
        this.name = name;
        this.receipts = new ArrayList<>();
    }

    public String getStoreName() {return name;}
    public void addReceipt(Receipt receipt) {receipts.add(receipt);}
    public ArrayList<Receipt> getReceipts() {return receipts;}

    public void viewReceipts() {
        if (receipts.isEmpty()) {
            System.out.println("There are no receipts for store: " + this.name);
            return;
        }
        System.out.println("Receipts for Store: " + this.name);
        for (Receipt receipt : receipts) {
            System.out.println(receipt.showReceipt());
        }
    }
}
