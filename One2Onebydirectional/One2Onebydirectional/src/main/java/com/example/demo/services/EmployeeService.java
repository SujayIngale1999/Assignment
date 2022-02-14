package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
 
import com.example.demo.model.Employee;
 

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> listEmployee();
    public Employee updateEmployee(Employee employee);
    public String deleteEmployee(Employee employee);
}
