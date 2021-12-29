package com.zayanimal.todo.service;

import com.zayanimal.todo.repository.TodoRepo;
import com.zayanimal.todo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepo todoRepo;
    private final UserRepo userRepo;

    @Autowired
    public TodoService(
        TodoRepo todoRepo,
        UserRepo userRepo
    ) {
        this.todoRepo = todoRepo;
        this.userRepo = userRepo;
    }
}
