package com.oda.oda.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oda_trn_student_registration_details")
public class StudentRegistration {

    @Id
    private int Student_id;

    private String attendance_id;

    private String firstname;

    private String lastname;

    private String address;

    private String email;

    private String phoneno;

    private String parents_phoneno;

    private int branch_id;

    private int Batch_id;

    private String about;

    @Column(name = "profile_pic_path")
    private String Profile_pic;

    private boolean active_status;

}
