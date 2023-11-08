package com.kaka.project.model.dto.post;

import lombok.Data;

import java.io.Serializable;


@Data
public class PostUpdateRequest implements Serializable {

    private long id;

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

    private static final long serialVersionUID = 1L;
}