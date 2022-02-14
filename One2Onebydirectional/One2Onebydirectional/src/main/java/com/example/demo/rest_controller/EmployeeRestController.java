package com.example.demo.rest_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;
 
@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
    @Autowired(required = true)
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> findEmp() {
        return employeeService.listEmployee();
    }

    @PostMapping("/save")
    public Employee storeEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
