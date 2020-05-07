package com.ivan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * username(Student)实体类
 *
 * @author makejava
 * @since 2020-05-05 00:06:59
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 798211655500819351L;
    @TableId(type = IdType.AUTO)
    private Integer stId;
    
    private Integer enId;
    
    private String exId;
    
    private Integer clsId;
    
    private String stName;
    
    private String stCardId;
    
    private String stPho;
    
    private String password;
    
    private String email;


    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public String getExId() {
        return exId;
    }

    public void setExId(String exId) {
        this.exId = exId;
    }

    public Integer getClsId() {
        return clsId;
    }

    public void setClsId(Integer clsId) {
        this.clsId = clsId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStCardId() {
        return stCardId;
    }

    public void setStCardId(String stCardId) {
        this.stCardId = stCardId;
    }

    public String getStPho() {
        return stPho;
    }

    public void setStPho(String stPho) {
        this.stPho = stPho;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}