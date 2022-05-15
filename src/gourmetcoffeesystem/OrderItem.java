package gourmetcoffeesystem;

public class OrderItem {
    private int quantity;
    private Product product;

    public OrderItem(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue()
    {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return getProduct() + "_" + getQuantity() + "_" + getValue();
    }
}
