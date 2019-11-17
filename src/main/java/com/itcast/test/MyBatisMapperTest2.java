package com.itcast.test;

import com.itcast.mapper.OrderMapper;
import com.itcast.mapper.UserMapper;
import com.itcast.pojo.Order;
import com.itcast.pojo.QueryVo;
import com.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 **/
public class MyBatisMapperTest2 {

    @Test
    public void testSwlectOrderList() throws IOException {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.selectOrderList();

        for (Order order:orderList) {
            System.out.println(order);
        }

    }

    @Test
    public void testSelectUserList() throws IOException {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<User> userList = orderMapper.selectUserList();

        for (User user: userList) {
            System.out.println(user);
        }
    }
}
