package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studId;
	private String studName;
	public Long getStudId() {
		return studId;
	}
	public void setStudId(Long studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studId, studName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studId, other.studId) && Objects.equals(studName, other.studName);
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	public Student(Long studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	public Student() {
		super();
	}
	
	
}
