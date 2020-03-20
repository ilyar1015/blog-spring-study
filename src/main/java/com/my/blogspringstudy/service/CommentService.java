package com.my.blogspringstudy.service;

import com.my.blogspringstudy.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);

}
