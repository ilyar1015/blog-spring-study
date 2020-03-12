package com.my.blogspringstudy.dao;

import com.my.blogspringstudy.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);
}
