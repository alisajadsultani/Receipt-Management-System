public abstract class Payment {
    protected String type;
    protected double amount;

    public Payment(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public abstract double calculateTotalAmount(double taxRate);
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super("Cash", amount);
    }

    @Override
    public double calculateTotalAmount(double taxRate) {
        return amount * (1 + taxRate);
    }
}

class CardPayment extends Payment {
    public CardPayment(String cardType, double amount) {
        super(cardType, amount);
    }

    @Override
    public double calculateTotalAmount(double taxRate) {
        return amount * (1 + taxRate);
    }
}