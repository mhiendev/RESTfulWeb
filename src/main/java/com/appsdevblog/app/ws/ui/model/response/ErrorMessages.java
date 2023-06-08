package com.appsdevblog.app.ws.ui.model.response;

public enum ErrorMessages {
    /*
    Initialize below fields based on constructor, all of them always 'static final'
     */
    MISSING_REQUIRED_FIELD("Missing required field. Please check documentation for required fields"),
    RECORD_ALREADY_EXISTED("Record already exits");
    private String errorMessage;

    ErrorMessages(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
