package com.jamesdev.springbootaoppractice.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public String 요청잘못(IllegalArgumentException e){
        return e.getMessage();

    }
}
