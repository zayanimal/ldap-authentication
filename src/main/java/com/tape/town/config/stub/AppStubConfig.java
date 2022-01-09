package com.tape.town.config.stub;

import com.tape.town.controller.TodoController;
import com.tape.town.entity.TodoEntity;
import com.tape.town.entity.UserEntity;
import com.tape.town.repository.TodoRepo;
import com.tape.town.repository.UserRepo;
import com.tape.town.service.TodoService;
import com.tape.town.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.ldap.query.LdapQuery;

import javax.naming.Name;
import java.util.List;
import java.util.Optional;

@Configuration
@Profile("stub")
public class AppStubConfig {
//    private final UserRepo userRepo = new UserRepoMock();

//    @Bean
//    public UserService userService() {
//        return new UserService(userRepo);
//    }
//
//    @Bean
//    public TodoService todoService() {
//        return new TodoService(
//            new TodoRepoMock(),
//            userRepo
//        );
//    }
}
