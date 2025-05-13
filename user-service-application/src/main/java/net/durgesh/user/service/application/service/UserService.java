package net.durgesh.user.service.application.service;

import net.durgesh.user.service.application.entity.UserEntity;

import java.util.List;

public interface UserService {
    // This interface defines the contract for user-related operations.
    // It includes methods for creating, updating, deleting, and retrieving users.
    // The actual implementation will be provided in a class that implements this interface.

    // user creation
    UserEntity createUser(UserEntity user);

    // get user by id
    UserEntity getUserById(String userId);

    // get all users
    List<UserEntity> getAllUsers();


}
