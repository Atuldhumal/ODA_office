package com.oda.oda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oda.oda.Entities.BatchMaster;

@Repository
public interface BatchRepo extends JpaRepository<BatchMaster, Integer>{




}
