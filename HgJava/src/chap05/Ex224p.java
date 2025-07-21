package chap05;

import java.util.Scanner;

public class Ex224p {

	public static void main(String[] args) {
		// 223p~224p 6번 문제
		// if 말고 switch 쓸것
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i < studentNum; i++) {
					System.out.printf("scoers[%d]> ", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for(int score : scores) {
					if(max < score) max = score;
					sum += score;
				}
				System.out.printf("최고 점수: %d\n", max);
				System.out.printf("평균 점수: %f\n", (double)sum/scores.length);
				break;
			default:
				run = false;
			}
			
			
		}//while end

		System.out.println("프로그램 종료");
		
		
		
		sc.close();
	}//main end

}
