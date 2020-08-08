package Factory;

import Entity.Device;
import java.util.Random;

public class DeviceFactory {

    public static Device createDevice(String typ){
        Random rand = new Random();
        int myDeviceID = rand.nextInt(999999999);
        Device myDevice = new Device.DeviceBuilder().setDeviceID(myDeviceID).setDeviceType(typ).build();
        return myDevice;
    }
}
