package service.user.service;

import Entity.user.Employer;
import repository.user.EmployerRepositoryInterface;
import repository.user.implementation.EmployerRepository;
import service.user.EmployerServiceInterface;

import java.util.Set;

public class EmployerService implements EmployerServiceInterface {

    public static EmployerServiceInterface myService = null;
    private EmployerRepositoryInterface myRepository;

    public EmployerService(){
        this.myRepository = EmployerRepository.getMyEmployerRepository();
    }

    public static EmployerServiceInterface getEmployerService(){
        if(myService == null){
            myService = new EmployerService();
        }
        return myService;
    }


    @Override
    public Set<Employer> getAll() {
        return this.myRepository.getAll();
    }

    @Override
    public Employer create(Employer t) {
        return this.myRepository.create(t);
    }

    @Override
    public Employer read(Integer myID) {
        return this.myRepository.read(myID);
    }

    @Override
    public Employer update(Employer t) {
        return this.myRepository.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return this.myRepository.delete(myID);

    }
}
