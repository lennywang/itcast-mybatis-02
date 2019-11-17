package com.itcast.mapper;

import com.itcast.pojo.Order;
import com.itcast.pojo.User;

import java.util.List;

public interface OrderMapper {

    public List<Order> selectOrderList();

    public List<User> selectUserList();

}
