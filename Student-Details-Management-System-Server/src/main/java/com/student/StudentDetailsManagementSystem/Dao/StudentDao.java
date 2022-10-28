package com.student.StudentDetailsManagementSystem.Dao;

import com.student.StudentDetailsManagementSystem.Entity.Image;
import com.student.StudentDetailsManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDao extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student where id=?1",nativeQuery = true)
    Student getById(String studentId);
}
