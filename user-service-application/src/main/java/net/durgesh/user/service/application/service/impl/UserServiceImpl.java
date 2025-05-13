package net.durgesh.user.service.application.service.impl;

import net.durgesh.user.service.application.entity.UserEntity;
import net.durgesh.user.service.application.exceptions.ResourceNotFoundException;
import net.durgesh.user.service.application.repository.UserRepository;
import net.durgesh.user.service.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    /**
     * UserRepository is an interface that extends JpaRepository to provide CRUD operations for UserEntity.
     * It allows us to perform database operations on the 'users' table.
     *
     * @author Durgesh
     */
    @Autowired
    private UserRepository userRepository;



    @Override
    public UserEntity createUser(UserEntity userEntity) {
        // Generate a random UUID for the userId field
        // This ensures that each user has a unique identifier.
        // The UUID is generated using the UUID class from the java.util package.
        // The toString() method converts the UUID to a string representation.
        String randomUserId = UUID.randomUUID().toString();
        userEntity.setUserId(randomUserId);
        return userRepository.save(userEntity);
    }

    // This method is used to get all users from the database.
    @Override
    // It returns an iterable collection of UserEntity objects.
    // This method is used to retrieve all users from the database.
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // This method is used to get a user by their ID from the database.
    @Override
    public UserEntity getUserById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));
    }

}
