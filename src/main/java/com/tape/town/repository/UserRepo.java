package com.tape.town.repository;

import com.tape.town.entity.UserEntity;
import org.springframework.data.ldap.repository.LdapRepository;

import java.util.List;

public interface UserRepo extends LdapRepository<UserEntity> {
    UserEntity findByUsername(String username);
    UserEntity findByUsernameAndPassword(String username, String password);
    List<UserEntity> findByUsernameLikeIgnoreCase(String username);
}
