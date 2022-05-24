package at.htl.karatedemo.boundary;

import at.htl.karatedemo.control.ProductRepository;
import at.htl.karatedemo.entity.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("products")
public class ProductResource {

    @Inject
    ProductRepository productRepository;

    @GET
    public Response findProduct() {
        return Response.ok(productRepository.getProduct()).build();
    }

    @POST
    public Response createProduct(Product p) {
        this.productRepository.setProduct(p);
        return Response.status(201).build();
    }

}
