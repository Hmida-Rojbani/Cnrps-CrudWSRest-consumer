package tn.cnrps.ws.rest.white.services;

import java.util.List;

import tn.cnrps.ws.rest.white.models.Student;

public interface ConsumeService {

	List<Student> getStudents();

	Student addStudent(Student std);

}
