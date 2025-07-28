package com.yedam;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DBUtil;
import com.yedam.mapper.BookMapper;
import com.yedam.vo.Book;

public class BookControl {
	Scanner scn = new Scanner(System.in);
	SqlSession sqlSession = DBUtil.getInstance().openSession(true);
	BookMapper mapper = sqlSession.getMapper(BookMapper.class);

	public void exe() {
		boolean run = true;
		while (run) {
			System.out.println("도서정보관리");
			System.out.println("1. 도서목록");
			System.out.println("2. 도서등록");
			System.out.println("0. 이전메뉴");

			System.out.print("선택> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 목록
				bookList();
				break;
			case 2:// 등록
				addBook();
				break;
			case 0:
				return;
			default:
				System.out.println("메뉴를 선택하세요.");
			}
		}
	}// end exe();

	void bookList() {// 목록
		
		int page = 1;
		
		while(true) {
			List<Book> list = mapper.selectList(page);
			System.out.println(" 도서ID 도서제목 가격");
			System.out.println("===================");
			for (Book book : list) {
				System.out.println(book.showBrief());
			}
			System.out.print("이전(p) 다음(n) 선택> ");
			String p = scn.nextLine();
			if(p.equals("n")) {
				page++;
			} else if(p.equals("p")) {
				page--;
			} 
		}
		
//		bookSearch();// 상세조회
	}// end bookList

	void addBook() {// 등록
		System.out.println("도서ID 입력> ");
		String id = scn.nextLine();

		System.out.println("도서제목 입력> ");
		String title = scn.nextLine();

		System.out.println("도서저자 입력> ");
		String author = scn.nextLine();

		System.out.println("도서가격 입력> ");
		String price = scn.nextLine();

		Book book3 = new Book();
		book3.setId(Integer.parseInt(id));
		book3.setTitle(title);
		book3.setAuthor(author);
		book3.setPrice(Integer.parseInt(price));

		if (mapper.insertBook(book3) == 1) {
			sqlSession.commit(); // 커밋 처리
			System.out.println("성공");
		}
	}// end addBook

	void bookSearch() {// 상세조회
		while (true) {
			System.out.println("===========================");
			System.out.print("상세보기(ID입력), 취소(Q) 선택> ");
			// try 시도 하다가 예외가 생기면 catch 실행
			try {
				int bno = Integer.parseInt(scn.nextLine());
				Book book4 = mapper.selectBook(bno);

				if (book4 == null) {
					System.out.println("검색 결과가 없습니다.");
				} else {
					System.out.println(book4.showDetail());
					System.out.print("삭제 하시겠습니까? y/N> ");
					String flag = scn.nextLine();
					if (flag.equals("") || flag.equals("N")) {
						// 삭제안함, 아무행동 안함
						continue;
					}
					// 삭제기능
					if (mapper.deleteBook(bno) == 1) {
						System.out.println("삭제 성공");
						break;
					} 
					
				}

			} catch (NumberFormatException e) {
				return;
			}
		}
	}

}// end class
