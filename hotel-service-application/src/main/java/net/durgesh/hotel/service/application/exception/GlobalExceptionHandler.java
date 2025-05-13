package net.durgesh.hotel.service.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // Handle specific exceptions and return appropriate HTTP responses
    // For example, you can handle ResourceNotFoundException here

   @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<Map<String, Object>> notFoundExceptionHandler(ResourceNotFoundException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("error", "Resource not found");
        map.put("message", ex.getMessage());
        map.put("status", HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

    // You can add more exception handlers for other exceptions as needed
}
