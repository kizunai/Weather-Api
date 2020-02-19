package com.example.demo.service;

import com.example.demo.bean.UserBean;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserBean selectUserByUsername(String username);
}
