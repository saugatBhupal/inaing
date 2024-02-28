package com.inaing.app.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String password;
    private Boolean verified;
}
