package com.api.biblioteca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class NotFoundException extends RuntimeException{
    public static ProblemDetail toDetail() {
        return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, "Nao encontrado");
    }
}
