/*
    This class will RECEIVE some information from user to create a new user in the system
 */
package com.appsdevblog.app.ws.ui.model.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement         //convert JSON into Java model and vice versa
public class CreateUserRequestModel {
    //these properties match with one in Postman
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
