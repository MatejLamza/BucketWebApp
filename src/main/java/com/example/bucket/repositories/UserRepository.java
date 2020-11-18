package com.example.bucket.repositories;

import com.example.bucket.domain.User;

import java.util.Optional;
import java.util.Set;

public interface UserRepository {
    Set<User> getAllUsers();

    Optional<User> insertUser(User user);

}
