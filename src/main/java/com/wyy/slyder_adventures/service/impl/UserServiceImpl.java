package com.wyy.slyder_adventures.service.impl;

import com.wyy.slyder_adventures.dao.UserDao;
import com.wyy.slyder_adventures.domain.User;
import com.wyy.slyder_adventures.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    /**
     * 获取用户信息
     *
     * @param userId
     * @return
     */
    @Override
    public User getUserInfo(Integer userId) {
        return userDao.getUserInfo(userId);
    }
}
