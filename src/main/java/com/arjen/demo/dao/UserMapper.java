package com.arjen.demo.dao;

import com.arjen.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/2/1.
 */

@Mapper
@Repository
public interface UserMapper {
    @Select(" SELECT * FROM user WHERE name = #{name}")
    @ResultType(User.class)
    List<User> selectUserByName(@Param("name") String name);
}
