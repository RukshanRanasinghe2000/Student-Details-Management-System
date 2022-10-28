package com.student.StudentDetailsManagementSystem.Dao;

import com.student.StudentDetailsManagementSystem.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image, Integer> {
}
