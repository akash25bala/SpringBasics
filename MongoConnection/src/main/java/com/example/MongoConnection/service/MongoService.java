package com.example.MongoConnection.service;

import com.example.MongoConnection.Model.Employee;
import com.example.MongoConnection.MongoRepo.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {
    @Autowired
    MongoRepo mongoRepo;
public List<Employee> getAll(){
    return mongoRepo.findAll();
}
}
