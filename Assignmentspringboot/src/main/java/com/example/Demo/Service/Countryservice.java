package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.model.Countries;


public interface Countryservice {
	public void add(Countries countrie );
	public List<Countries > show();
	public void delete(int id);
	public void update(Countries countrie);

}
