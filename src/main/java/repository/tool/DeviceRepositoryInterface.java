package repository.tool;

import Entity.tool.Device;
import repository.IRepository;

import java.util.Set;

public interface DeviceRepositoryInterface extends IRepository<Device, Integer>  {
    Set<Device> getAll();

}
