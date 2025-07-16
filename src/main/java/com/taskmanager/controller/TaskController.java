package com.taskmanager.controller;

import com.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(){
        return taskService.getWelcomeMessage();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Task Manager!";
    }

}
