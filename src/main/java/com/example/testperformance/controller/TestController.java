package com.example.testperformance.controller;

import com.example.testperformance.entity.Test;
import com.example.testperformance.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping
    public ResponseEntity<List<Test>> findAll() {
        return ResponseEntity.ok(testRepository.findAll());
    }
}
