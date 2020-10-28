package com.PassioneCourier.group2.repository.user;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface DriverRepositoryInterface extends JpaRepository<Driver,String>{

}
