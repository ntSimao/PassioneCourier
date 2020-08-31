package repository.unlabeled;

import Entity.unlabeled.CourierHistory;
import repository.IRepository;

import java.util.Set;

public interface CourierHistoryRepositoryInterface extends IRepository<CourierHistory, Character> {
    Set<CourierHistory> getAll();
}
