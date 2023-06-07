/*
                                    DTO: Data Transfer Object
This class use a design pattern called UserDTO object, we use this object to pass around from
one layer to another.
B/c we're passing this object from layer to layer, so we need make it serializable

 */

package com.appsdevblog.app.ws.shared.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L; //this field keep UserDTO class will not change after convert.
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String salt;        //use to generate password
    private String encryptedPassword; //this pwd is stored in DB
    private String userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
