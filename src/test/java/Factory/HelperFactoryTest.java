package Factory;

import Entity.Helper;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class HelperFactoryTest {

    @Test
    public void createHelper() {

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

        assertEquals(1, helper.getHelperID());
        assertEquals("Jon Smae", helper.getName());
        assertEquals("02182004747", helper.getMobile());
        assertEquals("realjon@com.com", helper.getEmail());
        assertEquals("Streety street", helper.getAddress());
        assertEquals("Jony5", helper.getUserName());
        assertEquals("****", helper.getPassword());
        assertTrue(helper.isIncome());
        assertEquals(LocalDate.of(1990, 11, 17), helper.getDOB());

    }
}