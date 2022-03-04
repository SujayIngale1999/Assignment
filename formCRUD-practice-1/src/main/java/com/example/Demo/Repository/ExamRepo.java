package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Exam;
@Repository
public interface ExamRepo extends JpaRepository<Exam, Integer> {

}
