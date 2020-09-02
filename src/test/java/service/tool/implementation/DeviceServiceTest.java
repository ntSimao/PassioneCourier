package service.tool.implementation;

import Entity.tool.Device;
import Entity.user.Employer;
import Factory.tool.DeviceFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import service.tool.DeviceServiceInterface;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeviceServiceTest {

    private static DeviceServiceInterface myService = DeviceService.getDeviceService();
    private static Device myDevice = DeviceFactory.createDevice("Blackberry");





    @Test
    public void a_create() {
        Device myDevice00 = myService.create(myDevice);
        Assert.assertEquals(myDevice.getDevice_ID(), myDevice00.getDevice_ID());
        System.out.println("Device Created: " + myDevice00);
    }

    @Test
    public void b_read() {
        Device myDevice01 = myService.read(myDevice.getDevice_ID());
        System.out.println("Read: " + myDevice01);
    }

    @Test
    public void c_update() {
        Device myDevice02 = new Device.DeviceBuilder().copy(myDevice).setDeviceType("iPhone").build();
        myDevice02 = myService.update(myDevice02);
        System.out.println("Updated: " + myDevice02);
    }

    @Test
    public void d_getAll() {
        Set<Device> myDevices = myService.getAll();
        Assert.assertEquals(1, myDevices.size());
        System.out.println("Get all Results: " + myDevices);
    }

    @Test
    public void e_delete() {
        boolean deleted = myService.delete(myDevice.getDevice_ID());
    }
}