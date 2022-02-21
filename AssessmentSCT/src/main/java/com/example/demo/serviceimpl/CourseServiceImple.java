package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;

@Service
public class CourseServiceImple implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public String deleteCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.delete(course);
		return "Deleted";
	}

}