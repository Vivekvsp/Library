package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String stuedentPhone;
	private String studentCity;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStuedentPhone() {
		return stuedentPhone;
	}

	public void setStuedentPhone(String stuedentPhone) {
		this.stuedentPhone = stuedentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student(int studentId, String studentName, String stuedentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stuedentPhone = stuedentPhone;
		this.studentCity = studentCity;
	}

	public Student(String studentName, String stuedentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.stuedentPhone = stuedentPhone;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", stuedentPhone=" + stuedentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
}
