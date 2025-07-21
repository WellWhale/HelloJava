package chap01;

import java.util.Scanner;

public class Ex149p {

	public static void main(String[] args) {
		//p149
		//문제1
		
//		byte b = 5;
//		b = -b;
//		int result = 10 / b;
//		System.out.println(result);
		
		
		
		//문제2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		
		
		//문제3
		boolean stop = true;
		while (!(stop)) {
			System.out.println("false면 실행, true면 중지");
		}
		
		
		
		//문제4
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		
		
		
		//문제5
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double) var1 / var2;
//		int var4 = (int) (var3 * var2);
//		System.out.println(var4);
		
		
		
		//문제6, value / 100은 3이 나온다, 거기에 100을 곱해주면 300이 나온다
		int value = 356;
		System.out.println(value/100*100);
		
		
		
		//문제7
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == (float) 0.1) {//여기에 강제로 타입변경을 해준다, 0.1과 0.1f는 다르다
			System.out.println("10% 입니다");
		} else {
			System.out.println("10%가 아닙니다");
		}
		
		
		
		//문제8, 강제 형 변환으로 정수표기 말고 실수표기로 바꾼다
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * (double) height) / 2;
		System.out.println(area);
		
		
		
		//문제9
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double su1 = Double.parseDouble(sc.nextLine());
		System.out.print("두 번째 수: ");
		double su2 = Double.parseDouble(sc.nextLine());
		
		double gap = su1 / su2;
		
		if (su2 == 0 || su2 == 0.0) {
			System.out.println("결과: 무한대");
		} else {
			System.out.printf("결과: %f\n", gap);
		}
		
		
		
		//문제10
		int var11 = 10;
		int var22 = 3;
	    int var33 = 14;
		double var44 = var11 * var11 * Double.parseDouble(var22 + "." + var33);
		System.out.println("원의 넓이: "+var44);
		
		
		
		//문제11
		System.out.println("아이디: ");
		String uId = sc.nextLine();
		
		System.out.println("비밀번호: ");
		String uPw = sc.nextLine();
		int uPwNum = Integer.parseInt(uPw);
		
		if(uId.equals("java")) {
			if(uPwNum == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: PW오류");
			}
		} else {
			System.out.println("로그인 실패: ID오류");
		}
		
		
		
		
		
		
		//제출문제
		System.out.print("년도를 입력하세요: ");
		String yearDate = sc.nextLine();
		int yd = Integer.parseInt(yearDate);
		
		if(yd % 4 == 0) {
			if(yd % 100 == 0 && yd % 400 == 0) {
				System.out.println("윤년입니다.");
			} else if(yd % 100 != 0 && yd % 400 != 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("평년입니다.");
			}
		} else {
			System.out.println("평년입니다.");
		}
		
		sc.close();
		
	}

}
