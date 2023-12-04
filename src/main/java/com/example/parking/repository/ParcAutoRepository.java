package com.example.parking.repository;

import com.example.parking.entity.ParcAuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcAutoRepository extends JpaRepository<ParcAuto,Long> {
}
