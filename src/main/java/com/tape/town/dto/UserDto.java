package com.tape.town.dto;

import com.tape.town.entity.UserEntity;
import lombok.Getter;

import javax.naming.Name;

@Getter
public class UserDto {
    private final Name id;
    private final String username;

    public UserDto(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.username = userEntity.getUsername();
    }
}
