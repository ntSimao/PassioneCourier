package com.PassioneCourier.group2.controller.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.service.user.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/helper")
public class HelperController {

    @Autowired
    private HelperService helperService;

    public String welcome(){
    return "helper.. welcome";
    }


    @RequestMapping(value = "/read/{iD}", method = RequestMethod.GET)
    public Helper read(@PathVariable Integer iD){
        return helperService.read(iD);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Helper create(@RequestBody Helper h){

        return helperService.create(h);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Helper update(@RequestBody Helper u){

        return helperService.update(u);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Set<Helper> getAll() {

        return helperService.getAll();
    }

    @RequestMapping(value = "/helper/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Integer d){

        return helperService.delete(d);
    }
}
