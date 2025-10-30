package com.jproject.securitytest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<?> test() {
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body("hello");
    }

}
