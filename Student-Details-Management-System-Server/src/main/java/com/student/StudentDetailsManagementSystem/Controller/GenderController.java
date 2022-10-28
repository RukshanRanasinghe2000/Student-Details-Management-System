package com.student.StudentDetailsManagementSystem.Controller;

import com.student.StudentDetailsManagementSystem.Entity.Gender;
import com.student.StudentDetailsManagementSystem.Service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/StudentDetailsManagementSystem/server")
public class GenderController {
    @Autowired
    private GenderService genderService;

    @GetMapping("genders")
    public List<Gender> get(){return genderService.getAll();}
}
