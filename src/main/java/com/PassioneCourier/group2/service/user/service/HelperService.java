package com.PassioneCourier.group2.service.user.service;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.repository.user.HelperRepositoryInterface;
import com.PassioneCourier.group2.repository.user.implementation.HelperRepository;
import com.PassioneCourier.group2.service.user.HelperServiceInterface;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HelperService implements HelperServiceInterface {

    public static HelperServiceInterface helperServiceInterface = null;
    private HelperRepositoryInterface helperRepositoryInterface;

    public HelperService(){
        //
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
        //
        return helperRepositoryInterface.getAll();
    }

    @Override
    public Helper create(Helper t) {
        //
        return helperRepositoryInterface.create(t);
    }

    @Override
    public Helper read(Integer myID) {
        //
        return helperRepositoryInterface.read(myID);
    }

    @Override
    public Helper update(Helper t) {
        //
        return helperRepositoryInterface.update(t);
    }

    @Override
    public boolean delete(String myID) {
        //
        return helperRepositoryInterface.delete(myID);
    }
}
