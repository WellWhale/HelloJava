package chap04;

public class Exam162 {

	public static void main(String[] args) {
		// 주사위 게임
		// 주사위를 2개 던져서 합이 10을 넘으면 두 수를 더하고 / 덧셈 결과
		// 아니면 두 수를 곱한 결과를 출력 / 곱셈 결과
		
		int num1 = (int)(Math.random() *6) +1;
		int num2 = (int)(Math.random() *6) +1;
		int hap = num1 + num2;
		
		if(hap > 10 && hap < 13) {
			System.out.print(num1+"+"+num2+" 덧셈결과: "+hap+"\n\n");
		} else {
			System.out.printf("%dx%d 곱셈결과: %d\n\n", num1, num2, num1*num2);
		}
		
		
		
		
		//오전시간(9~12) 일정 출력
		//현재 시간 확인
		//9 - 출근합니다
		//10 - 회의합니다
		//11 - 업무봅니다
		//12 - 외근을 나갑니다
		
		int time = (int)(Math.random() *4) +9;
		System.out.println("현재 시간: "+time+"시");
		
		switch(time) {
		  case 9:
			  System.out.println("출근합니다.");
		  
		  case 10:
			  System.out.println("회의합니다.");
			  
		  case 11:
			  System.out.println("업무봅니다.");
			  
		  default:
			  System.out.println("외근갑니다.");
		}
		System.out.println("switch 나옴\n\n");
		
		
		
		
		
		//169p Switch로 변환
		int score = 85;
		System.out.print("등급은 ");
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.print("\"A\"");
			break;
		
		case 8:
			System.out.print("\"B\"");
			break;
		
		case 7:
			System.out.print("\"C\"");
			break;
		
		default:
			System.out.print("\"D\"");
			break;
		}
		System.out.println(" 입니다.\n\n");
		
		
		
		
		
		//주사위 게임2
		//주사위 2개를 던져서 합이 10이 되면 탈출
			//주사위 순서쌍 출력 (5,2)
		//5회이상 실행되면 게임오버
		
		for(int i = 1;i <= 5;i++) {
			int numO = (int)(Math.random() *6) +1;
			int numT = (int)(Math.random() *6) +1;
			int happ = numO+numT;
			
			System.out.printf("%d+%d = %d\n", numO, numT, happ);
			
			if(happ == 10) {
				System.out.print("탈출성공\n");
				System.out.print(i+"번째에 성공하였습니다.\n\n");
				break;
			} else if(happ != 10 && i == 5) {
				System.out.println("게임오버\n\n");
			}
		}
		
		
		
		
		//반복문
		int i;
		for(i = 1; i <= 5; i++) {
			System.out.println(" i = " + i);
		}
		System.out.println("탈출 i = " + (i-1) + " 까지");
		//i <= 5를 하면 탈출 후 i는 6이 된다
		
		
		
		
		
		
	}// main end

}// class end
