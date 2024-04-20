package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.dto.UserDTO;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stories")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDTO dto) {
        return mappingResponseUser(userService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<User>> readAll() {
        return mappingResponseListUser(userService.readAll());
    }

    @GetMapping("/story/{id}")
    public ResponseEntity<List<User>> readByStoryId(@PathVariable Long id) {
        return mappingResponseListUser(userService.readByStoryId(id));
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        return mappingResponseUser(userService.update(user));
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        userService.delete(id);
        return HttpStatus.OK;
    }

    private ResponseEntity<User> mappingResponseUser(User user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    private ResponseEntity<List<User>> mappingResponseListUser(List<User> users) {
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
