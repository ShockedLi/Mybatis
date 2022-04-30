package com.shockedli.test;

import com.shockedli.mybatis_bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    @Test
    public void testFindAll() throws Exception {
// 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
// 获取SqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
// 获取SqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
// 执行sql
        List<User> list = sqlSession.selectList("UserMapper.findAll");
        for (User user : list) {
            System.out.println(user);
        }
// 释放资源
        sqlSession.close();
    }

    @Test
    public void testAddUser() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();


        User user = new User();
        user.setUsername("宇乐");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京海淀");

        sqlSession.insert("UserMapper.addUser",user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();


        User user = new User();
        user.setId(3);
        user.setUsername("振汉");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAddress("北京朝阳");

        sqlSession.update("UserMapper.updateUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

//        User user = new User();
//        user.setId(5);
//        sqlSession.delete("UserMapper.deleteUser", user);

        sqlSession.delete("UserMapper.deleteUser",8);
        sqlSession.commit();
        sqlSession.close();
    }
}
