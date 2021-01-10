package shoppingcart;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Cart implements Iterable<Order>, Comparator<Cart> {

    private String cartId;
    private Customer customer;
    private Date date;

    private List<Order> orders;

    private int noOfItems;

    public Cart() {
    }

    public Cart(String cartId, Customer customer, Date date, List<Order> orders) {
        this.cartId = cartId;
        this.customer = customer;
        this.date = date;
        this.orders = orders;
    }

    /**
     * @return the cartId
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * @@param cartId the cartId to set
     */
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @@param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * @return the totalCost
     */
    public int getTotalCost() {
        return orders.stream().mapToInt(Order::getCost).sum();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public boolean containsOrder(Order order) {
        return orders.contains(order);
    }

    public Optional<Order> findOrder(String order) {
        return orders.stream().findAny();
    }

    public void sortOrders() {
        orders.stream().sorted();
    }

    public void sortOrders(Comparator<Order> co) {
        orders.stream().sorted(co);
    }

    public int getNoOfItems() {
        return orders.size();
    }

    @Override
    public int compare(Cart cart, Cart t1) {
        return 0;
    }

    @Override
    public Iterator<Order> iterator() {
        return orders.iterator();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", customer=" + customer +
                ", date=" + date +
                ", orders=" + orders +
                ", no of items=" + getNoOfItems() +
                ", total cost="+ getTotalCost() +
                '}';
    }
}
