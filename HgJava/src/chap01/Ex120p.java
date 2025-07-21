package chap01;

import java.util.Scanner;

public class Ex120p {

	public static void main(String[] args) {
	//public 누구나 접근 가능
	//static 객체 안만들고 클래스로 바로 접근 가능(보통 new)
	//void 리턴값이 없다
		
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.print("이름: "+name+"\n");
		System.out.println("나이: "+age);
		System.out.printf("전화: %s-%s-%s\n\n", tel1, tel2, tel3);
		
		
		
		
		//스캐너 생성 ctrl+shift+o 로 import 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		int strNum1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두 번째 수: ");
		int strNum2 = Integer.parseInt(sc.nextLine());
		
		
		int result1 = strNum1 + strNum2;
		System.out.println(result1);
		
		//스캐너 다 썼으면 꼭 닫아야함
		sc.close();
		
		
		
		

	}// end main

}// end class
