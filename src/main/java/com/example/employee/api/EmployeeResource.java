package com.example.employee.api;

import com.example.employee.EmployeeService;
import com.example.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService service;

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable int id) {
        return EmployeeService.employees.get(id);
    }

    @PostMapping("{id}/work")
    public ResponseEntity work(@PathVariable int id, @RequestParam int workDays) {
        if (id >= EmployeeService.employees.size()) return new ResponseEntity("Invalid ID", HttpStatus.BAD_REQUEST);
        return service.work(id, workDays);
    }

    @PostMapping("{id}/vacation")
    public ResponseEntity takeVacation(@PathVariable int id, @RequestParam float vacationDays) {
        if (id >= EmployeeService.employees.size()) return new ResponseEntity("Invalid ID", HttpStatus.BAD_REQUEST);
        return service.takeVacation(id, vacationDays);
    }
}
