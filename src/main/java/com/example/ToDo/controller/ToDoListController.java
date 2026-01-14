package com.example.ToDo.controller;

import com.example.ToDo.entity.Task;
import com.example.ToDo.service.ToDoListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoListController {

    private final ToDoListService service;

    public ToDoListController(ToDoListService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {
        return service.getTaskById(id);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return service.addTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
        return service.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public Task deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }
}
