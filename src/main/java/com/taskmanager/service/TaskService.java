package com.taskmanager.service;

import org.springframework.stereotype.Service;
import com.taskmanager.model.Task;

@Service
public class TaskService {
    public String getTaskMessage(){
        return "Tasks fetched from Service";
    }

    public String getWelcomeMessage(){
        return "Welcome from Task Manager";
    }

    public Task createTask(Task task){
        // Simulate saving Task

        return new Task(task.getId(), task.getTitle(), task.getDescription(), task.isCompleted());
    }
}
