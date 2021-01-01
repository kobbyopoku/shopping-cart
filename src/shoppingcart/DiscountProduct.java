package shoppingcart;

public class DiscountProduct extends Product {

    private double discountRate;

    public DiscountProduct() {
    }

    public DiscountProduct(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

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
