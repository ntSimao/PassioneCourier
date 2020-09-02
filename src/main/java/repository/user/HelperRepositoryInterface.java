package repository.user;

import Entity.user.Helper;
import repository.IRepository;

import java.util.Set;

public interface HelperRepositoryInterface extends IRepository<Helper, Integer> {

    Set<Helper> getAll();

}
