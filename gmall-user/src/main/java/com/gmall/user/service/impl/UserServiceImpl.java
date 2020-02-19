package com.gmall.user.service.impl;

import com.gmall.api.bean.UmsMember;
import com.gmall.api.bean.UmsMemberReceiveAddress;
import com.gmall.api.service.UserService;
import com.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> list = userMapper.selectAll();//selectAllUser();
        return list;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByUserId(String userid) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(userid);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
