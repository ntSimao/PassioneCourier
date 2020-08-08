package Factory;

import Entity.Employer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployerFactoryTest {

    @Test
    public void createEmployer() {
        Employer myEmployer = EmployerFactory.createEmployer("Oscar", "Steven");
        String lastNam = myEmployer.getLastName();
        String firstNam = myEmployer.getFirstName();
        String expected = lastNam + firstNam;
        String actual = lastNam + firstNam;

        Assert.assertEquals("Creates a Employer Object", expected,actual);


    }
}