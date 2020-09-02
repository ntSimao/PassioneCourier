package repository.unlabeled.implementation;

import Entity.unlabeled.Destination;
import repository.IRepository;

import java.util.Set;

public interface DestinationRepositoryInterface extends IRepository<Destination, String> {
    Set<Destination> getAll();
}