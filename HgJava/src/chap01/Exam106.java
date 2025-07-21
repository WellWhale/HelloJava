package chap01;

import java.io.IOException;

public class Exam106 {

	public static void main(String[] args) throws IOException {
		// 문자열 => 숫자
		String str = "10";
		String str2 = "2.14";
		String str3 = "true";
		
		boolean str3B = Boolean.parseBoolean(str3);
		if (str3B) {
			System.out.println("타입 변경 성공");
		} else {
			System.out.println("타입 변경 실패");
		}
		
		int strInt = Integer.parseInt(str);
		//int str2Double = Integer.parseInt(str2); 타입 오류
		double str2Double = Double.parseDouble(str2);// 타입 변경 성공
		
		System.out.println(strInt + str2Double);
		System.out.println(str + str2);
		// 타입 변경할때 주의할것
		
		
		
		//p109 Q.5 // 연산하면 다 int데이터로 바뀐다
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
		
		
		
		//p109 Q.7
		int x = 5;
		int y = 2;
		double result = x / y;
		System.out.println(result);
		
//		double x = 5.0;
//		double y = 2.0;
//		double result = x / y;
//		System.out.println(result);
		
		
		
		//p110 Q.9
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int resultTwo = (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(resultTwo);
		//
		System.out.printf("결과는 %d\n", resultTwo);
		System.out.printf("%d + %.1f + %4.2f + %s = %d\n", var1, var2, var3, var4, resultTwo);
		
		
		//표준 입력장치로 Key값(유니코드) 입력 받음
//		try {
//			while(true) {
//				int keyCode;
//				System.out.print("문자를 입력 하세요 : ");
//				while(true) {
//					keyCode = System.in.read();
//					System.out.println(keyCode);
//					if(keyCode == 10) {
//						break;
//					}
//					if(keyCode == 113) {
//						break;
//			    	}
//				}
//				if(keyCode == 113) {
//					System.out.println("종료");
//					break;
//		    	}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("입력오류 발생");
//		}
		
		
		//표준 입력장치로 Key값(유니코드) 입력 받음2
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println(keyCode);
			if (keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");
	}// end main

}// end class
