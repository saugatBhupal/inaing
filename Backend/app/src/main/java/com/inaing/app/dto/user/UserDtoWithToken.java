package com.inaing.app.dto.user;

import com.inaing.app.dto.token.TokenResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class UserDtoWithToken {
    private Long id;
    private String fullname;
    private String email;
    private String mobile;
    private Boolean verified;
    private TokenResponseDto token;
}
