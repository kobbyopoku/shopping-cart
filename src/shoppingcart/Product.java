package shoppingcart;

/**
 * This class represents the Product object
 * An Order consist of a productCode, description and unitPrice
 *
 * @author SETRIAKOR
 */

import java.util.Objects;

public class Product extends RewardProcessor implements Comparable<Product> {

    private String productCode;
    private String description;
    private int unitPrice;


    public Product() {
    }

    public Product(String productCode, String description, int unitPrice) {
        this.productCode = productCode;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the unitPrice
     */
    public int getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getUnitPrice() == product.getUnitPrice() && Objects.equals(getProductCode(), product.getProductCode()) && Objects.equals(getDescription(), product.getDescription());
    }

    @Override
    public int compareTo(Product product) {
        return 0;
    }

    /**
     * Returns a textual representation of the product.
     *
     * @return a textual representation of the product.
     */

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
