package 오민수;

import java.util.Scanner;

public class Report6 {

	public static void main(String[] args) {

		//6번
		Scanner sc = new Scanner(System.in);
		
	    boolean runTwo = true;
		
		while(runTwo) {
			int randomNum = (int)(Math.random() *3);
			
			System.out.print("가위(0) 바위(1) 보(2) 중 하나 숫자입력: ");
			int myNum = Integer.parseInt(sc.nextLine());
			
			if(myNum > 2) {
				System.out.println("game over");
				runTwo = false;
			} else if ((myNum+1)%3 == randomNum) {
				System.out.printf("유저는 %d 컴퓨터는 %d, 컴퓨터 승리\n", myNum, randomNum);
			} else if (myNum == (randomNum+1)%3) {
				System.out.printf("유저는 %d 컴퓨터는 %d, 유저 승리\n", myNum, randomNum);
			} else {
				System.out.printf("유저는 %d 컴퓨터는 %d, 무승부\n", myNum, randomNum);
			}
		}
		System.out.println("가위바위보 게임 종료");
		
		sc.close();

		
	}// end
}
