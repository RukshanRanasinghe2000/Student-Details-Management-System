package com.student.StudentDetailsManagementSystem.Service;

import com.student.StudentDetailsManagementSystem.Dao.GederDao;
import com.student.StudentDetailsManagementSystem.Entity.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GenderService {
    @Autowired
    private GederDao gederDao;

    public List<Gender> getAll(){
        List<Gender> genderList = gederDao.findAll();
        return genderList;
    }

}
