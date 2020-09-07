package service.unlabeled;

import Entity.unlabeled.Route;
import service.IService;

import java.util.Set;

public interface RouteServiceInterface extends IService <Route, Integer> {
    Set<Route> getAll();
}
