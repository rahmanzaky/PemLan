package interfacing;

public class Invoice implements Payment {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "\nProduct: " + productName + "\nQuantity: " + quantity + "\nPrice per Item: Rp" + pricePerItem;
    }
}
