package com.dio.api_rest_spring_boot.service;

import com.dio.api_rest_spring_boot.model.User;
import com.dio.api_rest_spring_boot.repository.UserRepository;
import com.dio.api_rest_spring_boot.service.impl.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(("User not found with Id" + id)));
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}


