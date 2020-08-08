package Factory;

import Entity.Device;
import Entity.Employer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeviceFactoryTest {

    @Test
    public void createDevice() {
        Device myDevice = DeviceFactory.createDevice("Android");
        String expected = myDevice.getType();
        String actual = myDevice.getType();

        Assert.assertEquals("Creates a Device Object", expected,actual);

    }
}