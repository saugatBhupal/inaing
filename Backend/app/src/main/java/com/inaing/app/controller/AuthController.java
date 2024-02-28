package com.inaing.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudinary.api.ApiResponse;
import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.user.AuthRequestDto;
import com.inaing.app.dto.user.UserDto;
import com.inaing.app.dto.user.UserDtoWithToken;
import com.inaing.app.service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;
    
    @PostMapping("/authenticate")
    public ResponseEntity<GlobalResponse<UserDtoWithToken>> authHandler(@Valid @RequestBody AuthRequestDto authRequestDto) {
        GlobalResponse<UserDtoWithToken> response = userService.login(authRequestDto);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @PostMapping("/register")
    public ResponseEntity<GlobalResponse<String>> registerHandler(@Valid @RequestBody UserDto userDto){
        GlobalResponse<String> response = userService.register(userDto);
        return ResponseEntity.status(response.getStatus()).body(response);
    }
    
}
