package com.example.MongoConnection.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Document("Employee")
public class Employee {

    @Id
    private String id;
   private String name;
   private String dept;
   private String designation;
}
