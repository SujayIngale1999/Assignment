package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.CountryCurrencyrepo;
import com.example.Demo.Service.CountryCurrencyservice;
import com.example.Demo.model.CountryCurrency;
@Service
public class Countrycurrencyserimpl implements CountryCurrencyservice {

	@Autowired
	CountryCurrencyrepo repo;
	@Override
	public void add(CountryCurrency CountryCurrency) {
		// TODO Auto-generated method stub
		repo.save(CountryCurrency);
	}

	@Override
	public List<CountryCurrency> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(CountryCurrency CountryCurrency) {
		// TODO Auto-generated method stub
		repo.save(CountryCurrency);
	}

}
