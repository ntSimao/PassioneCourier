package repository.unlabeled;

import Entity.tool.Device;
import Entity.unlabeled.Route;
import repository.IRepository;

import java.util.Set;

public interface RouteRepositoryInterface extends IRepository<Route, Integer> {
    Set<Route> getAll();
}
