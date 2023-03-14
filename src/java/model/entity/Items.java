package model.entity;

/**
 *
 * @author quang
 */
public class Items {
    private Product product;
    private int ammout;

    public Items() {
    }
    
    public Items(Product product, int ammout) {
        this.product = product;
        this.ammout = ammout;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmmout() {
        return ammout;
    }

    public void setAmmout(int ammout) {
        this.ammout = ammout;
    }

    public double getPrice() {
        return product.getProductPrice() * ammout;
    }
}
