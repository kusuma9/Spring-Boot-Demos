package com.kusuma.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentId;
	private String StudentName;
	private String StudentAddress;
	private String StudentPhone;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public Student(int studentId, String studentName, String studentAddress, String studentPhone) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
		StudentPhone = studentPhone;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ ", StudentPhone=" + StudentPhone + "]";
	}
}
