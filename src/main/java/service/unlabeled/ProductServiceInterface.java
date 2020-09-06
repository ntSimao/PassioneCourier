package service.unlabeled;

import Entity.unlabeled.Product;
import service.IService;
import java.util.Set;

public interface ProductServiceInterface extends IService<Product, Integer> {
    Set<Product> getAll();

    //unique business logic
}
