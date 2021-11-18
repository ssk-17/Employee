package com.example.employee.dto;

import com.example.employee.exception.InvalidWorkDaysException;

public class SalariedEmployee extends Employee{

    public SalariedEmployee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    @Override
    public void work(int workDays) throws InvalidWorkDaysException {
        super.work(workDays);
        this.vacationDays = 15.0f;
    }

//    @Override
//    public void takeVacation(float vacDays) throws InvalidVacationDaysException {
//
//    }
}
