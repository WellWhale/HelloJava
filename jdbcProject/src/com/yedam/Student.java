package com.yedam;
// 속성 => 필드
// 기능 => 메서드
// 속성: 학생번호, 이름, 연락처, 혈액형
public class Student {
	//private 는 외부에서 직접 접촉 불가능
	private int stdNo;
	private String stdName;
	private String phone;
	private String bloodType;
	
	//생성자
	public Student() {}//기본 생성자
	
	public Student(int stdNo, String stdName, String phone, String bloodType) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.phone = phone;
		this.bloodType = bloodType;
	}
	
	//메소드(getter, setter)
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public int getStdNo() {
		return stdNo;
		
	}//end of stdNo
	
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdName() {
		return stdName;
	}//end of stdName
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}//end of phone
	
//	public String getBloodType() {
//		return bloodType;
//	}
//	public void setBloodType(String bloodType) {
//		this.bloodType = bloodType;
//	}우클릭 -> 소스 -> getters setters로 만든것
	
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getBloodType() {
		return bloodType;
	}//end of bloodType
	
	
	
	
	
}//end of class
