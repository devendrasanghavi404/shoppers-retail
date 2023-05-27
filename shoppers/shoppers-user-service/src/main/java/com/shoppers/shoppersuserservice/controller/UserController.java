package com.shoppers.shoppersuserservice.controller;

import com.shoppers.shoppersuserservice.dto.UserRequestDto;
import com.shoppers.shoppersuserservice.model.UserEntity;
import com.shoppers.shoppersuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/user")
    public ResponseEntity<UserEntity> createUserEntity(@RequestBody UserRequestDto userDto) {
        return ResponseEntity.ok(userService.saveUserEntity(userDto));
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<UserEntity>> fetchAllUsers() {
        List<UserEntity> userList = userService.getAllUserEntity();
        return ResponseEntity.ok(userList);
    }

    @PutMapping(value = "/user/{email}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable("email") String email, @RequestBody UserRequestDto userDto) {
        return ResponseEntity.ok(userService.updateUser(email, userDto));
    }

    @DeleteMapping(value = "/user/{email}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable("email") String email) {
        UserEntity deleted = userService.getUser(email);
        userService.deleteUser(email);
        return ResponseEntity.ok(deleted);
    }

}
