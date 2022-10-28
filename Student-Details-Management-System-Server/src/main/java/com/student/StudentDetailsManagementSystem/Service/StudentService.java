package com.student.StudentDetailsManagementSystem.Service;

import com.student.StudentDetailsManagementSystem.Dao.ImageDao;
import com.student.StudentDetailsManagementSystem.Dao.StudentDao;
import com.student.StudentDetailsManagementSystem.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAll(){
       List<Student> studentList = studentDao.findAll();
        return studentList;
    }
    public Student getById(String studentId){
        Student student = studentDao.getById(studentId);
        return student;
    }

}
