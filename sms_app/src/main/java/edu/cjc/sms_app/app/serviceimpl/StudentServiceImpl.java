package edu.cjc.sms_app.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms_app.app.model.Student;
import edu.cjc.sms_app.app.repositary.StudentRepositary;
import edu.cjc.sms_app.app.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepositary sr;
	
	@Override
	public void saveStudent(Student s) {

		sr.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) sr.findAll();
	}

	@Override
	public List<Student> getBatchStudent(String batchNumber) {
		return sr.findAllByBatchNumber(batchNumber);
	}

	@Override
	public void removeStudent(int rollno) {
		sr.deleteById(rollno);
		
	}

	@Override
	public Student getSingleStudent(int rollno) {
		       Student s=sr.findById(rollno).get();
		return s;
	}

	@Override
	public void payFees(int rollno, double ammount) {
                   Student s=sr.findById(rollno).get();
                    s.setFeesPaid(s.getFeesPaid()+ammount);
                    sr.save(s);
	}

	@Override
	public void updateBatch(int rollno, String batchNumber) {
		 Student s=sr.findById(rollno).get();
         s.setBatchNumber(batchNumber);
         sr.save(s);
	}

}
