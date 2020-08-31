package repository.unlabeled.implementation;

import Entity.unlabeled.CourierHistory;
import Factory.unlabeled.CourierHistoryFactory;
import repository.unlabeled.CourierHistoryRepositoryInterface;

import java.util.HashSet;
import java.util.Set;

public class CourierHistoryRepository implements CourierHistoryRepositoryInterface {

    private Set<CourierHistory> courierHistoryDB;

    public CourierHistoryRepository() {
        this.courierHistoryDB = new HashSet<>();
    }

    @Override
    public Set<CourierHistory> getAll() {
        return this.courierHistoryDB;
    }

    @Override
    public CourierHistory create(CourierHistory t) {
        this.courierHistoryDB.add(t);
        return t;
    }

    @Override
    public CourierHistory read(Character myID) {
        CourierHistory courierHistory = null;
        for (CourierHistory c : this.courierHistoryDB){
            courierHistory = c;
            break;
        }
        return courierHistory;
    }

    @Override
    public CourierHistory update(CourierHistory t) {
        CourierHistory oldCourierHistory = read(t.getName());
        if (oldCourierHistory != null){
            this.courierHistoryDB.remove(oldCourierHistory);
            this.courierHistoryDB.add(t);
        }
        return t;
    }

    @Override
    public void delete(Character myID) {
        CourierHistory courierHistory = read(myID);
        if (courierHistory != null) this.courierHistoryDB.remove(courierHistory);

    }
}
