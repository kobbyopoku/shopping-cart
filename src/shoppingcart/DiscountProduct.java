package shoppingcart;

/**
 * This class represents the DiscountProduct object
 * An Order consist of a discountRate
 *
 * @author SETRIAKOR
 */
public class DiscountProduct extends Product {

    private double discountRate;

    public DiscountProduct() {
    }

    public DiscountProduct(double discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * @return the discountRate
     */
    public double getDiscountRate() {
        return discountRate;
    }


    /**
     * @param discountRate the discountRate to set
     */
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public int getUnitPrice() {
        return super.getUnitPrice();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
