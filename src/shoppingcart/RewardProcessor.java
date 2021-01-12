package shoppingcart;


import java.util.HashSet;

/**
 * This class represents the RewardProcessor object
 * An Order consist of a products
 *
 * @author SETRIAKOR
 */
public class RewardProcessor {


    private HashSet<Product> products = new HashSet<Product>();

    public HashSet<Product> getProducts() {
        return products;
    }

    public void setProducts(HashSet<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product p) {
        return products.add(p);
    }

    ;

    public int rewardPoint(Cart cart) {
        final int[] rp = {0};
            cart.getOrders().forEach(cartProducts -> {
                products.forEach(rewardProcessorProduct -> {
                Product productInCart = cartProducts.getProduct();
                if (productInCart.equals(rewardProcessorProduct)) {
                    rp[0] = rp[0] + cartProducts.getQuantity();
                }
            });
        });
        return rp[0];
    }
}
