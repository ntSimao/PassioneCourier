package Factory.tool;

import Entity.tool.Device;
import Factory.tool.DeviceFactory;
import org.junit.Assert;
import org.junit.Test;

public class DeviceFactoryTest {

    @Test
    public void createDevice() {
        Device myDevice = DeviceFactory.createDevice("Android");
        String expected = myDevice.getType();
        String actual = myDevice.getType();

        Assert.assertEquals("Creates a Device Object", expected,actual);

    }
}