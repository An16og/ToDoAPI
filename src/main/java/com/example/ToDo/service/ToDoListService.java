package com.example.ToDo.service;

import com.example.ToDo.entity.Task;
import com.example.ToDo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoListService {
    private final TaskRepository repo;

public ToDoListService(TaskRepository repo){
    this.repo=repo;
}

    public Task addTask(Task task) {
        return repo.save(task);
    }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public Optional<Task> getTaskById(String id){

         return repo.findById(id);

    }

    public Optional<Task> updateTask(String id, Task task){
        Optional<Task>t = repo.findById(id);
        if (t.isPresent()) {
            Task ta= t.get();
            ta.setTask(task.getTask());
            ta.setState(task.getState());
           return Optional.of(repo.save(ta));

        }
        return Optional.empty();
    }

    public Task deleteTask(String id){
        Optional<Task> task=repo.findById(id);
        if(task.isPresent()){
            repo.deleteById(id);
            return task.get();

        }
        return null;
    }


}