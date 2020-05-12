package com.ivan.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DongTai implements Serializable {
    private Integer id;
    private String title;
    private Date time;
}
