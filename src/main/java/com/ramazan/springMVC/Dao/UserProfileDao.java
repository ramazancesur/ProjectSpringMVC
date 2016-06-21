package com.ramazan.springMVC.Dao;

import com.ramazan.springMVC.Model.UserProfile;

import java.util.List;

/**
 * Created by Ramazan on 21.6.2016.
 */
public interface UserProfileDao {
    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
