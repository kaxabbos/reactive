package com.reactive.appUser.converter;

import com.reactive.appUser.AppUser;
import com.reactive.appUser.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUserConverter implements Converter<UserDto, AppUser> {

    @Override
    public AppUser convert(UserDto source) {
        return new AppUser(
                source.username()
        );
    }
}
