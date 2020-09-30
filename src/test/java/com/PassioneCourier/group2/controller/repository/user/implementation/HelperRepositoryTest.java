package com.PassioneCourier.group2.controller.repository.user.implementation;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.Factory.user.HelperFactory;
import com.PassioneCourier.group2.repository.user.implementation.HelperRepository;
import org.junit.Test;
import com.PassioneCourier.group2.repository.user.HelperRepositoryInterface;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HelperRepositoryTest {

    private static HelperRepositoryInterface helperRepository = HelperRepository.getHelperRepo();

    Helper helper = HelperFactory.createHelper(
            1,
            "Jon Smae",
            "02182004747",
            "realjon@com.com",
            "Streety street",
            "Jony5",
            "****",
            true,
            LocalDate.of(1990, 11, 17));


    @Test
    public void create() {

        Helper helper1 = helperRepository.create(helper);
        assertEquals(helper.getHelperID(), helper1.getHelperID());
        System.out.println(helper1.toString());
    }

    @Test
    public void read() {

        Helper helperFind = helperRepository.read(helper.getHelperID());
        System.out.println(helperFind);
    }

    @Test
    public void update() {

        Helper helperUpdate = new Helper.Builder().copy(helper).setName("Johaan").build();
        helperUpdate = helperRepository.update(helperUpdate);
        System.out.println(helperUpdate + "\n");

    }

    @Test
    public void delete() {

        helperRepository.delete(helper.getHelperID());
    }

    @Test
    public void getAll() {
        System.out.println("All Helpers: ");
        helperRepository.getAll();
    }
}