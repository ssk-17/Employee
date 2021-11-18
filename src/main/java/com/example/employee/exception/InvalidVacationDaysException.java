package com.example.employee.exception;

public class InvalidVacationDaysException extends Exception{
    public InvalidVacationDaysException(String errorMessage){
        super(errorMessage);
    }
}
