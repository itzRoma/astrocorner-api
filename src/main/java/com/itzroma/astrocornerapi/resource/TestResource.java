package com.itzroma.astrocornerapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {
    @GetMapping("/all")
    public ResponseEntity<String> all() {
        return ResponseEntity.ok("hello all");
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/authenticated")
    public ResponseEntity<String> authenticated() {
        return ResponseEntity.ok("hello authenticated");
    }
}
