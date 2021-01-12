package shoppingcart;

/**
 * This class represents the Order object
 * An Order consist of a product, quantity, cost and a price policy
 *
 * @author SETRIAKOR
 */

public class Order implements Comparable<Order>, PricePolicy {

    private int quantity;
    private int cost;
    private Product product;
    private PricePolicy policy;

    public Order() {
    }


    public Order(int quantity, int cost, Product product) {
        this.quantity = quantity;
        this.cost = cost;
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return product.getUnitPrice() * quantity;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the pricePolicy
     */
    public PricePolicy getPolicy() {
        return policy;
    }

    /**
     * @param policy the pricePolicy to set
     */
    public void setPolicy(PricePolicy policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Order order) {
        return 0;
    }

    /**
     * Returns a textual representation of the order.
     *
     * @return a textual representation of the order.
     */
    @Override
    public String toString() {
        return "Order{" +
                "quantity=" + quantity +
                ", cost=" + cost +
                ", product=" + product +
                '}';
    }

    @Override
    public int calculateCost(int quantity, int unitPrice) {
        quantity = this.quantity;
        unitPrice = this.product.getUnitPrice();
        return quantity * unitPrice;
    }
}
