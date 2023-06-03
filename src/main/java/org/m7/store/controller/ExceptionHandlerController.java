package org.m7.store.controller;

import jakarta.validation.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {
    // ----- FEEDBACK CONSTANT -----
    private static final String NOT_VALID_PARAMETERS = "Not valid parameters";
    private static final String INTERNAL_SERVER_ERROR = "Internal server error";
    // ----- FEEDBACK CONSTANT -----

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> illegalArgumentException(IllegalArgumentException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(NOT_VALID_PARAMETERS + ": " + exception.getMessage());
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> constraintViolationException(ValidationException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(NOT_VALID_PARAMETERS + ": " + exception.getMessage());
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<String> bindException(BindException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(NOT_VALID_PARAMETERS + ": " + exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exception(Exception exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(INTERNAL_SERVER_ERROR + ": " + exception.getMessage());
    }
}
