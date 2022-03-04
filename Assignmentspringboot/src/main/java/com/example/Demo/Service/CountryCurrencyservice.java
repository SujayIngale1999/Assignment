package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.model.CountryCurrency;

public interface CountryCurrencyservice {

	public void add(CountryCurrency CountryCurrency);
	public List<CountryCurrency> show( );
	public void delete(int id);
	public void update(CountryCurrency CountryCurrency);
}

