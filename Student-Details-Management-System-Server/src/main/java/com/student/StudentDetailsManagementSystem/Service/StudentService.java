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

    public List <Student> getByIndex(String studentIndex){
        List<Student> student = studentDao.getByIndex(studentIndex);
        return student;
    }

    public List<Student> getByName(String studentName){
        List <Student> studentList = studentDao.getByName(studentName);
        return studentList;
    }

    public  List <Student> getByGender(String studentGender){
        List <Student> student = studentDao.getByGender(studentGender);
        return student;
    }

    public List<Student> getByNameIndexGender(String studentName, String index_no,  String studentGender) {
        List<Student> student = studentDao.getByNameIndexGender(studentName, index_no, studentGender);
        System.out.println(studentName+ index_no+ studentGender);
        return student;
    }


    public void save(Student student) {
        studentDao.save(student);
    }
}
