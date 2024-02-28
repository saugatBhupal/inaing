package com.inaing.app.exception;

import org.apache.http.HttpStatus;

public class GlobalException extends RuntimeException{
    private final int status;

    public GlobalException(String message, int status){
        super(message);
        this.status = status;
    }

    public int getStatus(){
        return status;
    }
}
