package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.tool.JSONResult;
import com.example.demo.tool.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceimpl;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public JSONResult getUser(String username, String password){
        UserBean user = new UserBean();
        user = userServiceimpl.selectUserByUsername(username);
        String pwd = MD5Util.getMD5(password);
        if(user.getPassword().equalsIgnoreCase(password)){
            return JSONResult.success(user);
        }
        return JSONResult.custom("01","wrong password",null);
    }
}
