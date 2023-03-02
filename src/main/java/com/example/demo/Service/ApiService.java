package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo stRepo;
	public Student updateDetails(Student en) {
		return stRepo.saveAndFlush(en);
	}
	public String deleteDetails(int id) {
		stRepo.deleteById(id); 
	return "Deleted details";
	}
	public Student postDetails(Student e) {
		return stRepo.save(e);
	}
	public List<Student> getDetails(){
		return stRepo.findAll();
	}
	
}