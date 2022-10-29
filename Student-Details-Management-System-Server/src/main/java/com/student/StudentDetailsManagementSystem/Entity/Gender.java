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
@Table(name = "gender")

public class Gender {

    @Id

    @Column(name = "id")
    private Integer id;
    @Column
    private String name;

}
