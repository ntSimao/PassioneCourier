package com.PassioneCourier.group2.controller.unlabeled;


import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.Factory.unlabeled.RouteFactory;
import com.PassioneCourier.group2.service.unlabeled.implementation.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @PostMapping("/create")
    public Route create(@RequestBody Route route){
        Route newRoute = RouteFactory.createRoute(route.getRoute_id(), route.getProduct_id(), route.getFrom_location_id(), route.getTo_location_id(), route.getPrice(), route.getDays());
        return routeService.create(newRoute);
    }
    @GetMapping("/read/{id}")
    public Route read(@PathVariable Integer id){
        return routeService.read(id);
    }
    @PostMapping("/update")
    public Route update(@RequestBody Route route){ return routeService.update(route); }
    @GetMapping("/all")
    public Set<Route> getAll(){
        return routeService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Integer id){ return routeService.delete(id.toString()); }
}
