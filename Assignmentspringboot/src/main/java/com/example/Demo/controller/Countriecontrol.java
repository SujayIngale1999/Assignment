package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Serviceimpl.Countreserimpl;
import com.example.Demo.model.Countries;

@RestController
public class Countriecontrol {

	@Autowired
	Countreserimpl impl;
	
	@PostMapping("/scount")
	public void addcou(@RequestBody Countries countries)
	{
		impl.add(countries);
	}
	
	@GetMapping("/fcount")
	public List<Countries> fdata()
	{
		return impl.show();
	}
	@DeleteMapping("/delm{id}")
	public void elem(@PathVariable int id)
	{
		impl.delete(id);
		}
	
	@PutMapping("/upd")
	public void updatee(@RequestBody Countries countries)
	{
		impl.add(countries);
	}
}
