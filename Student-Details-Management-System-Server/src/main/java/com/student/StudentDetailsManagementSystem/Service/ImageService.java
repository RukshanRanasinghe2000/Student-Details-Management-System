package com.student.StudentDetailsManagementSystem.Service;

import com.student.StudentDetailsManagementSystem.Dao.ImageDao;
import com.student.StudentDetailsManagementSystem.Entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ImageService {
    @Autowired
    private ImageDao imageDao;

    public List<Image> getAll(){
            List<Image> imageList = imageDao.findAll();
            return imageList;
    }
}
