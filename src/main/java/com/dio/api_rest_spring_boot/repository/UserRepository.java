package com.dio.api_rest_spring_boot.repository;

import com.dio.api_rest_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
boolean existsByAccountNumber(String accountNumber);
}
