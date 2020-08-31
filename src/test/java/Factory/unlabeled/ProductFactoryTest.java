package Factory.unlabeled;

import Entity.unlabeled.Product;
import org.junit.Test;

public class ProductFactoryTest {

    @Test
    public void createProduct() {
        Product product = ProductFactory.createProduct("Galaxy S9", "Cellphone", "Samsung");
        System.out.println(product);
    }
}
