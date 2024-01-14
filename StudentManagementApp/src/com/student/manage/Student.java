package com.student.manage;

public class Student {
	
	private int studentId;
	private String studenName;
	private String studentPhone;
	private String studentCity;
	
	public Student(int studentId, String studenName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studenName = studenName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	
	public Student(String studenName, String studentPhone, String studentCity) {
		super();
		this.studenName = studenName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudenName() {
		return studenName;
	}

	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studenName=" + studenName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	 
}
