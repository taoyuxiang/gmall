package com.gmall.user.service;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByUserId(String userid);
}
