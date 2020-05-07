package com.ivan.entity;

import java.io.Serializable;

/**
 * (StScore)实体类
 *
 * @author makejava
 * @since 2020-05-07 08:26:52
 */
public class StScore implements Serializable {
    private static final long serialVersionUID = -96589151576880056L;
    
    private Integer stId;
    
    private Integer enId;
    
    private Integer writtenScore;
    
    private Integer oralScore;
    
    private Integer score;

    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }



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

    public Integer getWrittenScore() {
        return writtenScore;
    }

    public void setWrittenScore(Integer writtenScore) {
        this.writtenScore = writtenScore;
    }

    public Integer getOralScore() {
        return oralScore;
    }

    public void setOralScore(Integer oralScore) {
        this.oralScore = oralScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}