package 오민수;

import java.util.Scanner;

public class Report2 {

	public static void main(String[] args) {
		//2번
		Scanner sc = new Scanner(System.in);
		System.out.print("교환할 금액을 입력하시오: ");
		int money = Integer.parseInt(sc.nextLine());
		int cMoney = 0;
		
		System.out.println("500원 짜리: " + money/500 + "개");
		cMoney += (money/500)*500;
		System.out.println("100원 짜리: " + (money%500)/100 + "개");
		cMoney += ((money%500)/100)*100;
		System.out.println("50원  짜리: " + (money%100)/50 + "개");
		cMoney += ((money%100)/50)*50;
		System.out.println("10원  짜리: " + (money%50)/10 + "개");
		cMoney += ((money%50)/10)*10;
		System.out.println("교환금액   : " + cMoney + "원");
		System.out.println("남은금액   : " + (money%10)/1 + "원");
		
		sc.close();

	}

}
