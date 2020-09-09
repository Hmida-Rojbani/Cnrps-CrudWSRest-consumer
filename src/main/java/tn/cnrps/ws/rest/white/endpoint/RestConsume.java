package tn.cnrps.ws.rest.white.endpoint;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.cnrps.ws.rest.white.models.Student;
import tn.cnrps.ws.rest.white.services.ConsumeService;

@RestController
@RequestMapping("/test")
public class RestConsume {
	
	@Autowired
	private ConsumeService service;
	
	@GetMapping()
	public List<Student> getStudents() {
		return service.getStudents();
	}
	
	@PostMapping()
	public Student createStudent(@RequestBody Student std) {
		return service.addStudent(std);
	}

}
