package com.zayanimal.todo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Boolean completed;
}
