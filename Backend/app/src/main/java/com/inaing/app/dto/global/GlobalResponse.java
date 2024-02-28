package com.inaing.app.dto.global;

import java.time.LocalDateTime;

import org.apache.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GlobalResponse<T> {
    
    private final int status;
    private final T detail;
    private LocalDateTime timestamp = LocalDateTime.now();

}
