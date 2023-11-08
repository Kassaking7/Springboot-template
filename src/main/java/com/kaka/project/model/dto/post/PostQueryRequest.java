package com.kaka.project.model.dto.post;

import com.kaka.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@Data
public class PostQueryRequest extends PageRequest implements Serializable {

    private Integer age;

    private Integer gender;

    private String education;

    private String place;

    private String job;

    private String contact;

    private String loveExp;

    private String content;

    private Integer reviewStatus;

    private Long userId;

    private static final long serialVersionUID = 1L;
}