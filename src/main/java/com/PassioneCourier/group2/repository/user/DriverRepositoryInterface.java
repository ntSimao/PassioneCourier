package com.PassioneCourier.group2.repository.user;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DriverRepositoryInterface extends JpaRepository<Driver,Integer>{

}
