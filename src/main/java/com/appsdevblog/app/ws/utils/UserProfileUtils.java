package com.appsdevblog.app.ws.utils;

import com.appsdevblog.app.ws.exception.MissingRequiredFieldException;
import com.appsdevblog.app.ws.shared.dto.UserDTO;
import com.appsdevblog.app.ws.ui.model.response.ErrorMessages;

public class UserProfileUtils {
    public void validateRequiredFields(UserDTO userDTO) throws MissingRequiredFieldException {
        if(userDTO.getFirstName() == null ||
            userDTO.getFirstName().isEmpty() ||
            userDTO.getLastName() == null ||
            userDTO.getLastName().isEmpty() ||
            userDTO.getEmail() == null ||
            userDTO.getEmail().isEmpty() ||
            userDTO.getPassword() == null ||
            userDTO.getPassword().isEmpty()){
            throw new MissingRequiredFieldException(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());
        }
    }
}
