package service.user.service;

import Entity.user.Helper;
import repository.user.HelperRepositoryInterface;
import repository.user.implementation.HelperRepository;
import service.user.HelperServiceInterface;

import java.util.Set;

/*

** Errors with getHelper Service, uncertain as to why.

public class HelperService implements HelperRepositoryInterface{

    private static HelperServiceInterface serviceInterface = null;
    private HelperRepositoryInterface repositoryInterface;

    private HelperService(){ this.repositoryInterface = HelperRepository.getHelperRepo();}

    public static HelperServiceInterface getHelperService(){

        if (serviceInterface == null) {
            serviceInterface = new HelperService();
        }
        return serviceInterface;
    }
*/
public class HelperService implements HelperServiceInterface {

    public static HelperServiceInterface helperServiceInterface = null;
    private HelperRepositoryInterface helperRepositoryInterface;

    public HelperService(){
        this.helperRepositoryInterface = HelperRepository.getHelperRepo();
    }

    public static HelperServiceInterface getEmployerService(){
        if(helperServiceInterface == null){
            helperServiceInterface = new HelperService();
        }
        return helperServiceInterface;
    }


    @Override
    public Set<Helper> getAll() {
        return helperRepositoryInterface.getAll();
    }

    @Override
    public Helper create(Helper t) {
        return helperRepositoryInterface.create(t);
    }

    @Override
    public Helper read(Integer myID) {
        return helperRepositoryInterface.read(myID);
    }

    @Override
    public Helper update(Helper t) {
        return helperRepositoryInterface.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return helperRepositoryInterface.delete(myID);
    }
}
