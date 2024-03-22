package com.example.demo4;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> index() {
        String message = "Authentication Successful! Hello, Maureen Mburu!";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
}

