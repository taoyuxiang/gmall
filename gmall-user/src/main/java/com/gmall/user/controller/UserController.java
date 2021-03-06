package com.gmall.user.controller;

import com.gmall.api.bean.UmsMember;
import com.gmall.api.bean.UmsMemberReceiveAddress;
import com.gmall.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/index")
    public String hello(){
        return "hello user";
    }
    @GetMapping("/getAllUser")
    public List<UmsMember> getAllUser(){
        List<UmsMember> list = userService.getAllUser();
        return list;
    }
    @GetMapping("/getReceiveAddressByUserId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByUserId(String userid){
        List<UmsMemberReceiveAddress> list = userService.getReceiveAddressByUserId(userid);
        return list;
    }
}
