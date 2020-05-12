package com.ivan.controller;

import com.ivan.entity.DongTai;
import com.ivan.service.DongTaiService;
import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:8080")
public class DongTaiController {

    @Resource
    private DongTaiService dongTaiService;

    @GetMapping("/dongtai")
    public Result getDongTai(){
        List<DongTai> list = dongTaiService.getAll();
        return new Result(true, StatusCode.OK,"获取动态成功",list);
    }
}
