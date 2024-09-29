package com.dio.api_rest_spring_boot.service;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public BusinessException(String message){
        super(message);
    }
}
