package com.ivan.controller;

import com.ivan.entity.StScore;
import com.ivan.entity.Student;
import com.ivan.service.StScoreService;
import com.ivan.service.StudentService;
import entity.Result;
import entity.StatusCode;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:8080")
public class StScoreController {
    @Resource
    StScoreService stScoreService;
    @Resource
    StudentService studentService;

    @PostMapping("/query")
    public Result getEnglishScore(@RequestBody JSONObject jsonObject){
        String username = jsonObject.get("username").toString();
        String value = jsonObject.get("id").toString();
        String enId = jsonObject.get("enId").toString();
        int en = Integer.parseInt(enId);
        int i = Integer.parseInt(username);

        if(i==1){
            //身份证
            Student student = studentService.selectByCard(value);
            int stId = student.getStId();
            System.out.println(stId+"_-------------"+en);
//            查询出来学生id 然后在 score表中查询出学生分数 返回出去
            StScore stScore = stScoreService.selectById(stId,en);
            return new Result(true, StatusCode.OK,"查询成绩成功",stScore);
        }
        else if (i==2){
            //电话号码
            Student student = studentService.selectByPho(value);
            int stId = student.getStId();
            System.out.println(stId+"_-------------"+en);
            StScore stScore = stScoreService.selectById(stId,en);

            return new Result(true, StatusCode.OK,"查询成绩成功",stScore);
        }
        else {
            //邮箱
        }
        return null;
    }
}
