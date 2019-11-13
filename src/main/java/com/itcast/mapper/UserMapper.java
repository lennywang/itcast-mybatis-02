package com.itcast.mapper;

import com.itcast.pojo.QueryVo;
import com.itcast.pojo.User;

import java.util.List;

public interface UserMapper {

    public List<User> findUserByUsernameAndSex(User user);

    public List<User> findUserByIdList(QueryVo vo);

    public List<User> findUserByQueryVo(QueryVo vo);
}
