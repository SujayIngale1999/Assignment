package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	public void savedata(Product product);
	public List<Product> fetchdata();
	public void updatedata(Product product);
	public void delete(int id);
}
