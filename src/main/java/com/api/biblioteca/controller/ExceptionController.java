package com.api.biblioteca.controller;

import com.api.biblioteca.exception.NotFoundException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {


    @ExceptionHandler(NotFoundException.class)
    public ProblemDetail notFoundException(NotFoundException notFoundException){
        return NotFoundException.toDetail();
    }

}
