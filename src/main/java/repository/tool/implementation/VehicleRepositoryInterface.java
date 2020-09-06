package repository.tool.implementation;

import Entity.tool.Vehicle;
import repository.IRepository;

import java.util.Set;

public interface VehicleRepositoryInterface extends IRepository<Vehicle, Integer> {
    Set<Vehicle> getAll();
}