package com.evan.javademo.dao;

import com.evan.javademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {

    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
