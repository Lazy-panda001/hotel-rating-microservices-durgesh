package net.durgesh.user.service.application.exceptions;

import net.durgesh.user.service.application.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.swing.text.html.parser.Entity;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // This class handles global exceptions for the application
    // It can be used to define custom exception handling logic
    // for different types of exceptions that may occur in the application.

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
        // This method handles ResourceNotFoundException
        // and returns a custom response entity with the error message.

        String message = ex.getMessage();
        ApiResponse build = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(build, HttpStatus.NOT_FOUND);
    }
}
