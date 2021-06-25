package com.wyy.slyder_adventures.dao;

import com.wyy.slyder_adventures.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao extends BaseDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);

    public User getUserInfo(Integer userId) {
        StringBuilder sbSql = new StringBuilder();
        sbSql.append("select * from ");
        sbSql.append(USER_TABLE);
        sbSql.append(" where id = ?");
        List<User> query = jdbcTemplate.query(sbSql.toString(), new Object[]{userId}, this::process);
        return query.isEmpty() ? null : query.get(0);
    }

    private User process(ResultSet rs, int rowNum) {
        User user = new User();
        try {
            user.setId(rs.getInt("id"));
            user.setPassword(rs.getString("password"));
            user.setUsername(rs.getString("username"));
        } catch (SQLException e) {
            LOGGER.error("process user info fail. ex:{0}", e);
        }
        return user;
    }
}
