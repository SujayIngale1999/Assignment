package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;
 
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
 
    @Override
    public Employee saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepository.save(employee);
    }
 
    @Override
    public List<Employee> listEmployee() {
        // TODO Auto-generated method stub
        return employeeRepository.findAll();
    }
 
    @Override
    public Employee updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public String deleteEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }
 
}
