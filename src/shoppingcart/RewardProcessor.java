package shoppingcart;

import java.util.HashSet;

public class RewardProcessor {

    private HashSet<Product> products = new HashSet<>();

    public boolean addProduct(Product p){
        return products.add(p);
    };

    public int rewardPoint(Cart c){
        return c.getOrders().get(1).getQuantity();
    };
}
