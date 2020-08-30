package repository.user.implementation;

import Entity.tool.Device;
import Entity.user.Employer;
import Factory.tool.DeviceFactory;
import Factory.user.EmployerFactory;
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
    public void create() {
        Employer employer00 = myRepository.create(myEmployer);
        assertEquals(myEmployer.getEmployerId(), employer00.getEmployerId());
    }

    @Test
    public void read() {
        Employer employer01 = myRepository.read(myEmployer.getEmployerId());
        assertEquals(myEmployer.getEmployerId(), employer01.getEmployerId());
    }

    @Test
    public void update() {
        Employer employer02 = new Employer.EmployerBuilder().copy(myEmployer).setLastName("Joestar").setFirstName("Joseph").build();
        employer02 = myRepository.update(employer02);
        assertEquals(myEmployer.getEmployerId(), employer02.getEmployerId());
        assertNotEquals(myEmployer.getEmployerId(), employer02.getEmployerId());
    }

    @Test
    public void delete() {
        myRepository.delete(myEmployer.getEmployerId());
    }
}