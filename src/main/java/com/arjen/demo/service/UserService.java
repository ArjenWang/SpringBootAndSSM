package com.arjen.demo.service;

import com.arjen.demo.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2018/2/1.
 */
public interface UserService {
    public List<User> selectUserByName(String name);
}
