package com.appsdevblog.app.ws.service;

import com.appsdevblog.app.ws.shared.dto.UserDTO;
import com.appsdevblog.app.ws.utils.UserProfileUtils;

public class UserServiceImpl implements UserService {

    UserProfileUtils userProfileUtils = new UserProfileUtils();
    public UserDTO createUser(UserDTO user) {
        UserDTO returnValue = new UserDTO();

        /*Validate the required fields(make sure that before creating and use a profile,
        we have all the required fields provided).*/
        userProfileUtils.validateRequiredFields(user);

        //Check if user already exists

        //Create an entity object

        //Generate secure public user id

        //Generate salt

        //Generate secure password

        //Record data in to DB

        //Return back the user profile

        return returnValue;
    }
}
