package com.example.MongoConnection.controller;

import com.example.MongoConnection.Model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.MongoConnection.service.MongoService;

import java.util.List;

@Slf4j
@RestController
public class MongoController {
    @Autowired
    MongoService service;
    @GetMapping("/jai")
    public List<Employee> jai() {
        return service.getAll();
    }

}
