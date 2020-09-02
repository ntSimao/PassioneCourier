package repository.user.implementation;

import Entity.tool.Device;
import Entity.user.Employer;
import Factory.tool.DeviceFactory;
import Factory.user.EmployerFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import repository.tool.DeviceRepositoryInterface;
import repository.tool.implementation.DeviceRepository;
import repository.user.EmployerRepositoryInterface;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployerRepositoryTest {

        public static EmployerRepositoryInterface myRepository = EmployerRepository.getMyEmployerRepository();
        private static Employer myEmployer = EmployerFactory.createEmployer("Pucci", "Enrico");

    @Test
    public void a_create() {
        Employer employer00 = myRepository.create(myEmployer);
        Assert.assertEquals(myEmployer.getEmployerId(), employer00.getEmployerId());
        System.out.println("Employer created: " + employer00);
    }

    @Test
    public void b_read() {
        Employer employer01 = myRepository.read(myEmployer.getEmployerId());
        System.out.println("Read: " + employer01);
    }

    @Test
    public void c_update() {
        Employer employer02 = new Employer.EmployerBuilder().copy(myEmployer).setLastName("Joestar").setFirstName("Joseph").build();
        employer02 = myRepository.update(employer02);
        System.out.println("Updated: " + employer02);
    }

    @Test
    public void e_delete() {
        myRepository.delete(myEmployer.getEmployerId());
    }

    @Test
    public void d_getAll() {
        System.out.println("Get all results " + myRepository.getAll());
    }


}

