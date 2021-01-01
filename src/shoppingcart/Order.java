package shoppingcart;

public class Order implements Comparable<Order> {

    private int quantity;
    private int cost;
    private Product product;

    public Order() {
    }

    public Order(int quantity, int cost, Product product) {
        this.quantity = quantity;
        this.cost = cost;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Order order) {
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "quantity=" + quantity +
                ", cost=" + cost +
                ", product=" + product +
                '}';
    }
}
