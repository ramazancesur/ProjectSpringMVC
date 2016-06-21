package com.ramazan.springMVC.Service;

import com.ramazan.springMVC.Model.UserProfile;

import java.util.List;

/**
 * Created by Ramazan on 21.6.2016.
 */
public interface UserProfileService {
    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
