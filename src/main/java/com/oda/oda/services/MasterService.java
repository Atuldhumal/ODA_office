package com.oda.oda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oda.oda.Entities.BatchMaster;
import com.oda.oda.Entities.Branch;
import com.oda.oda.Repositories.BatchRepo;
import com.oda.oda.Repositories.BranchRepos;

@Service
public class MasterService {

    @Autowired
    BatchRepo batchRepo;

    @Autowired
    BranchRepos branchRepos;

public List<BatchMaster>  getallbatchdetails(){
    return  batchRepo.findAll();
}

public List<Branch>  getallbranchdetails(){
    return  branchRepos.findAll();
}


}
