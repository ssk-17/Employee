package com.example.employee.dto;

import com.example.employee.exception.InvalidVacationDaysException;
import com.example.employee.exception.InvalidWorkDaysException;

public class Employee {
    private static int MAX_WORK_DAYS = 260;
    protected String name;
    protected int employeeId;
    protected float vacationDays;
    private int workDays;

    public void work(int workDays) throws InvalidWorkDaysException {
        if (workDays > MAX_WORK_DAYS)
            throw new InvalidWorkDaysException("work days cannot exceed:" + MAX_WORK_DAYS);
        this.workDays = workDays;
    }

    public void takeVacation(float vacDays) throws InvalidVacationDaysException {
        if (vacDays > getVacationDays())
            throw new InvalidVacationDaysException("Vacation Days requested exceeded available vacation days");
        this.vacationDays = this.getVacationDays() - vacDays;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public float getVacationDays() {
        return vacationDays;
    }

    public int getWorkDays() {
        return workDays;
    }
}
