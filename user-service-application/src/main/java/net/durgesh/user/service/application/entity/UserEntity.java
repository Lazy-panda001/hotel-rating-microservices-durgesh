package net.durgesh.user.service.application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "micro-users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @Column(name = "ID", nullable = false, length = 100)
    private String userId;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    @Column(name = "ABOUT", nullable = false, length = 100)
    private String about;
    // Other User properties can be added here

    @Transient
    // This field is not persisted in the database
    // and is used to hold the ratings for the user
    // It is a transient field, meaning it will not be stored in the database
    // and is used for temporary storage or calculations.
    private List<RatingEntity> ratings;
}
