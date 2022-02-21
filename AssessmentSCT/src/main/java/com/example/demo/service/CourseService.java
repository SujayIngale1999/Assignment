package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {

	public List<Course> getAllCourse();

	public Course saveCourse(Course course);

	public String deleteCourse(Course course);
}