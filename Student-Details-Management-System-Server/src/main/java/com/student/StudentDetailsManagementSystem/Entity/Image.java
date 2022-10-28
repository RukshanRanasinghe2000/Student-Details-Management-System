package com.student.StudentDetailsManagementSystem.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "photo")

public class Image {

    @Id
//    @Column(name = 'id')
    private Integer id;

    @Column(name = "image", unique = false, nullable = false, length = 100000)
    private byte[] image;





}
