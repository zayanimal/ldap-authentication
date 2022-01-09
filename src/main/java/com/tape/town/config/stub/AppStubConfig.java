package com.tape.town.config.stub;

import com.tape.town.controller.TodoController;
import com.tape.town.controller.UserController;
import com.tape.town.entity.TodoEntity;
import com.tape.town.entity.UserEntity;
import com.tape.town.repository.TodoRepo;
import com.tape.town.repository.UserRepo;
import com.tape.town.repository.stub.UserRepoStub;
import com.tape.town.service.TodoService;
import com.tape.town.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration(proxyBeanMethods = true)
@Profile("stub")
public class AppStubConfig {
    @Bean
    public UserController userController() {
        return new UserController();
    }

    @Bean
    public UserService userService() {
        return new UserService(userRepoStub());
    }

    @Bean
    public UserRepo userRepoStub() {
        return new UserRepoStub();
    }


}
