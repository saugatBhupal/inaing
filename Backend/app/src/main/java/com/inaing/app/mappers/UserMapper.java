package com.inaing.app.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.inaing.app.dto.user.UserDto;
import com.inaing.app.dto.user.UserDtoWithToken;
import com.inaing.app.entity.User;
import org.springframework.context.annotation.Bean;

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    @Bean
    UserDto toUserDto(User user);

    @Bean
    UserDtoWithToken toUserDtoWithToken(User user); 

    @Bean
    @Mapping(target = "password", ignore = true)
    User toUser(UserDto userDto);

}
