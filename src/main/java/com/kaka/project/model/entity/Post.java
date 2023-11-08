package com.kaka.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@TableName(value = "post")
@Data
public class Post implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Integer age;

    private Integer gender;

    private String education;

    private String place;

    private String job;

    private String contact;

    private String loveExp;


    private String content;

    private String photo;

    private Integer reviewStatus;

    private String reviewMessage;

    private Integer viewNum;

    private Integer thumbNum;

    private Long userId;

    private Date createTime;

    private Date updateTime;

    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}