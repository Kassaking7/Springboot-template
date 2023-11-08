package com.kaka.project.model.vo;

import com.kaka.project.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}