package tn.cnrps.ws.rest.white.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cnrps.ws.rest.white.models.Student;

@Service
public class ConsumeByFeign implements ConsumeService {
	
	@Autowired
	private FeigntClient client;

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return client.getAllStudent();
	}

	@Override
	public Student addStudent(Student std) {
		// TODO Auto-generated method stub
		return client.saveStudent(std);
	}

}
