package chap01;

import java.util.Scanner;



public class Scanner117 {

	public static void main(String[] args) {
		// 통 문자열 읽어오기
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// Scanner 메소드 이용
		
		System.out.print("[필수 정보 입력]\n");
		
		System.out.print("1. 이름: ");
		String name = sc.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리: ");
		String idNum = sc.nextLine();
		
		System.out.println("3. 번화번호: ");
		String phone = sc.nextLine();
		
		
		
		//출력
		System.out.println();//줄 띄우기
		System.out.println("[입력된 내용]\n");
		
		System.out.println("1. 이름: " + name);
		
		System.out.println("2. 주민번호 앞 6자리: " + idNum);
		
		System.out.println("3. 전화번호: " + phone);
		
		
		
		//스캐너 종료
		sc.close();

	}

}
