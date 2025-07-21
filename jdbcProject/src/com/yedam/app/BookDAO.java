package com.yedam.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//조회, 등록, 수정, 삭제
public class BookDAO {
	//메소드
	
	//수정, 매개값(int bno, int price), 반환값(boolean)
	public boolean update(int bno, int price) {
		Connection conn = DBUtil.getConnect();//커넥션은 꼭 있어야됨
		String query = "update book "
				+ "set price = ? "
				+ "where id = ?";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, price);//첫번째 ? 지정
			stmt.setInt(2, bno);
			int r = stmt.executeUpdate(); // 실행된 쿼리의 결과 count 반환
			if(r>0) {//한건 입력되면...
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	//등록, 매개값(Book), 반환값(boolean)
	public boolean insert(Book book) {
		Connection conn = DBUtil.getConnect();//커넥션은 꼭 있어야됨
		String query = "insert into book (id, title, author, price)"
				+ "values(?,?,?,?)";
		System.out.println(query);
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, book.getId());//첫번째 ? 지정
			stmt.setString(2, book.getTitle());
			stmt.setString(3, book.getAuthor());
			stmt.setInt(4, book.getPrice());
			
			int r = stmt.executeUpdate(); // 실행된 쿼리의 결과 count 반환
			if(r>0) {//한건 입력되면...
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	//목록조회(다건)
	public ArrayList<Book> findAll() {
		Connection conn = DBUtil.getConnect();
		ArrayList<Book> list = new ArrayList<Book>();// 컬렉션(Book)
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			//반복
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));// id -> id 필드에 할당
				book.setTitle(rs.getString("title"));// title -> title 필드
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				//컬렉션에 추가
				list.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}//end of findAll()

}
