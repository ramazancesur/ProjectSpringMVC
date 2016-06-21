package com.ramazan.springMVC.Dao;

import com.ramazan.springMVC.Model.User;

import java.util.List;

/**
 * Created by Ramazan on 21.6.2016.
 */
public interface UserDao {
    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}
