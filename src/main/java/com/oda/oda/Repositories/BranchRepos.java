package com.oda.oda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oda.oda.Entities.Branch;

@Repository
public interface BranchRepos extends JpaRepository <Branch,Integer> {

}
