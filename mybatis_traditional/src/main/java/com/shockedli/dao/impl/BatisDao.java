package com.shockedli.dao.impl;

import com.shockedli.dao.IBatisDao;
import com.shockedli.mybatis_bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BatisDao implements IBatisDao {
    public List<User> findAll() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

        List<User> users = sqlSession.selectList("UserMapper.findAll");

        return users;
    }
}
