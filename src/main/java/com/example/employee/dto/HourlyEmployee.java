package com.example.employee.dto;

import com.example.employee.exception.InvalidWorkDaysException;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public void work(int workDays) throws InvalidWorkDaysException {
        super.work(workDays);
        this.vacationDays = 10.0F;
    }

//    @Override
//    public void takeVacation(float vacDays) throws InvalidVacationDaysException {
//        super.takeVacation(vacDays);
//
//    }
}
