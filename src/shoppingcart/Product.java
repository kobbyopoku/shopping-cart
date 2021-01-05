package shoppingcart;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
