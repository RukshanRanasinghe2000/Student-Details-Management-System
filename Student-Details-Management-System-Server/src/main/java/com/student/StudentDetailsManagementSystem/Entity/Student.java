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
    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    @OneToOne
    private Image image;
    @Column
    private String gender_id;


}
