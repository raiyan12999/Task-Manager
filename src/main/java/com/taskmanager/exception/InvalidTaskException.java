package com.taskmanager.exception;

public class InvalidTaskException extends RuntimeException{
    public InvalidTaskException(String message){
        super(message);
    }
}
