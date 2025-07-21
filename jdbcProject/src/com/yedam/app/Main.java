package com.yedam.app;

import java.util.ArrayList;
import java.util.Scanner;

// 사용자 입력 -> DB반영
// DB결과 -> 콘솔출력
// 컨트롤 역할
public class Main {
	public static void main(String[] args) {
		boolean run = true; // 반복조건에 사용
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO();// BookDAO 징검다리 (조회)
		
		while(run) {
			System.out.println("도서 관리 시스템");
			System.out.println("1. 도서목록");
			System.out.println("2. 도서등록");
			System.out.println("3. 도서수정");
			System.out.println("4. 도서삭제");
			System.out.println("9. 종료");
			System.out.print("선택: ");
			int menu = scn.nextInt(); // 입력값을 memu 변수에 대입(할당)
			
			switch(menu) {
			case 1:
				ArrayList<Book> list = dao.findAll();//반환값이 ArrayList<Book>
				System.out.println("도서번호 도서명        저자       가격");
				System.out.println("===============================");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getId()+ " "
				                     + list.get(i).getTitle() + " "
				                     + list.get(i).getAuthor() + " "
				                     + list.get(i).getPrice());
				}
				break;
			case 2:
			case 3:
			case 4:
			case 9:
				run = false;
			}
		}
		
		System.out.println("end of program");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}//end main
}//end class






//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;


//		DBUtil util = new DBUtil();
//		Connection conn = util.getConnect();// DB 세션확보
//		conn.setAutoCommit(false);
//		try {
//			Statement stmt = conn.createStatement();// 쿼리해석 실행 -> 결과반영
//			int r = stmt.executeUpdate("insert into book(id, title, author) values(1010, '어린왕자', '김어린')");
//			System.out.println("처리된 건수: " + r);
//			if(r>0) {
//				conn.commit();//커밋
//			}
//			ResultSet rs = stmt.executeQuery("select * from book");
//			//반복문
//			while(rs.next()) {
//				System.out.println(rs.getInt("id") + rs.getString("title"));
//			}
//			System.out.println("end of data");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		