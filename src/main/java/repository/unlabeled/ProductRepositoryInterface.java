package repository.unlabeled;

import Entity.unlabeled.Product;
import repository.IRepository;

import java.util.Set;

public interface ProductRepositoryInterface extends IRepository<Product, Integer> {
    Set<Product> getAll();
}
