package com.smlsnnshn.repository;

import com.smlsnnshn.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer> {

}