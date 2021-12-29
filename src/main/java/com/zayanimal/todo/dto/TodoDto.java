package com.zayanimal.todo.dto;

import com.zayanimal.todo.entity.TodoEntity;
import lombok.Getter;

@Getter
public class TodoDto {
    private final Long id;
    private final String title;
    private final Boolean completed;

    public TodoDto(TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.completed = todoEntity.getCompleted();
    }
}
