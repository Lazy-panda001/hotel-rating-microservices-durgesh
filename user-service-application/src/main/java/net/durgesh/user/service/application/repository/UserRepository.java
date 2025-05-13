package net.durgesh.user.service.application.repository;

import net.durgesh.user.service.application.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    // This interface extends JpaRepository to provide CRUD operations for UserEntity
    // It allows us to perform database operations on the 'users' table
    // without needing to implement the methods ourselves.

}
