package com.reactive.appUser.converter;

import com.reactive.appUser.AppUser;
import com.reactive.appUser.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDtoConverter implements Converter<AppUser, UserDto> {

    @Override
    public UserDto convert(AppUser source) {
        return new UserDto(
                source.getId(),
                source.getUsername(),
                source.getRole().name()
        );
    }
}
