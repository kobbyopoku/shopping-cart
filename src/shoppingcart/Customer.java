package shoppingcart;

public class Customer {

    private String customerId;
    private Name name;

    public Customer() {
    }

    public Customer(String customerId, Name name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name=" + name +
                '}';
    }
}
