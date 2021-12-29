package com.zayanimal.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("Welcome to LDAP");
    }
}
