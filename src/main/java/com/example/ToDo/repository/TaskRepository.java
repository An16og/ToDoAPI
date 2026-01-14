package com.example.ToDo.repository;

import com.example.ToDo.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task,String> {

}
