package com.student.StudentDetailsManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "student")

public class Student {

    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String dob;
    @Column
    private String address;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String image_id;
    @Column
    private String gender_id;


}
