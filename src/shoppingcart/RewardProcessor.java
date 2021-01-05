package shoppingcart;

import java.util.HashSet;

public class RewardProcessor {

    private HashSet<Product> products;

    public boolean addProduct(Product p){
        return products.add(p);
    };

    public int rewardPoint(Cart c){
        return c.getOrders().get(1).getQuantity();
    };
}
