package com.PassioneCourier.group2.repository.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepositoryInterface extends JpaRepository<Route, Integer> {
    void deleteById(String myID);

    boolean existsById(String myID);
}