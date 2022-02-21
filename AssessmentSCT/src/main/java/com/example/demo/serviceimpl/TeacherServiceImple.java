package com.example.demo.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;

@Service
public class TeacherServiceImple implements TeacherService{

	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public String deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository.delete(teacher);
		return "Deleted";
	}
	
	
	
	
}
