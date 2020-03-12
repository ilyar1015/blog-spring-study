package com.my.blogspringstudy.service;

import com.my.blogspringstudy.po.User;
import com.my.blogspringstudy.dao.UserRepository;
import com.my.blogspringstudy.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
    }
}
