package 오민수;

import java.util.Scanner;

public class Report3 {

	public static void main(String[] args) {
		//3번
		Scanner sc = new Scanner(System.in);
		int ranNum = (int)(Math.random() *100) +1;
		
		while(true) {
			System.out.print("숫자 입력: ");
			int guess = Integer.parseInt(sc.nextLine());
			
			if(ranNum == guess) {
				System.out.println("축하합니다.");
				break;
			} else if(ranNum > guess) {
				System.out.println("up하세요.");
			} else if(ranNum < guess) {
				System.out.println("down하세요.");
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		sc.close();

	}

}
