package service.user.service;

import Entity.user.Driver;
import repository.user.DriverRepositoryInterface;
import repository.user.implementation.DriverRepository;
import service.user.DriverServiceInterface;

import java.util.Set;

public class DriverService implements DriverServiceInterface {
    public static DriverServiceInterface service = null;
    private DriverRepositoryInterface repo;

    public DriverService(){
        this.repo = DriverRepository.getRepo();
    }

    public static DriverServiceInterface getService(){
        if(service==null){
            service = new DriverService();

        }
        return service;
    }
    @Override
    public Set<Driver> getAll() {
        return this.getAll();
    }

    @Override
    public Driver create(Driver t) {
        return this.create(t);
    }

    @Override
    public Driver read(Integer myID) {
        return this.read(myID);
    }

    @Override
    public Driver update(Driver t) {
        return this.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return this.repo.delete(myID);
    }
}
