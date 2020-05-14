package com.bus.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.admin.model.BusRoutes;

@Repository
public interface BusAdminRepository extends JpaRepository<BusRoutes, Integer> {

}
