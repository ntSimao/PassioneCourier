package service.user;

import Entity.user.Helper;
import service.IService;

import java.util.Set;

public interface HelperServiceInterface extends IService<Helper, Integer> {

    Set<Helper> getAll();
}
