package factory;

import Entity.Product;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFactoryTest {

    @Test
    public void createProduct() {
        Product product = ProductFactory.createProduct("Galaxy S9", "Cellphone", "mobile device");
        //Assert.assertEquals(null, product.getProduct_ID());
        System.out.println(product);
    }
}
