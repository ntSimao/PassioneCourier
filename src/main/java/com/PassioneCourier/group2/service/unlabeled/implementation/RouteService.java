package com.PassioneCourier.group2.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.repository.unlabeled.RouteRepositoryInterface;
import com.PassioneCourier.group2.service.unlabeled.RouteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RouteService implements RouteServiceInterface {

    @Autowired
    private RouteRepositoryInterface repositoryInterface;

    @Override
    public Route create(Route t) {
        return this.repositoryInterface.save(t);
    }

    @Override
    public Route read(Integer myID) {
        return this.repositoryInterface.findById(myID).orElseGet(null);
    }

    @Override
    public Route update(Route t) {
        if(this.repositoryInterface.existsById(t.getRoute_id())) {
            return this.repositoryInterface.save(t);
        }
        return null;
    }

    @Override
    public boolean delete(String myID) {
        this.repositoryInterface.deleteById(myID);
            if(this.repositoryInterface.existsById(myID)) return false;
            else return true;
    }

    @Override
    public Set<Route> getAll() {
        return this.repositoryInterface.findAll().stream().collect(Collectors.toSet());
    }
}
