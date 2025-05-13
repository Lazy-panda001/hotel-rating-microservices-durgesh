package net.durgesh.user.service.application.controller;

import net.durgesh.user.service.application.entity.UserEntity;
import net.durgesh.user.service.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    // This class is a REST controller for handling user-related requests.
    // It uses Spring's @RestController annotation to indicate that it will handle HTTP requests
    // and return JSON responses.
    // The @RequestMapping annotation specifies the base URL for all endpoints in this controller.
    // For example, if this class has a method with @GetMapping("/all"), the full URL would be "/api/users/all".

    @Autowired
    private UserService userService;
    // The @Autowired annotation is used to inject the UserService bean into this controller.
    // The UserService class is a service layer that contains business logic related to user operations.
    // The UserService class is expected to provide methods for creating, updating, retrieving, and deleting users.


    // create user
    @PostMapping
    // The @PostMapping annotation is used to map HTTP POST requests onto specific handler methods.
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
        // The createUser method in the UserService class is called to create a new user.
        // The UserEntity object is passed as an argument to this method.
        // The createUser method is expected to return a UserEntity object representing the created user.
        UserEntity createdUser = userService.createUser(userEntity);
        // The ResponseEntity class is used to represent the entire HTTP response,
        // including status code, headers, and body.
        // The HttpStatus.CREATED constant represents the HTTP status code 201,
        // which indicates that a new resource has been successfully created.
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    // get user by id
    @GetMapping("/{userId}")
    // The @GetMapping annotation is used to map HTTP GET requests onto specific handler methods.
    public ResponseEntity<UserEntity> getUserById(@PathVariable String userId) {
        // The @PathVariable annotation is used to extract the userId from the URL path.
        // The getUserById method in the UserService class is called to retrieve a user by their ID.
        // The userId is passed as an argument to this method.
        // The getUserById method is expected to return a UserEntity object representing the user with the specified ID.
        UserEntity user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }


    // get all users
    @GetMapping("/all")
    // The @GetMapping annotation is used to map HTTP GET requests onto specific handler methods.
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        // The getAllUsers method in the UserService class is called to retrieve all users.
        // The getAllUsers method is expected to return a list of UserEntity objects representing all users.
        List<UserEntity> allUsers = userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }




    // update user

    // delete user




}
