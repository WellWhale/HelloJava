package chap06_1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData bookdata = new BookData();
		Book[] books = null;
		boolean run = true;
		int min = 100;
		int max = 0;
		double sum = 0;
		int bookSu = 0;
		
		while(run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.도서수 입력 | 2.도서정보 등록 | 3.도서정보 전체조회 | 4.도서정보 분석 | 5.종료");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택: ");
			int choiNum = Integer.parseInt(sc.nextLine());
			
			switch(choiNum) {
			case 1:
				System.out.print("도서 수: ");
				bookSu = Integer.parseInt(sc.nextLine());
				break;
			case 2:
			    books = bookdata.bookData(bookSu);
				break;
			case 3:
				for(int j = 0; j < bookSu; j++) {
					System.out.printf("도서번호: %d 가격: %d원\n", books[j].getBookNum(), books[j].getBookPry());
				}
				break;
			case 4:// 프라이빗인 class는 get으로 받아왔음
				for(int p = 0; p < bookSu; p++) {
					if(books[p].getBookPry() < min) min = books[p].getBookPry();
					if(books[p].getBookPry() > max) max = books[p].getBookPry();
					sum += books[p].getBookPry();
				}
				System.out.printf("최고 가격: %d원\n", max);
				System.out.printf("최저 가격: %d원\n", min);
				System.out.printf("평균 가격은 %.1f원 입니다.\n", sum/bookSu);
				break;
			default:
				System.out.println("프로그램 종료");
				run = false;
			}

		}//end while
		
		sc.close();
	}//end main
	
}//end class
