package com.example.ToDo.service;

import com.example.ToDo.Task;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoListService {
    private ArrayList<Task> list = new ArrayList<>();
    private int count = 1;


    public Task addTask(@NonNull Task task) {
        task.setId(this.count);
        list.add(task);
        count++;
        return task;
    }

    public ArrayList<Task> getAllTasks(){
        return list;
    }

    public Task getTaskById(int id){
        return list.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);

    }

    public Task updateTask(int id, Task task){
        Task t = getTaskById(id);
        if (t != null) {
            t.setTask(task.getTask());
            t.setState(task.getState());
        }
        return t;
    }

    public Task deleteTask(int id){
        Task t = getTaskById(id);
        if(t != null) list.remove(t);
        return t;
    }


}