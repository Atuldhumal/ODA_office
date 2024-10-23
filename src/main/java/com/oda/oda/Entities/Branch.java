package com.oda.oda.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "oda_mst_branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int branch_id;
    @Column(name = "branch_name")
    private String name;
    private boolean active_flag= true;
    @Column(name = "branch_address")
    private String address;
    @Column(name = "branch_Contact_no")
    private String Contact_no;
    

}
