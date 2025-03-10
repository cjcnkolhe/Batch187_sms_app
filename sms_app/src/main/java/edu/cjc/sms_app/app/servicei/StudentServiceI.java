package edu.cjc.sms_app.app.servicei;

import java.util.List;

import edu.cjc.sms_app.app.model.Student;

public interface StudentServiceI {

	public void saveStudent(Student s);
	public List<Student> getAllStudents();
	public List<Student> getBatchStudent(String batchNumber);
	public void removeStudent(int rollno);
	public Student getSingleStudent(int rollno);
	public void payFees(int rollno, double ammount);
	public void updateBatch(int rollno, String batchNumber);
}
