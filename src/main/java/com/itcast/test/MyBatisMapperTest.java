package com.itcast.test;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.QueryVo;
import com.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 **/
public class MyBatisMapperTest {

    @Test
    public void testFindUserByUsernameAndSex() throws IOException {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setSex("男");
        user.setUsername("陆晓");
        List<User> userList = userMapper.findUserByUsernameAndSex(user);
        for (User u:userList)
        {
            System.out.println(u);
        }
    }

    @Test
    public void testFindUserByIdList() throws IOException {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        List<Integer> idsList = new ArrayList<Integer>();
        idsList.add(13);
        idsList.add(14);
        idsList.add(16);
        vo.setIdsList(idsList);
        List<User> userList = userMapper.findUserByIdList(vo);
        for (User u:userList)
        {
            System.out.println(u);
        }
    }

    @Test
    public void testFindUserByQueryo() throws IOException {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        User u = new User();
        //u.setUsername("陆晓");
        u.setUsername("王路路");
        vo.setUser(u);
        List<User> userList = userMapper.findUserByQueryVo(vo);
        for (User user:userList)
        {
            System.out.println(user);
        }
    }

}
