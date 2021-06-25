package com.wyy.slyder_adventures.service;

import com.wyy.slyder_adventures.domain.User;

/**
 * @author: ChenZhongjun
 * @desc: 用户服务
 * @Date: Created in 2021/6/25
 */
public interface UserService {

    /**
     * 用户用户信息
     *
     * @param userId
     * @return
     */
    User getUserInfo(Integer userId);
}
