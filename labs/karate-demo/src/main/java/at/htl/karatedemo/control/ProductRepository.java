package at.htl.karatedemo.control;

import at.htl.karatedemo.entity.Product;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductRepository {

    private Product product;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
