package com.ramazan.springMVC.Converter;

import com.ramazan.springMVC.Model.UserProfile;
import com.ramazan.springMVC.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by Ramazan on 21.6.2016.
 */
@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile> {

    @Autowired
    UserProfileService userProfileService;

    /**
     * Gets UserProfile by Id
     * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
     */
    public UserProfile convert(Object element) {
        Integer id = Integer.parseInt((String)element);
        UserProfile profile= userProfileService.findById(id);
        System.out.println("Profile : "+profile);
        return profile;
    }

}