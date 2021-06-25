package com.wyy.slyder_adventures.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: ChenZhongjun
 * @desc: 基础DAO
 * @Date: Created in 2021/6/25
 */
public class BaseDao {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    protected static final String USER_TABLE = "user";
}
