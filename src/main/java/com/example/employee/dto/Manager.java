package com.example.employee.dto;

import com.example.employee.exception.InvalidWorkDaysException;

public class Manager extends SalariedEmployee {

    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void work(int workDays) throws InvalidWorkDaysException {
        super.work(workDays);
        this.vacationDays = 30.0f;
    }

//    @Override
//    public void takeVacation(float vacDays) throws InvalidVacationDaysException {
//
//    }
}
