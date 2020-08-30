package repository.user;

import Entity.user.Driver;
import repository.IRepository;

import java.util.Set;

public interface DriverRepositoryInterface extends IRepository<Driver, Integer> {
    Set<Driver> getAll();
}
