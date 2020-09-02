package service.tool.implementation;

import Entity.tool.Device;
import repository.tool.DeviceRepositoryInterface;
import repository.tool.implementation.DeviceRepository;
import service.tool.DeviceServiceInterface;

import java.util.Set;

public class DeviceService implements DeviceServiceInterface {

    public static DeviceServiceInterface myService = null;
    private DeviceRepositoryInterface myRepository;

    private DeviceService(){
        this.myRepository = DeviceRepository.getMyDeviceRepository();
    }

    public static DeviceServiceInterface getDeviceService(){
        if(myService == null){
            myService = new DeviceService();
        }
        return myService;
    }

    @Override
    public Set<Device> getAll() {
        return this.myRepository.getAll();
    }

    @Override
    public Device create(Device t) {
        return this.myRepository.create(t);
    }

    @Override
    public Device read(Integer myID) {
        return this.myRepository.read(myID);
    }

    @Override
    public Device update(Device t) {
        return this.myRepository.update(t);
    }

    @Override
    public boolean delete(Integer myID) { return this.myRepository.delete(myID);


    }
}
