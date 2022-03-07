package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import com.example.demo.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceimpl;
	
	@PostMapping("/addrecord")
	public void saveda(@RequestBody Product product)
	{
		productServiceimpl.savedata(product);
	}
	
	@GetMapping("/showdata")
	public List<Product> shdata()
	{
		return productServiceimpl.fetchdata();
	}
	
	@PutMapping("/update")
	public void updata(@RequestBody Product product)
	{
		productServiceimpl.updatedata(product);
	}
	
	@DeleteMapping("/{id}")
	public void deledata(@PathVariable int id)
	{
		productServiceimpl.delete(id);
	}
}
