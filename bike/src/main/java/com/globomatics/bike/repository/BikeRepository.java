package com.globomatics.bike.repository;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
    Bike findById(long id);
}
