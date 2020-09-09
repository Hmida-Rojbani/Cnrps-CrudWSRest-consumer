package tn.cnrps.ws.rest.white.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tn.cnrps.ws.rest.white.models.Student;

@FeignClient(url = "http://localhost:8080/api/students", name ="StudentConsumer")
public interface FeigntClient {
	
	@GetMapping()
	public List<Student> getAllStudent();
	
	@PostMapping
	public Student saveStudent(Student std);

}
