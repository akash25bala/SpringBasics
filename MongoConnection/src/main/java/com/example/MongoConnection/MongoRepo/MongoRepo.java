package com.example.MongoConnection.MongoRepo;

import com.example.MongoConnection.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository <Employee,Integer>{

}
