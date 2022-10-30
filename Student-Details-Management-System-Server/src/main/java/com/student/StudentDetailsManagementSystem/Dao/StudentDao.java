package com.student.StudentDetailsManagementSystem.Dao;

import com.student.StudentDetailsManagementSystem.Entity.Image;
import com.student.StudentDetailsManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student where id=?1",nativeQuery = true)
    Student getById(String studentId);

    @Query(value = "select * from student where index_no like ?1%",nativeQuery = true)
    List<Student> getByIndex(String studentIndex);

    @Query(value = "select * from student where name like ?1%",nativeQuery = true)
    List<Student> getByName(String studentName);

    @Query(value = "select * from student where gender_id=?1",nativeQuery = true)
    List <Student> getByGender(String studentGender);


}
