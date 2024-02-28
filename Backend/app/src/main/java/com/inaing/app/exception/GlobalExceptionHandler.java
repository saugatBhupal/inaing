package com.inaing.app.exception;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.inaing.app.dto.global.GlobalResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<GlobalResponse<String>> apiException(GlobalException exception){
        GlobalResponse<String> response = new GlobalResponse<>(exception.getStatus(), exception.getMessage());
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<GlobalResponse<String>> httpMessageNotReadableException(HttpMessageNotReadableException exception){
        GlobalResponse<String> response = new GlobalResponse<>(HttpStatus.SC_FORBIDDEN, exception.getMessage());
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
