package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.Student;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService serv;
	@GetMapping("/showDetails")
	public List<Student> showDetails(){
		return serv.getDetails();
	}
	@PutMapping("/updateDetails")
	public Student updateDetail(@RequestBody Student s)
	{
		return serv.updateDetails(s);
	}
	@PostMapping("/addDetails")
	public Student addDetails(@RequestBody Student st)
	{
		return serv.postDetails(st);
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteDetail(@PathVariable("sid")int sid) {
		return serv.deleteDetails(sid);
	}

}
