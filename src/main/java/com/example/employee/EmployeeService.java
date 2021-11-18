package com.example.employee;

import com.example.employee.dto.Employee;
import com.example.employee.dto.HourlyEmployee;
import com.example.employee.dto.Manager;
import com.example.employee.dto.SalariedEmployee;
import com.example.employee.exception.InvalidVacationDaysException;
import com.example.employee.exception.InvalidWorkDaysException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public static List<Employee> employees = new ArrayList<>();

    public ResponseEntity work(int id, int workDays){
        try{
            employees.get(id).work(workDays);
        }catch (InvalidWorkDaysException ex){
            return new ResponseEntity("Invalid Work Days",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("WorkDays updated successfully",HttpStatus.OK);
    }

    public ResponseEntity takeVacation(int id, float vacationDays){
        try{
            employees.get(id).takeVacation(vacationDays);
        }catch (InvalidVacationDaysException ex){
            return new ResponseEntity("Invalid Vacation Days",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("Vacation granted successfully",HttpStatus.OK);
    }

    static void createData(){
        for(int i=0;i<10;i++){
            HourlyEmployee employee = new HourlyEmployee(getRandomString() ,i);
            employees.add(employee);
        }
        for(int i=10;i<20;i++){
            SalariedEmployee employee = new SalariedEmployee(getRandomString() ,i);
            employees.add(employee);
        }
        for(int i=20;i<30;i++){
            Manager employee = new Manager(getRandomString() ,i);
            employees.add(employee);
        }
    }

    static String getRandomString()
    {
        int n = 8;
        // chose a Character random from this String
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(characters.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(characters
                    .charAt(index));
        }
        return sb.toString();
    }
}

