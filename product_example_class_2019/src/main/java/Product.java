import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private double productPrice;
    private int productQuant;

    public Product() {
        productId = "";
        productPrice = 0.0;
        productQuant = 0;
    }

    public Product(String productId, double productPrice, int productQuant) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productQuant = productQuant;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuant() {
        return productQuant;
    }

    public void setProductQuant(int productQuant) {
        this.productQuant = productQuant;
    }
}
