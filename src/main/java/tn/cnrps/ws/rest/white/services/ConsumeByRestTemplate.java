package tn.cnrps.ws.rest.white.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import tn.cnrps.ws.rest.white.models.Student;


public class ConsumeByRestTemplate implements ConsumeService {
	
	private RestTemplate restTemplate = new RestTemplate();
	private final static String URL= "http://localhost:8080/api/students";

	@Override
	public List<Student> getStudents() {
		
		ResponseEntity<Student[]> resp = restTemplate.getForEntity(URL, Student[].class);
		return Arrays.asList(resp.getBody());
	}

	@Override
	public Student addStudent(Student std) {
		
		return restTemplate.postForObject(URL, std, Student.class);
	}

}
