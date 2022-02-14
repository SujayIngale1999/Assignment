package com.example.demo.rest_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.Employee;
import com.example.demo.model.Laptop;
import com.example.demo.services.LaptopService;
 
@RestController
@RequestMapping("/laptop")
public class LaptopRestController {
	@Autowired(required = true)
    private LaptopService laptopService;

    @GetMapping("/all")
    public List<Laptop> findLaptop() {
        return laptopService.listLaptop();
    }

    @PostMapping("/save")
    public Laptop storeLaptop(@RequestBody Laptop laptop) {
        return laptopService.saveLaptop(laptop);
    }
}
