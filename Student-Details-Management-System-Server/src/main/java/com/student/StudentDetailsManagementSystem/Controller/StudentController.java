package com.student.StudentDetailsManagementSystem.Controller;

import com.student.StudentDetailsManagementSystem.Entity.Image;
import com.student.StudentDetailsManagementSystem.Entity.Student;
import com.student.StudentDetailsManagementSystem.Service.ImageService;
import com.student.StudentDetailsManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/StudentDetailsManagementSystem/server/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("students")
    public List<Student> get(){return studentService.getAll();}

    @GetMapping("students/id/{studentId}")
    public Student getById(@PathVariable String studentId){return studentService.getById(studentId);}

    @GetMapping("students/index/{studentIndex}")
    public  List<Student> getByIndex(@PathVariable String studentIndex){return studentService.getByIndex(studentIndex);}

    @GetMapping("students/name/{studentName}")
    public List<Student> getByName(@PathVariable String studentName){return  studentService.getByName(studentName);}

    @GetMapping("students/gender/{studentGender}")
    public  List <Student> getByGender(@PathVariable String studentGender){return studentService.getByGender(studentGender);}

    @GetMapping("students/getAll/{studentName}/{studentIndex}/{studentGender}")
    public  List <Student> getByNameIndexGender(@PathVariable String studentName,@PathVariable String studentIndex,@PathVariable String studentGender){
        return studentService.getByNameIndexGender(studentName,studentIndex,studentGender);
    }

    @PostMapping("students")
    public  void  save(@Valid @RequestBody Student student ){
//        Student stu = new Student();
//        stu.setName(student.getName());
//        stu.setIndex(student.getIndex());
//        stu.setDob(student.getDob());
//        stu.setEmail(student.getEmail());
//        stu.setMobile(student.getMobile());
//        stu.setAddress(student.getAddress());
//        stu.setGender(student.getGender());
        studentService.save(student);


    }

}

