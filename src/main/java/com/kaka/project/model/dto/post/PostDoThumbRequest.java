package com.kaka.project.model.dto.post;

import lombok.Data;

import java.io.Serializable;


@Data
public class PostDoThumbRequest implements Serializable {

    private long postId;

    private static final long serialVersionUID = 1L;
}