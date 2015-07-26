package com.superheizai.dao;

import com.superheizai.entity.User;

/**
 * Created by superheizai on 15/7/25.
 */
public interface UserDao {


    public User findById(int id);

    public int insertUser(User user);


    public int updateUser(User user);

    public int deleteUser(int id);

}
