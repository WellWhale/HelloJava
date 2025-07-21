package chap04;

import java.util.Scanner;

public class Bank183p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//은행업무
		//잔고변수
		//실행제어 변수
		//업무1- 예금 2- 출금 3- 조회 4- 종료
		//종료가 될때까지 반복
		
		int balance = 0;
		boolean run = true;
		int money;
		int cMoney;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1:
				System.out.print("예금액> ");
				money = Integer.parseInt(sc.nextLine());
				balance += money;
				break;
				
			case 2:
				System.out.print("출금액> ");
				cMoney = Integer.parseInt(sc.nextLine());
				if(cMoney > balance) {
					System.out.printf("잔액이 부족합니다, 남은 잔액은 \"%d\" 입니다.\n", balance);
				} else {
					balance -= cMoney;
					System.out.printf("\"%d\" 원이 출금되었습니다.\n", cMoney);
				}
				break;
		
			case 3:
				System.out.printf("잔고는 \"%d\" 원 입니다.\n", balance);
				break;
			default:
				run = false;
			}
		}
		System.out.println("프로그램 종료");

		
		
		
		
		sc.close();
	}
}
