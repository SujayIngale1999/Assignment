package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.Countryrepo;
import com.example.Demo.Service.Countryservice;
import com.example.Demo.model.Countries;
@Service
public class Countreserimpl implements Countryservice{

	@Autowired
	Countryrepo repo;
	@Override
	public void add(Countries countrie) {
		// TODO Auto-generated method stub
		repo.save(countrie);
	}

	@Override
	public List<Countries> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(Countries countrie) {
		// TODO Auto-generated method stub
		repo.save(countrie);
	}

}
