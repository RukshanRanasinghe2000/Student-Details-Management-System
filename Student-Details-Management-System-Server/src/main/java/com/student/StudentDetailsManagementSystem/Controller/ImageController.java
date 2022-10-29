package com.student.StudentDetailsManagementSystem.Controller;

import com.student.StudentDetailsManagementSystem.Entity.Gender;
import com.student.StudentDetailsManagementSystem.Entity.Image;
import com.student.StudentDetailsManagementSystem.Service.GenderService;
import com.student.StudentDetailsManagementSystem.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/StudentDetailsManagementSystem/server/")
public class ImageController {
    @Autowired
    private ImageService imageServiceService;

    @GetMapping("images")
    public List<Image> get(){return imageServiceService.getAll();}
//    @GetMapping("images/id/{imageid}")
}
