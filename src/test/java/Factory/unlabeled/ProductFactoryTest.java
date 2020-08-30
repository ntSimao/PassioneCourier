package Factory.unlabeled;

import Entity.unlabeled.Product;
import org.junit.Test;

public class ProductFactoryTest {

    @Test
    public void createProduct() {
        Product product = ProductFactory.createProduct("Galaxy S9", "Cellphone", "mobile device");
        //Assert.assertEquals(null, product.getProduct_ID());
        System.out.println(product);
    }
}
