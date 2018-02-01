package com.arjen.demo.service;

import com.arjen.demo.dao.UserMapper;
import com.arjen.demo.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/2/1.
 */
@Service
@MapperScan("com.arjen.demo.dao")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectUserByName(String name) {
        List<User> userList=userMapper.selectUserByName(name);
        return userList;
    }
}
