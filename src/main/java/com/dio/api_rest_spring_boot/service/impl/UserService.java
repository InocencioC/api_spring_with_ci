package com.dio.api_rest_spring_boot.service.impl;

import com.dio.api_rest_spring_boot.model.User;

public interface UserService {
    User findById(long id);
    User create(User userToCreate);
}
