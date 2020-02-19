package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserBean selectUserByUsername(String usernamee);
}
