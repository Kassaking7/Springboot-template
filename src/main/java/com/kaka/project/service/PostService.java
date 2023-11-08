package com.kaka.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaka.project.model.entity.Post;


public interface PostService extends IService<Post> {


    void validPost(Post post, boolean add);
}
