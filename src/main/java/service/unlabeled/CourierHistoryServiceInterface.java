package service.unlabeled;

import Entity.unlabeled.CourierHistory;
import service.IService;

import java.util.Set;

public interface CourierHistoryServiceInterface extends IService<CourierHistory, Integer> {
    Set<CourierHistory> getAll();

    //unique business logic
}
