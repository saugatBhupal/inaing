package com.inaing.app.service;

import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.otp.OtpRequestDto;
import com.inaing.app.dto.user.AuthRequestDto;
import com.inaing.app.dto.user.UserDto;
import com.inaing.app.dto.user.UserDtoWithToken;

public interface UserService {
    GlobalResponse<UserDtoWithToken> login(AuthRequestDto authRequestDto);
    GlobalResponse<String> register(UserDto userDto);
    GlobalResponse<String> verify(OtpRequestDto otpRequestDto);
}
