package repository.tool.implementation;

import Entity.tool.Device;
import Entity.unlabeled.Route;
import repository.tool.DeviceRepositoryInterface;
import java.util.HashSet;
import java.util.Set;

public class DeviceRepository implements DeviceRepositoryInterface {

    private Set<Device> devDatabase;

    private static DeviceRepositoryInterface myDeviceRepository = null;
    private DeviceRepository() {
        this.devDatabase = new HashSet<>();
    }

    public static DeviceRepositoryInterface getMyDeviceRepository(){
        if(myDeviceRepository == null){
            myDeviceRepository = new DeviceRepository();
        }
        return new DeviceRepository();
    }


    @Override
    public Device create(Device t) {
        this.devDatabase.add(t);
        return t;

    }

    @Override
    public Device read(Integer myID) {
        Device myDevice = null;
        for(Device dev: this.devDatabase){
            myDevice = dev;
            break;
        }
        return myDevice;
    }

    @Override
    public Device update(Device t) {
        Device myDeviceOld = read(t.getDevice_ID());
        if(myDeviceOld != null){
            this.devDatabase.remove(myDeviceOld);
            this.devDatabase.add(t);
        }
        return t;
    }

    @Override
    public void delete(Integer myID) {
        Device myDevice = read(myID);
        if(myDevice != null){
            this.devDatabase.remove(myID);
        }
    }
}
