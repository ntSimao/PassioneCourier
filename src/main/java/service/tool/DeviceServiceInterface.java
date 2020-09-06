package service.tool;

import Entity.tool.Device;
import service.IService;

import java.util.Set;

public interface DeviceServiceInterface extends IService<Device, Integer> {
    Set<Device> getAll();
}
