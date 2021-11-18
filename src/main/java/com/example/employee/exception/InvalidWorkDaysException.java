package com.example.employee.exception;

public class InvalidWorkDaysException extends Exception{
    public InvalidWorkDaysException(String errorMessage){
        super(errorMessage);
    }
}
