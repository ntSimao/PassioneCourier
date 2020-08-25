package repository.tool.implementation;

import Entity.tool.Device;
import Factory.tool.DeviceFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import repository.tool.DeviceRepositoryInterface;
import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeviceRepositoryTest {
    public static DeviceRepositoryInterface myRepository = DeviceRepository.getMyDeviceRepository();
    private static Device myDevice = DeviceFactory.createDevice("Android");

    @Test
    public void a_create() {
        Device device00 = myRepository.create(myDevice);
        assertEquals(myDevice.getDevice_ID(), device00.getDevice_ID());
    }

    @Test
    public void b_read() {
        Device device01 = myRepository.read(myDevice.getDevice_ID());
        assertEquals(myDevice.getDevice_ID(), device01.getDevice_ID());
    }

    @Test
    public void c_update() {
        Device device02 = new Device.DeviceBuilder().copy(myDevice).setDeviceType("Windows Phone").build();
        device02 = myRepository.update(device02);
        assertEquals(myDevice.getDevice_ID(), device02.getDevice_ID());
        assertNotEquals(myDevice.getDevice_ID(), device02.getDevice_ID());
    }

    @Test
    public void d_delete() {
        myRepository.delete(myDevice.getDevice_ID());
    }
}