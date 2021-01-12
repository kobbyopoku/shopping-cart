package shoppingcart;

/**
 * This class represents the Customer object
 * An Customer consist of a name and and id
 *
 * @author SETRIAKOR
 */
public class Customer {

    private String customerId;
    private Name name;
    private int rewardPoints;

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

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return rewardPoints the pricePolicy to set
     */
    public int getRewardPoints() {
        return rewardPoints;
    }


    /**
     * @param rewardPoints the rewardPoints to set
     */
    public void addRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }


    /**
     * Returns a textual representation of the customer.
     *
     * @return a textual representation of the customer.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name=" + name +
                ", rewardPoints=" + rewardPoints +
                '}';
    }
}
