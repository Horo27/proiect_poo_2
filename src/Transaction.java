public class Transaction {
    private String type; // "IN" or "OUT"
    private Product product;
    private int quantity;

    public Transaction(String type, Product product, int quantity) {
        this.type = type;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Transaction: " + type + " | Product: " + product.getName() + " | Quantity: " + quantity;
    }
}