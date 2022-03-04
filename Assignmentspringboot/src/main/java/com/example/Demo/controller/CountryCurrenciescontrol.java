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

import com.example.Demo.Serviceimpl.Countrycurrencyserimpl;
import com.example.Demo.model.CountryCurrency;

@RestController
public class CountryCurrenciescontrol {

	@Autowired
	Countrycurrencyserimpl impl;
	@PostMapping("/store")
	public void store(@RequestBody CountryCurrency countryCurrency)
	{
		impl.add(countryCurrency);
	}
	@GetMapping("/fetch")
	public List<CountryCurrency> display()
	{
		return impl.show();
	}
	@DeleteMapping("/del{id}")
	public void dele(@PathVariable int id)
	{
		impl.delete(id);
	}
	@PutMapping("/update")
	public void storeu(@RequestBody CountryCurrency countryCurrency)
	{
		impl.add(countryCurrency);
	}
	
}
