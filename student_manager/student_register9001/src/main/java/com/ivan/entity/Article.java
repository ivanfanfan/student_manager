package com.ivan.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Article implements Serializable {
    private Integer id;
    private String title;
    private String content;
}
