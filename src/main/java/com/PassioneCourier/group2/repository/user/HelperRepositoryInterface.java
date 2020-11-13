package com.PassioneCourier.group2.repository.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface HelperRepositoryInterface extends JpaRepository<Helper, Integer> {

    Set<Helper> getAll();

}
