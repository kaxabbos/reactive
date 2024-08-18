package com.reactive.appUser;

public record UserDto(
        Long id,
        String username,
        String role
) {
}
