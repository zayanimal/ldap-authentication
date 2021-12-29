package com.zayanimal.todo.repository;

import com.zayanimal.todo.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
