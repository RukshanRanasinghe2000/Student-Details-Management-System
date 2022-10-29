package com.student.StudentDetailsManagementSystem.Controller;

import com.student.StudentDetailsManagementSystem.Entity.Image;
import com.student.StudentDetailsManagementSystem.Entity.Student;
import com.student.StudentDetailsManagementSystem.Service.ImageService;
import com.student.StudentDetailsManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/StudentDetailsManagementSystem/server/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("students")
    public List<Student> get(){return studentService.getAll();}

    @GetMapping("student/id/{studentId}")
    public Student getById(@PathVariable String studentId){return studentService.getById(studentId);}
}

