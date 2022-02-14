package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
 
import com.example.demo.model.Employee;
import com.example.demo.model.Laptop;
 

public interface LaptopService {
    public Laptop saveLaptop(Laptop laptop);
    public List<Laptop> listLaptop();
    public Laptop updateLaptop(Laptop laptop);
    public String deleteLaptop(Laptop laptop);
}
