package com.yedam;

import java.util.ArrayList;

public class ListExe {
	public static void main(String[] args) {
		// ArrayList 클래스. vs. 배열
		
		int[] intAry = {10, 20, 30};
		for(int i = 0; i < intAry.length; i++) {
			System.out.println("[" + i + "]번째 값 =>" + intAry[i]);
		}
		
		
		// 정수를 담을 수 있는 리스트, Scanner 처럼 이미 있는 클래스
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // 추가
		list.add(20); // 더 추가
		list.add(30); // 하나 더 추가
		//ArratList는 클래스라서 메서드를 소환해야됨
		for(int i = 0; i < list.size(); i++) {// length 가 아니고 size()
			System.out.println("[" + i + "]번째 값 =>" + list.get(i));// get() 호출
		}
		
		// 학생정보
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student s1 = new Student();// 인스턴스
		stdList.add(s1); //정상작동
		s1.setStdNo(1000);
		s1.setStdName("김민식");
		s1.setPhone("010-123-1234");
		s1.setBloodType("A형");
		
		Student s2= new Student(2000, "최민정", "010-234-2345", "B형");
		stdList.add(s2);
		
		stdList.add(new Student(3000, "최우식", "010-567-5678", "AB형"));
		
		for(int i = 0; i < stdList.size(); i++) {
			System.out.println("학번: " + stdList.get(i).getStdNo() + " 이름: " + stdList.get(i).getStdName());
		}
		
		
//		stdList.add(10); 오류
		
		System.out.println("end of program");
		
	}//end main

}//end class
