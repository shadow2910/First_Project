package com.cg.mvm.jpa_demo.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="stud_no")
	int studentId;
	@Column(name="stud_name")
	String name;
	@Column(name="stud_mobile")
	long mobile;
	@Column(name="stud_add")
	String address;
	@ManyToMany
	@JoinTable(name="student_course_reg",joinColumns= {@JoinColumn(name="stud_no")},inverseJoinColumns= {@JoinColumn(name="course_id")})
	List<Course> courses;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String name, long mobile, String address, List<Course> courses) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.courses = courses;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", mobile=" + mobile + ", address=" + address
				+ "]";
	}
	

}
