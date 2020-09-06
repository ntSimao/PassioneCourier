package service.unlabeled.implementation;

import Entity.unlabeled.CourierHistory;
import repository.unlabeled.CourierHistoryRepositoryInterface;
import repository.unlabeled.implementation.CourierHistoryRepository;
import service.unlabeled.CourierHistoryServiceInterface;

import java.util.Set;

public class CourierHistoryService implements CourierHistoryServiceInterface {

    private static CourierHistoryServiceInterface serviceInterface = null;
    private CourierHistoryRepositoryInterface repositoryInterface;

    private CourierHistoryService() {
        this.repositoryInterface = CourierHistoryRepository.getMyCourierHistoryRepository();
    }

    public static CourierHistoryServiceInterface getServiceInterface() {
        if (serviceInterface == null) serviceInterface = new service.unlabeled.implementation.CourierHistoryService();
        return serviceInterface;
    }

    @Override
    public Set<CourierHistory> getAll() {
        return this.repositoryInterface.getAll();
    }

    @Override
    public CourierHistory create(CourierHistory t) {
        return this.repositoryInterface.create(t);
    }

    @Override
    public CourierHistory read(Integer myID) {
        return null; //this.repositoryInterface.read(myID);
    }

    @Override
    public CourierHistory update(CourierHistory t) {
        return this.repositoryInterface.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return false; //return this.repositoryInterface.delete(myID);
    }
}
