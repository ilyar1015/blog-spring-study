package com.my.blogspringstudy.service;

import com.my.blogspringstudy.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
