package com.PassioneCourier.group2.service.user.service;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.repository.user.HelperRepositoryInterface;
//import com.PassioneCourier.group2.repository.user.implementation.HelperRepository;
import com.PassioneCourier.group2.service.user.HelperServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HelperService implements HelperServiceInterface {

    @Autowired
    private HelperRepositoryInterface helperRepositoryInterface;

    //public static HelperServiceInterface helperServiceInterface = null;

    /*private HelperService(){

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
        //return helperRepositoryInterface.findAll().stream().collect(Collectors.toSet());
        return new HashSet<>(helperRepositoryInterface.findAll());
    }

    @Override
    public Helper create(Helper t) {
        //
        return this.helperRepositoryInterface.save(t);
    }

    @Override
    public Helper read(String myID) {

        return this.helperRepositoryInterface.findById(Integer.valueOf(myID)).orElseGet(null);
    }

    @Override
    public Helper update(Helper t) {

        if (this.helperRepositoryInterface.existsById(Integer.valueOf(t.getHelperID()))){

            return this.helperRepositoryInterface.save(t);
        }
        else
            return null;
    }


    @Override
    public boolean delete(String myID) {

        this.helperRepositoryInterface.deleteById(Integer.valueOf(myID));
        if (this.helperRepositoryInterface.existsById(Integer.valueOf(myID))){
            return false;
        }
        else return true;
    }
}
