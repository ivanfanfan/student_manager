package com.ivan.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ivan.dao.StudentDao;
import com.ivan.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    StudentDao studentDao;

    public Student selectByCard(String username) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("st_card_id", username);
        Student student = studentDao.selectOne(queryWrapper);
        return student;
    }

    public Student selectByPho(String username) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("st_pho", username);
        Student student = studentDao.selectOne(queryWrapper);
        return student;
    }

    public List<Student> selectList() {
        List<Student> students = studentDao.selectList(null);
        return students;
    }

    public void addStudent(Student student) {
        studentDao.insert(student);
    }

    public void addEnglishId(Student student) {
         studentDao.updateById(student);
    }
}
