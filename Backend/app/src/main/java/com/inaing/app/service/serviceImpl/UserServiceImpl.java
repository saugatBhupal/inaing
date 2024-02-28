package com.inaing.app.service.serviceImpl;

import java.nio.CharBuffer;

import org.apache.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.inaing.app.config.PasswordEncoderConfig;
import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.otp.OtpRequestDto;
import com.inaing.app.dto.token.TokenResponseDto;
import com.inaing.app.dto.user.AuthRequestDto;
import com.inaing.app.dto.user.UserDto;
import com.inaing.app.dto.user.UserDtoWithToken;
import com.inaing.app.entity.Roles;
import com.inaing.app.entity.User;
import com.inaing.app.exception.GlobalException;
import com.inaing.app.mappers.UserMapper;
import com.inaing.app.repository.UserRepository;
import com.inaing.app.security.JwtService;
import com.inaing.app.service.MailService;
import com.inaing.app.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;
    private final AuthenticationManager authenticationManager;
    private final UserMapper userMapper;
    private final MailService mailService;
    private final String SECRET_KEY = "294A404E635266556A586E3272357538782F4125442A472D4B6150645367566B";

    @Override
    public GlobalResponse<UserDtoWithToken> login(AuthRequestDto authRequestDto) {
        try{
            User user = repository.findByEmailOrMobile(authRequestDto.getLogin()).orElseThrow(() -> new GlobalException("User assosciated to this username could not be found", HttpStatus.SC_UNAUTHORIZED));
            if(!authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDto.getLogin(), authRequestDto.getPassword())).isAuthenticated()) 
            throw new GlobalException("Invalid Password.", HttpStatus.SC_UNAUTHORIZED);
            System.out.println(authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDto.getLogin(), authRequestDto.getPassword())).isAuthenticated());
            UserDtoWithToken dtoWithToken = userMapper.toUserDtoWithToken(user);
            dtoWithToken.setToken(new TokenResponseDto(JwtService.generateToken(dtoWithToken)));
            dtoWithToken.setFullname(user.getFirstname() + " " + user.getLastname());
            return new GlobalResponse<UserDtoWithToken>(HttpStatus.SC_OK, dtoWithToken);
        }
        catch(GlobalException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        
    }

    @Override
    public GlobalResponse<String> register(UserDto userDto) {
        try{
            if(repository.findByEmailOrMobile(userDto.getEmail()).isPresent() || repository.findByEmailOrMobile(userDto.getMobile()).isPresent()) throw new GlobalException("User with this detail already exists.", HttpStatus.SC_CONFLICT);
            User user = userMapper.toUser(userDto);
            user.setPassword(PasswordEncoderConfig.getInstance().encode(CharBuffer.wrap(userDto.getPassword())));
            user.setRole(Roles.USER.toString());
            String verificationLink = "http://localhost:3000/"+user.getEmail()+"/otp/"+PasswordEncoderConfig.getInstance().encode(SECRET_KEY);
            mailService.sendVerificationMail(userDto.getEmail(), userDto.getFirstname() + " " + userDto.getLastname(), verificationLink);
            repository.save(user);
            return(new GlobalResponse<>(HttpStatus.SC_OK, "User Created Successfully"));
        }
        catch(GlobalException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public GlobalResponse<String> verify(OtpRequestDto otpRequestDto) {
        return new GlobalResponse<String>(0, SECRET_KEY);
    }

}
