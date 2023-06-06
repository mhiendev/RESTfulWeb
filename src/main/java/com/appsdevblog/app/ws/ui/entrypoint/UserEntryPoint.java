package com.appsdevblog.app.ws.ui.entrypoint;

import com.appsdevblog.app.ws.ui.model.request.CreateUserRequsetModel;
import com.appsdevblog.app.ws.ui.model.response.UserProfileRest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UserEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public UserProfileRest createUser(CreateUserRequsetModel requestObject){
        UserProfileRest returnValue = new UserProfileRest();
        return returnValue;
    }
}
