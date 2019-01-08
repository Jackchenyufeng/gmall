package com.atguigu.gmall.user.service.iml;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    public List<UserInfo> getUserList() {
        //List<UserInfo> userInfos = userInfoMapper.selectUserList();
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }
}
