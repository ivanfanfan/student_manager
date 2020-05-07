package com.ivan.controller;

import com.ivan.entity.Student;
import com.ivan.service.StudentService;
import entity.Result;
import entity.StatusCode;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:8080")
public class StudentController {
    @Resource
    StudentService studentService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/students")
    public Result selectList(){
        List<Student> studentList = studentService.selectList();
        return new Result(true, StatusCode.OK,"查询成功",studentList);
    }

    /**
     * 添加学生 注册学生
     * @param student
     * @return
     */
    @PostMapping("/student")
    public Result addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /**
     * 登陆使用1身份证 或者 2手机号码

     * @return
     */
    @PostMapping("/login")
    public Result loginStudent(@RequestBody JSONObject jsonParam
    ){
        String username = jsonParam.get("username").toString();
        String  id = jsonParam.get("id").toString();
        String password =jsonParam.get("password").toString();
        //用身份证登陆
            if (id.equals("1")){
              Student student =studentService.selectByCard(username);
              if(student.getPassword().equals(password)){
                  return new Result(true,StatusCode.OK,"登陆成功");//这里之后可以增加token
              }
            }
            //用手机登陆
            else{
                Student student =studentService.selectByPho(username);
                if(student.getPassword().equals(password)){
                    return new Result(true,StatusCode.OK,"登陆成功");//这里之后可以增加token
                }
            }
            return null;
    }

    /**
     * 报名
     * @return
     */
    @PutMapping("/english")
    public Result setEnglishId(@RequestBody JSONObject jsonParam){
        String username = jsonParam.get("username").toString();
        String  id = jsonParam.get("id").toString();
        Student student =studentService.selectByCard(username);
        int i = Integer.parseInt(id);
        student.setEnId(i);
        studentService.addEnglishId(student);
        return  new Result(true,StatusCode.OK,"报名成功");
    }


}
