package service.user;

import Entity.user.Driver;
import service.IService;

import java.util.Set;

public interface DriverServiceInterface extends IService<Driver, Integer> {
    Set<Driver> getAll();
}
