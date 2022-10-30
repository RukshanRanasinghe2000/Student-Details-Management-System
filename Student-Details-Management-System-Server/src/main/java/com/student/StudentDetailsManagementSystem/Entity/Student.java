package com.student.StudentDetailsManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

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
    @Column(name = "index_no")
    private String index;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private String dob;
    @Column(name = "address")
    private String address;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "email")
    private String email;

    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    @OneToOne
    private Image image;

    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    @ManyToOne
    private Gender gender;


}
