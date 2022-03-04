package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Exam;

public interface Examservice {

	public void storedata(Exam exam);
	public List<Exam> fetchdata();
	public void delete(int id);
	public void updatedata(Exam exam);
}
