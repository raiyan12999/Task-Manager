package com.taskmanager.service;

import com.taskmanager.exception.InvalidTaskException;
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
        if(task == null || task.getTitle() == null || task.getTitle().trim().isEmpty()){
            throw new InvalidTaskException("Task title cannot be empty");
        }
        return new Task(task.getId(), task.getTitle(), task.getDescription(), task.isCompleted());
    }
}
