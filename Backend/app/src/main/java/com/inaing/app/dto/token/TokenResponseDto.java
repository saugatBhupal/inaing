package com.inaing.app.dto.token;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TokenResponseDto {

    private String token;
    private String iat;
    private String eat;

    public TokenResponseDto(String token){
        this.token = token;
        this.iat = LocalDate.now().toString();
        this.eat = LocalDate.now().plusDays(2).toString();
    }
}
