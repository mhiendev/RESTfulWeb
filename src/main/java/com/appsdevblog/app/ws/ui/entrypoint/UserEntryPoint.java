/*

This is a resource class and will accept some HTTP requests and then return
some HTTP responses

 */

package com.appsdevblog.app.ws.ui.entrypoint;

import com.appsdevblog.app.ws.service.UserService;
import com.appsdevblog.app.ws.service.UserServiceImpl;
import com.appsdevblog.app.ws.shared.dto.UserDTO;
import com.appsdevblog.app.ws.ui.model.request.CreateUserRequestModel;
import com.appsdevblog.app.ws.ui.model.response.UserProfileRest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils;

@Path("/users")                                              //this annotation make it a resource class
public class UserEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public UserProfileRest createUser(CreateUserRequestModel requestObject){
        UserProfileRest returnValue = new UserProfileRest();

        //Prepare UserDTO
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDTO); //populated this object with information send from user

        //Create new user
        UserService userService = new UserServiceImpl();
        UserDTO createUserProfile = userService.createUser(userDTO);

        //Prepare response
        BeanUtils.copyProperties(createUserProfile, returnValue);

        return returnValue;
    }

}
