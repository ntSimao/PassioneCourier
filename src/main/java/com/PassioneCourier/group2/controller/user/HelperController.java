package com.PassioneCourier.group2.controller.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.service.user.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class HelperController {

    @Autowired
    private HelperService helperService;

    @RequestMapping("/helper")
    public Set<Helper> getAll() {

        return helperService.getAll();
    }

    @RequestMapping("/helper/{iD}")
    public Helper read(@PathVariable Integer iD){
        return helperService.read(iD);
    }

    @RequestMapping(value = "/helper/create", method = RequestMethod.POST)
    public Helper create(@RequestBody Helper h){

        return helperService.create(h);
    }
    @RequestMapping(value = "/helper", method = RequestMethod.PUT)
    public Helper update(@RequestBody Helper u){

        return helperService.update(u);
    }
    @RequestMapping(value = "/helper/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Integer d){

        return helperService.delete(d);
    }
}
