package com.zayanimal.todo.repository;

import com.zayanimal.todo.entity.UserEntity;
import org.springframework.data.ldap.repository.LdapRepository;

import java.util.List;

public interface UserRepo extends LdapRepository<UserEntity> {
    UserEntity findByUsername(String username);
    UserEntity findByUsernameAndPassword(String username, String password);
    List<UserEntity> findByUsernameLikeIgnoreCase(String username);
}
