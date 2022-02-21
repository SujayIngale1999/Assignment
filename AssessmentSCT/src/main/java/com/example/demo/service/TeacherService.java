package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Teacher;


public interface TeacherService {

	public List<Teacher> getAllTeacher();

	public Teacher saveTeacher(Teacher teacher);

	public String deleteTeacher(Teacher teacher);
}