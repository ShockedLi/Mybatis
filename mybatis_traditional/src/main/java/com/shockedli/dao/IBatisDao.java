package com.shockedli.dao;

import com.shockedli.mybatis_bean.User;

import java.io.IOException;
import java.util.List;

public interface IBatisDao {

    public List<User> findAll() throws IOException;
}
