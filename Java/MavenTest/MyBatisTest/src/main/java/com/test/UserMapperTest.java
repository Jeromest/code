package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.entity.User;
import com.mapper.UserMapper;

public class UserMapperTest {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession Session = sqlSessionFactory.openSession();
        UserMapper userMapper = Session.getMapper(UserMapper.class);
        User user = userMapper.getUserByID( 1 );
        User userList = (User) userMapper.getUserList();

        System.out.println(user);
        System.out.println(userList);

    }

}
