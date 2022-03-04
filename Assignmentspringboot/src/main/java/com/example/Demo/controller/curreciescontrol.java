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

import com.example.Demo.Serviceimpl.Currenciesserimpl;
import com.example.Demo.model.Currencies;

@RestController
public class curreciescontrol {

	@Autowired
	Currenciesserimpl impl;
	@PostMapping("/std")
	public void addd(@RequestBody Currencies currencies)
	{
		impl.add(currencies);
	}
	@GetMapping("/load")
	public List<Currencies> load()
	{
		return impl.show();
	}
	@DeleteMapping("dele{id}")
	public void delet(@PathVariable int id)
	{
		impl.delete(id);
	}
	@PutMapping("/up")
	public void updt(@RequestBody Currencies Currencies )
	{
		impl.add(Currencies);
	}
}
