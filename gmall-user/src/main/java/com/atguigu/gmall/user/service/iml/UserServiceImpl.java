package com.atguigu.gmall.user.service.iml;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserList() {
        //List<UserInfo> userInfos = userInfoMapper.selectUserList();
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }
}
