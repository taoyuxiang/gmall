package com.gmall.api.service;


import com.gmall.api.bean.UmsMember;
import com.gmall.api.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByUserId(String userid);
}
