package com.taskmanager.service;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public String getTaskMessage(){
        return "Task fetched from Service";
    }

    public String getWelcomeMessage(){
        return "Welcome from Task Manager";
    }
}
