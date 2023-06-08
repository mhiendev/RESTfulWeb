package com.appsdevblog.app.ws.exception;

public class MissingRequiredFieldException extends RuntimeException{
    private static final long serialVersionUID = 292063852832407455L;

    public MissingRequiredFieldException(String message){
        super(message);
    }
}
