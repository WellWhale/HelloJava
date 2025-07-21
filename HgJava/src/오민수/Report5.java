package 오민수;

import java.util.Scanner;

public class Report5 {

	public static void main(String[] args) {
		
		//5번
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1. 화씨 => 섭씨");
			System.out.println("2. 섭씨 => 화씨");
			System.out.println("3. 종료");
			System.out.println("------------------");
			
			System.out.print("▶ 번호 선택: ");
			int inputNum = Integer.parseInt(sc.nextLine());
			
			switch(inputNum) {
			case 1:
				System.out.print("▶ 화씨 온도 입력: ");
				double wha = Double.parseDouble(sc.nextLine());
				System.out.println("섭씨온도: " +  (double)5/9*(wha-32));
				break;
			case 2:
				System.out.print("▶ 섭씨 온도 입력: ");
				double sub = Double.parseDouble(sc.nextLine());
				System.out.println("화씨온도: " + (double)9/5*sub+32);
				break;
			default:
				System.out.println("program end");
				run = false;
			}
		}
		
		sc.close();

	}

}
