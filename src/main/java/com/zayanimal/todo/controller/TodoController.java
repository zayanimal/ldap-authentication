package com.zayanimal.todo.controller;

import com.zayanimal.todo.entity.TodoEntity;
import com.zayanimal.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {
//    @Autowired
//    private TodoService todoService;
//
//    @PostMapping
//    public ResponseEntity createTodo(@RequestBody TodoEntity todo, @RequestParam Long userId) {
//        try {
//            return ResponseEntity.ok(todoService.createTodo(todo, userId));
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Произошла ошибка");
//        }
//    }
//
//    @PutMapping
//    public ResponseEntity completeTodo(@RequestParam Long id) {
//        try {
//            return ResponseEntity.ok(todoService.completeTodo(id));
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Произошла ошибка");
//        }
//    }
}
