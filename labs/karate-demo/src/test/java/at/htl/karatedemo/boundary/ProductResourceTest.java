package at.htl.karatedemo.boundary;

import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ProductResourceTest {

    @Karate.Test
    Karate product_crud_in_productEndpointTest() {
        return Karate.run("products").relativeTo(getClass());
    }
}