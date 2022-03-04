package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.currenciesRepo;
import com.example.Demo.Service.Currenciesservice;
import com.example.Demo.model.Currencies;
@Service
public class Currenciesserimpl implements Currenciesservice{

	@Autowired
	currenciesRepo repo;
	@Override
	public void add(Currencies Currencies) {
		// TODO Auto-generated method stub
		repo.save(Currencies);
	}

	@Override
	public List<Currencies> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(Currencies Currencies) {
		// TODO Auto-generated method stub
		repo.save(Currencies);
	}

}
