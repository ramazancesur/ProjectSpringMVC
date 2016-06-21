package com.ramazan.springMVC.Service;

import com.ramazan.springMVC.Model.User;

import java.util.List;

/**
 * Created by Ramazan on 21.6.2016.
 */
public interface UserService {
    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);
}
