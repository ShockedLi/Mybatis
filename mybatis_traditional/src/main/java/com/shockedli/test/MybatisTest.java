package com.shockedli.test;

import com.shockedli.dao.IBatisDao;
import com.shockedli.dao.impl.BatisDao;
import com.shockedli.mybatis_bean.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MybatisTest {

    @Test
    public void findAll() throws IOException {
        IBatisDao batisDao = new BatisDao();
        List<User> users = batisDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
