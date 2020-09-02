package service.user;

import Entity.user.Employer;
import service.IService;

import java.util.Set;

public interface EmployerServiceInterface extends IService<Employer,String> {
    Set<Employer> getAll();
}
