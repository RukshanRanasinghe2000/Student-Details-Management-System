package com.student.StudentDetailsManagementSystem.Entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "student")

public class Student {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "index_no")
    @Pattern(regexp = "^[s|S][0-9]{4}$")
    private String index;
    @Column(name = "name")
    @Pattern(regexp = "^[a-zA-Zs]+$")
    private String name;
    @Column(name = "dob")
    private String dob;
    @Column(name = "address")
    private String address;
    @Column(name = "mobile")
    @Pattern(regexp = "^[0][7][0-9][0-9]{7}$")
    private String mobile;
    @Column(name = "email")
    @Pattern(regexp = "^[a-z0-9]+[@][a-z]+.[a-z]+$")
    private String email;

    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    @OneToOne
    private Image image;

    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    @ManyToOne
    private Gender gender;


}
