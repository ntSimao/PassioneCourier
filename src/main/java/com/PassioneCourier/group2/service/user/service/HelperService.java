package com.PassioneCourier.group2.service.user.service;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.repository.user.HelperRepositoryInterface;

import com.PassioneCourier.group2.service.user.HelperServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HelperService implements HelperServiceInterface {

    public static HelperServiceInterface helperServiceInterface = null;

    @Autowired
    private HelperRepositoryInterface helperRepositoryInterface;

   /* public HelperService(){
        //
        this.helperRepositoryInterface = HelperRepository.getHelperRepo();
    }

    public static HelperServiceInterface getEmployerService(){
        if(helperServiceInterface == null){
            helperServiceInterface = new HelperService();
        }
        return helperServiceInterface;
    }*/

    @Override
    public Set<Helper> getAll() {
        //
        return helperRepositoryInterface.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Helper create(Helper t) {
        //
        return helperRepositoryInterface.save(t);
    }

    @Override
    public Helper read(String myID) {

        helperRepositoryInterface.findById(Integer.valueOf(myID));
        return null;
    }

    @Override
    public Helper update(Helper t) {
        //
        return helperRepositoryInterface.save(t);
    }

    @Override
    public boolean delete(Integer myID) {

        this.helperRepositoryInterface.deleteById(Integer.valueOf(myID));
        if (this.helperRepositoryInterface.existsById(Integer.valueOf(myID)))
            return false;

        else return true;

    }

}
