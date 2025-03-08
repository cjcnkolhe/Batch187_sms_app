package edu.cjc.sms_app.app.servicei;

import java.util.List;

import edu.cjc.sms_app.app.model.Student;

public interface StudentServiceI {

	public void saveStudent(Student s);
	public List<Student> getAllStudents();
	public List<Student> getBatchStudent(String batchNumber);
}
