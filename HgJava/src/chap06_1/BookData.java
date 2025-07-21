package chap06_1;

import java.util.Scanner;

public class BookData {
	Scanner sc = new Scanner(System.in);
	
	//메소드
	Book[] bookData(int n) {
		Book[] bLis = new Book[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%d번째 도서 정보 입력\n", i+1);
			System.out.print("도서번호> ");
			int bNum = Integer.parseInt(sc.nextLine());
			
			System.out.print("도서제목: ");
			String bName = sc.nextLine();
			
			System.out.print("도서가격: ");
			int bPry = Integer.parseInt(sc.nextLine());
			
			bLis[i] = new Book(bNum, bName, bPry);
		}
		return bLis;
	}
}//end
