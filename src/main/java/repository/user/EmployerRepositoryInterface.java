package repository.user;

import Entity.user.Employer;
import repository.IRepository;

import java.util.Set;

public interface EmployerRepositoryInterface extends IRepository <Employer, Integer>  {
    Set<Employer> getAll();
}
