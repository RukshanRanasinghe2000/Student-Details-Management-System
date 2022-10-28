package com.student.StudentDetailsManagementSystem.Dao;

import com.student.StudentDetailsManagementSystem.Entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GederDao extends JpaRepository<Gender, Integer> {



}
