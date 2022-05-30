package com.user.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService {


    List<User> list = List.of(
            new User(1311L, "Siddarth Jain", "siddarthjain.it22@gmail.com"),
            new User(1312L, "Harsh Jain", "harshjain@gmail.com"),
            new User(1314L, "Atul", "atul@gmail.com")
    );
		

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
