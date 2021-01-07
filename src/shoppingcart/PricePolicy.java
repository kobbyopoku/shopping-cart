package shoppingcart;

public interface PricePolicy {
   public int calculateCost(int quantity, int unitPrice);
}
